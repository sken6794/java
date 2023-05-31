package holy.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import holy.dao.TicketDAO;

import holy.vo.TicketingVO;

import java.awt.Font;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class TicketCheck {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               TicketCheck window = new TicketCheck();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });


   }


   public TicketCheck() {
      initialize();
   }

   private void initialize() {
      TicketDAO td = new TicketDAO();
      TicketingVO tv = new TicketingVO(); 
      //List<TicketingVO> list = td.getTicketingList();
      
      frame = new JFrame();
      frame.getContentPane().setFont(new Font("굴림", Font.PLAIN, 20));
      frame.setBounds(100, 100, 902, 573);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      JLabel lblNewLabel = new JLabel("예매 내역");
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 31, 862, 62);
      frame.getContentPane().add(lblNewLabel);

      JPanel imagepanel = new JPanel();
      imagepanel.setBounds(40, 100, 250, 350);
      frame.getContentPane().add(imagepanel);
      imagepanel.setLayout(null);

      JLabel lblNewLabel_1 = new JLabel("예매한 영화");
      lblNewLabel_1.setBounds(340, 130, 80, 30);
      frame.getContentPane().add(lblNewLabel_1);

      JLabel lblNewLabel_1_1 = new JLabel("상영 일자");
      lblNewLabel_1_1.setBounds(340, 200, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_1);

      JLabel lblNewLabel_1_2 = new JLabel("상영관 번호");
      lblNewLabel_1_2.setBounds(340, 270, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_2);

      JLabel lblNewLabel_1_3 = new JLabel("상영 시간");
      lblNewLabel_1_3.setBounds(340, 350, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_3);

      JLabel lblNewLabel_1_4 = new JLabel("결제 가격");
      lblNewLabel_1_4.setBounds(340, 420, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_4);

      JLabel lblNewLabel_1_5 = new JLabel("좌석");
      lblNewLabel_1_5.setBounds(620, 130, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5);

      JLabel lblNewLabel_1_5_1 = new JLabel("예매한 날짜");
      lblNewLabel_1_5_1.setBounds(620, 200, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_1);

      JLabel lblNewLabel_1_5_2 = new JLabel("러닝 타임");
      lblNewLabel_1_5_2.setBounds(620, 270, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_2);

      JLabel lblNewLabel_1_5_3 = new JLabel("수량");
      lblNewLabel_1_5_3.setBounds(620, 350, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_3);

      JLabel filmName = new JLabel("New label");
      filmName.setBounds(450, 130, 80, 30);
      frame.getContentPane().add(filmName);
      
      JLabel scheDate = new JLabel("New label");
      scheDate.setBounds(450, 200, 80, 30);
      frame.getContentPane().add(scheDate);
      
      JLabel theaNum = new JLabel("New label");
      theaNum.setBounds(450, 270, 80, 30);
      frame.getContentPane().add(theaNum);

      JLabel scheTime = new JLabel("New label");
      scheTime.setBounds(450, 350, 80, 30);
      frame.getContentPane().add(scheTime);

      JLabel tickPrice = new JLabel("New label");
      tickPrice.setBounds(450, 420, 80, 30);
      frame.getContentPane().add(tickPrice);

      JLabel seatno = new JLabel("New label");
      seatno.setBounds(715, 130, 80, 30);
      frame.getContentPane().add(seatno);

      JLabel tickDate = new JLabel("New label");
      tickDate.setBounds(715, 200, 80, 30);
      frame.getContentPane().add(tickDate);
      
      JLabel runTime = new JLabel("New label");
      runTime.setBounds(715, 270, 80, 30);
      frame.getContentPane().add(runTime);


      JLabel tickCnt = new JLabel("New label");
      tickCnt.setBounds(715, 350, 80, 30);
      frame.getContentPane().add(tickCnt);
      
      
      // 출력
      String b = ""; //티켓 수량
      b += list.get(0).getTicketCount();
      tickCnt.setText(b);
      
      String a = ""; //티켓 가격
      a += list.get(0).getTicketPrice();
      tickPrice.setText(a);
      
      tickDate.setText(list.get(0).getTicketDate()); //예매한 날짜
      seatno.setText(list.get(0).getSeatNumber()); //좌석 번호
      scheTime.setText(list.get(0).getScheduleTime()); //상영 시간
      theaNum.setText(list.get(0).getTheaterNumber()); //상영관 번호
      scheDate.setText(list.get(0).getScheduleDate()); //상영 날짜
      filmName.setText(list.get(0).getFilmtitle()); //영화 제목
      
   }
}