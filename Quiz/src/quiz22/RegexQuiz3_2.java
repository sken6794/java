package quiz22;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz3_2 {

	public static void main(String[] args) {

		/*
		 *  1. 버퍼리더를 사용. 건담.txt 읽어오기
		 *  2. 정규표현식이용 날짜,지점, 등급,내용,가격을 정규표현식으로 패턴분석
		 *   Product객체에 저장하고 리스트에 저장.
		 *     
		 *  3. 외부라이브러리(POI) - java에서 엑셀파일 xlsx형태로 파일을 쓸 수 있게 해주는기능.
		 *     하나에 시트에 각 행데이터를 엑셀파일로 출력.
		 *  
		 */

		String path = "C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		List<Product> p = new ArrayList<>();
		String str ;
		String a ="";
		String pattern1 = "[0-9-]+[-0-9]{12,13}";
		String pattern2 = "건담+[가-힣]*\\s[가-힣]*점\\s";
		String pattern3 = "\\[+[A-Z가-힣]+\\]";
		String pattern4 ="\\]\\s(\\S.*)\\s\\d+\\s";
		String pattern5 = "[0-9,]+원";
		try(BufferedReader br = new BufferedReader( new InputStreamReader(
				new FileInputStream(path), "UTF-8") ); ) {

			while( (str = br.readLine()) != null) {

				Matcher x1 = Pattern.compile(pattern1).matcher(str);
				Matcher x2 = Pattern.compile(pattern2).matcher(str);
				Matcher x3 = Pattern.compile(pattern3).matcher(str);
				Matcher x4 = Pattern.compile(pattern4).matcher(str);
				Matcher x5 = Pattern.compile(pattern5).matcher(str);

				while(x1.find() && x2.find() && x3.find() && x4.find() && x5.find() ) {
					if(x4.group().contains("]")) {
						a = x4.group().replace("]", "");
						Product p2 = new Product(x1.group(),x2.group(),x3.group(),a,x5.group());
						p.add(p2);   }   
				}

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		String path2 = "C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz22\\hyem.xlsx";

		XSSFWorkbook excel = null;
		XSSFRow xRow = null;;
		XSSFCell xCell = null;
		XSSFSheet sheet = null;


		try(FileOutputStream f =new FileOutputStream(path2)) {

			excel = new XSSFWorkbook();
			sheet = excel.createSheet("aaa");
			xRow = sheet.createRow(0);  //세로
			xCell=xRow.createCell(0); // 가로
			xCell.setCellValue("날짜");
			xCell=xRow.createCell(1);
			xCell.setCellValue("지점");
			xCell=xRow.createCell(2);
			xCell.setCellValue("등급");
			xCell=xRow.createCell(3);
			xCell.setCellValue("내용");
			xCell=xRow.createCell(4);
			xCell.setCellValue("가격");

			for(int i = 1; i < p.size(); i++) {
				xRow = sheet.createRow(i);
				xCell = xRow.createCell(0);
				xCell.setCellValue(p.get(i).getDay());
				xCell = xRow.createCell(1);
				xCell.setCellValue(p.get(i).getStore());
				xCell = xRow.createCell(2);
				xCell.setCellValue(p.get(i).getGrade());
				xCell = xRow.createCell(3);
				xCell.setCellValue(p.get(i).getDetail());
				xCell = xRow.createCell(4);
				xCell.setCellValue(p.get(i).getPrice());

			}

			excel.write(f);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}