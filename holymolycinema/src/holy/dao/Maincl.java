package holy.dao;

import java.util.List;

import holy.vo.TicketListVO;

public class Maincl {
	public static void main(String[] args) {
		TicketDAO tk = new TicketDAO();
		String id = "werty1111";
		List<TicketListVO> list = tk.getTicket(id);  
		
		
		
		
		
	}
}
