package holy.main;

import java.util.ArrayList;
import java.util.List;

import holy.dao.TicketDAO;
import holy.vo.TicketListVO;

public class TicketMain {
	
	public static void main(String[] args) {
		
		
		TicketDAO ticket = new TicketDAO();
		
		ticket.getTicket("werty1111");
		List<TicketListVO> list = new ArrayList<>();
		
		System.out.println(list.toString());
		
		
		
		
	}

}
