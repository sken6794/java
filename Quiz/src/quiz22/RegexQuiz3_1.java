
package quiz22;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class RegexQuiz3_1 {
	public static void main(String[] args) { //강사님 버전

		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어온다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 패턴 분석하여
		 * 	product객체에 저장하고 리스트에 저장
		 * 3. 외부라이브러리 (POI)라이브러리 - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 엑셀 파일로 추출  - 하나의 시트에 각 행데이터를 엑셀파일로 출력
		 */

		String path = "C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\건담.txt";



		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String str;
			while((str=br.readLine())!=null) {
				String pattern ="[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
				String pattern2 ="[가-힣]+ [가-힣]+(점|)";
				String pattern3 = "\\[[가-힣A-Z]+\\]";
				String pattern4 = "\\d+,*\\d+원";

				Matcher m = Pattern.compile(pattern).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);

				if(m.find() && m2.find() && m3.find() && m4.find()) {
					System.out.println("===========================================");
					String day = m.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = str.substring(m3.end(), m4.start()).trim();
					String price = m4.group();

					//1행을 Product객체에 저장
					Product p = new Product(day, store, grade, detail, price);
					//product를 리스트에
					list.add(p);
				}
			}

			//엑셀 쓰기 호출
			createExcel(list);

		} catch (Exception e) {
			e.printStackTrace();
		}


	}


	public static void createExcel(List<Product> list) {//제네릭 타입 생략해도 됨
		//워크북 생성
		XSSFWorkbook workbook = new XSSFWorkbook();
		//시트 생성
		XSSFSheet sheet = workbook.createSheet();
		//시트안에 행 생성
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		//리스트를 엑셀파일에 반복해서 
		for (int i = 0; i < list.size(); i++) {
			
			XSSFRow row = sheet.createRow(i+1);
			Product p = list.get(i);//리스트 안의 객체 받는 Product
			
			row.createCell(0).setCellValue(p.getDay());
			row.createCell(1).setCellValue(p.getStore());
			row.createCell(2).setCellValue(p.getGrade());
			row.createCell(3).setCellValue(p.getDetail());
			row.createCell(4).setCellValue(p.getPrice());
		}
		
		
		String path ="C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";
		
		try (FileOutputStream fos =  new FileOutputStream(path)){
			workbook.write(fos);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}




}












