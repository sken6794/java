package quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		String[] str_list = {"u","u","l","l"};
		String[] result = {};
		List<String> list = new ArrayList<>();
		for (String string : str_list) {
			list.add(string);
		}
		
	
		
		
		int l = list.indexOf("l"); 
		int r = list.indexOf("r");
		int ll = list.lastIndexOf("l");
		int lr = list.lastIndexOf("r");
		if(l>r && l!=ll) {
			if(r==-1 ) {
				result = Arrays.copyOfRange(str_list, r+2, str_list.length);
			}else {
				result = Arrays.copyOfRange(str_list, r+1, str_list.length);
			}
			
		} else if (r>l && r!=lr) {
			if(l==-1) {
				result = Arrays.copyOfRange(str_list, 1, str_list.length);
			}else {
				result = Arrays.copyOfRange(str_list, 0, l);
			}
			
		} else if (l<0 || r<0) {
			result = new String[0];
		} 
		
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
	}
	
	
}