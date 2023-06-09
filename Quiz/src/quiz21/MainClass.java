package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		
		//지역, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800 
		/*
		 * 1. 버퍼리더 이용해서 한줄 씩 읽기.
		 * 2. split(",", 5) 를 사용해서 Data 객체에 한 줄 단위로 저장
		 * 3. List<Data>에 하나씩 추가
		 * 4. 람다식을 이용해서 지역 : 서울, 4분기 중 9~12월, 분양가격 : 2000이상인 객체만 뽑아서
		 * 	새로운 리스트로 반환.
		 */
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\work\\Quiz\\src\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		
		List<Data> dataList = new ArrayList<>();
		
		try ( BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"EUC-KR")) ){
			
			System.out.println(br.readLine());
			//System.out.println(Arrays.toString(br.readLine().split(",",5)));
			String re;
			String[] dataArr;
			Data data;
			while( (re = br.readLine())!=null ) {
				
				dataArr = re.split(",",5);
				if(dataArr[4].contains(",")) {
					dataArr[4] = dataArr[4].replace(",", "");
					dataArr[4] = dataArr[4].replaceAll("\"", "");
				}
				data = new Data(dataArr[0], dataArr[1], dataArr[2], dataArr[3], dataArr[4]);
				dataList.add(data);
			}
			
			
		} catch (Exception e) {
			
		}
		
		dataList.stream().forEach(a->System.out.println(a.getRegion()));
	
		List<Data> newDataList = new ArrayList<>();
		newDataList= dataList.stream().filter(d -> d.getRegion().equals("서울"))
						.filter(d -> Integer.parseInt(d.getPrice())>=2000)
						.filter(d -> Integer.parseInt(d.getMonth())>=9 && Integer.parseInt(d.getMonth())<=12)
						.collect(Collectors.toList());
		
		newDataList.stream().forEach(d->System.out.println(d.toString()));
	}
}
