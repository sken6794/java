package holy.dao;

import java.util.ArrayList;
import java.util.List;

import holy.vo.HmemberVO;

public class MainCl {
	public static void main(String[] args) {
		
		List<HmemberVO> list = new ArrayList<>();
		
		HmemberDAO memDao = new HmemberDAO();
		list = memDao.getMemberlist();
		
		for (HmemberVO hmemberVO : list) {
			System.out.println(hmemberVO.getHid());
		}
	}
}
