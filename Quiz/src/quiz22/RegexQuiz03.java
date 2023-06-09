package quiz22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class RegexQuiz03 {
	public static void main(String[] args) {
		
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어온다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 패턴 분석하여
		 * 	product객체에 저장하고 리스트에 저장
		 * 3. 외부라이브러리 (POI)라이브러리 - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 엑셀 파일로 추출  - 하나의 시트에 각 행데이터를 엑셀파일로 출력
		 */
		
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
	
		String pattern = "\\d{8}-\\d{2}-\\d*";
		String pattern2 = "건담[가-힣\s]*";
		String pattern3 = "\\[[A-Za-z가-힣]*\\]";
		String pattern4 = "";
		String pattern5 = "[0-9,]*원";
		
		List<Product> list = new ArrayList<>();
		
		Product p;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))){

			String s;
			String re;
			while( (s=br.readLine())!=null ) {
				
				re = s.replaceAll(pattern, "").replaceFirst(pattern2, "").replaceAll(pattern3, "")
						.replaceAll(pattern5, "");
				
				Matcher m = Pattern.compile(pattern).matcher(s);
				Matcher m2 = Pattern.compile(pattern2).matcher(s);
				Matcher m3 = Pattern.compile(pattern3).matcher(s);
				Matcher m5 = Pattern.compile(pattern5).matcher(s);
				
				if(m.find() && m2.find() && m3.find() && m5.find()) {
					
					p = new Product(m.group(), m2.group(), m3.group(), re, m5.group());
					list.add(p);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
		
		for (Product product : list) {
			System.out.println(product.toString());
			
			
		}
		System.out.println(list.size());
		Workbook xlsWb = new XSSFWorkbook();
		
		Sheet sheet1 = xlsWb.createSheet("건담");
		
		Row row = null;
		Cell cell = null;
		int rowIndex = 0;
		int cellIndex = 0;
		for (Product pro : list) {
			row = sheet1.createRow(rowIndex);
			
			cell = row.createCell(cellIndex);
			cell.setCellValue(pro.getDay()); cellIndex++;
			cell = row.createCell(cellIndex);
			cell.setCellValue(pro.getStore()); cellIndex++;
			cell = row.createCell(cellIndex);
			cell.setCellValue(pro.getGrade()); cellIndex++;
			cell = row.createCell(cellIndex);
			cell.setCellValue(pro.getDetail()); cellIndex++;
			cell = row.createCell(cellIndex);
			cell.setCellValue(pro.getPrice()); cellIndex++;
			cellIndex = 0;
			rowIndex++;
		}
		
		try {
            File xlsFile = new File("C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\건담.xls");
            FileOutputStream fileOut = new FileOutputStream(xlsFile);
            xlsWb.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		 
		
		
		
		
	}
}
