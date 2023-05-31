package holy.swing;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class SEAT_SWING extends JFrame {
	
	String id3 ="";
	String title;
	String date;
	String time;

   private JPanel contentPane;
   
   String seat = "";
   List<String> seatlist = new ArrayList<>();
   
   /**
    * 어플 실행
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               SEAT_SWING frame = new SEAT_SWING();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   int ticketcount = 2;
   

   /**
    * 프레임 생성
    */
   
   public SEAT_SWING() {
      
         
	  ImagePanel MainPanel = new ImagePanel(new ImageIcon("C:\\Users\\user\\Desktop\\course\\java\\work\\project2\\img\\seat.jpg").getImage());

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 719, 714);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.add(MainPanel);

      setContentPane(contentPane);
      contentPane.setLayout(null);

      JButton btnNewButton = new JButton("A1");
      btnNewButton.setForeground(Color.WHITE);
      btnNewButton.setBackground(Color.LIGHT_GRAY);
      btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton.setBounds(50, 183, 47, 23);
      MainPanel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("A4");
      btnNewButton_1.setForeground(Color.WHITE);
      btnNewButton_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1.setBounds(230, 183, 53, 23);
      MainPanel.add(btnNewButton_1);

      JButton btnNewButton_2 = new JButton("A3");
      btnNewButton_2.setForeground(Color.WHITE);
      btnNewButton_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2.setBounds(170, 183, 50, 23);
      MainPanel.add(btnNewButton_2);

      JButton btnNewButton_1_1 = new JButton("A2");
      btnNewButton_1_1.setForeground(Color.WHITE);
      btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1.setBounds(110, 183, 52, 23);
      MainPanel.add(btnNewButton_1_1);

      JButton btnNewButton_1_2 = new JButton("A5");
      btnNewButton_1_2.setForeground(Color.WHITE);
      btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2.setBounds(290, 183, 50, 23);
      MainPanel.add(btnNewButton_1_2);

      JButton btnNewButton_1_3 = new JButton("A6");
      btnNewButton_1_3.setForeground(Color.WHITE);
      btnNewButton_1_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3.setBounds(360, 183, 50, 23);
      MainPanel.add(btnNewButton_1_3);

      JButton btnNewButton_1_4 = new JButton("A7");
      btnNewButton_1_4.setForeground(Color.WHITE);
      btnNewButton_1_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4.setBounds(420, 183, 49, 23);
      MainPanel.add(btnNewButton_1_4);

      JButton btnNewButton_1_4_1 = new JButton("A8");
      btnNewButton_1_4_1.setForeground(Color.WHITE);
      btnNewButton_1_4_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1.setBounds(480, 183, 51, 23);
      MainPanel.add(btnNewButton_1_4_1);

      JButton btnNewButton_1_4_2 = new JButton("A9");
      btnNewButton_1_4_2.setForeground(Color.WHITE);
      btnNewButton_1_4_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2.setBounds(540, 183, 52, 23);
      MainPanel.add(btnNewButton_1_4_2);

      JButton btnNewButton_1_4_3 = new JButton("A10");
      btnNewButton_1_4_3.setForeground(Color.WHITE);
      btnNewButton_1_4_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3.setBounds(600, 183, 54, 23);
      MainPanel.add(btnNewButton_1_4_3);

      JButton btnNewButton_1_1_1 = new JButton("B10");
      btnNewButton_1_1_1.setForeground(Color.WHITE);
      btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_1.setBounds(600, 212, 54, 23);
      MainPanel.add(btnNewButton_1_1_1);

      JButton btnNewButton_2_1 = new JButton("B9");
      btnNewButton_2_1.setForeground(Color.WHITE);
      btnNewButton_2_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_1.setBounds(540, 212, 52, 23);
      MainPanel.add(btnNewButton_2_1);

      JButton btnNewButton_1_5 = new JButton("B8");
      btnNewButton_1_5.setForeground(Color.WHITE);
      btnNewButton_1_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_5.setBounds(480, 212, 51, 23);
      MainPanel.add(btnNewButton_1_5);

      JButton btnNewButton_1_2_1 = new JButton("B7");
      btnNewButton_1_2_1.setForeground(Color.WHITE);
      btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_1.setBounds(420, 212, 49, 23);
      MainPanel.add(btnNewButton_1_2_1);

      JButton btnNewButton_1_3_1 = new JButton("B6");
      btnNewButton_1_3_1.setForeground(Color.WHITE);
      btnNewButton_1_3_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_1.setBounds(360, 212, 50, 23);
      MainPanel.add(btnNewButton_1_3_1);

      JButton btnNewButton_1_4_4 = new JButton("B5");
      btnNewButton_1_4_4.setForeground(Color.WHITE);
      btnNewButton_1_4_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_4.setBounds(290, 212, 50, 23);
      MainPanel.add(btnNewButton_1_4_4);

      JButton btnNewButton_1_4_1_1 = new JButton("B4");
      btnNewButton_1_4_1_1.setForeground(Color.WHITE);
      btnNewButton_1_4_1_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_1.setBounds(230, 212, 53, 23);
      MainPanel.add(btnNewButton_1_4_1_1);

      JButton btnNewButton_1_4_2_1 = new JButton("B3");
      btnNewButton_1_4_2_1.setForeground(Color.WHITE);
      btnNewButton_1_4_2_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_1.setBounds(170, 212, 50, 23);
      MainPanel.add(btnNewButton_1_4_2_1);

      JButton btnNewButton_1_4_3_2 = new JButton("B2");
      btnNewButton_1_4_3_2.setForeground(Color.WHITE);
      btnNewButton_1_4_3_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_2.setBounds(110, 212, 52, 23);
      MainPanel.add(btnNewButton_1_4_3_2);

      JButton btnNewButton_1_4_3_1_1 = new JButton("B1");
      btnNewButton_1_4_3_1_1.setForeground(Color.WHITE);
      btnNewButton_1_4_3_1_1.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_1_1.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_1_1.setBounds(50, 212, 47, 23);
      MainPanel.add(btnNewButton_1_4_3_1_1);

      JButton btnNewButton_4 = new JButton("C2");
      btnNewButton_4.setForeground(Color.WHITE);
      btnNewButton_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_4.setBounds(110, 241, 52, 23);
      MainPanel.add(btnNewButton_4);

      JButton btnNewButton_1_1_2 = new JButton("C3");
      btnNewButton_1_1_2.setForeground(Color.WHITE);
      btnNewButton_1_1_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_2.setBounds(170, 241, 50, 23);
      MainPanel.add(btnNewButton_1_1_2);

      JButton btnNewButton_2_2 = new JButton("C4");
      btnNewButton_2_2.setForeground(Color.WHITE);
      btnNewButton_2_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_2.setBounds(230, 241, 53, 23);
      MainPanel.add(btnNewButton_2_2);

      JButton btnNewButton_1_6 = new JButton("C5");
      btnNewButton_1_6.setForeground(Color.WHITE);
      btnNewButton_1_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_6.setBounds(290, 241, 50, 23);
      MainPanel.add(btnNewButton_1_6);

      JButton btnNewButton_1_2_2 = new JButton("C6");
      btnNewButton_1_2_2.setForeground(Color.WHITE);
      btnNewButton_1_2_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_2.setBounds(360, 241, 50, 23);
      MainPanel.add(btnNewButton_1_2_2);

      JButton btnNewButton_1_3_2 = new JButton("C7");
      btnNewButton_1_3_2.setForeground(Color.WHITE);
      btnNewButton_1_3_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_2.setBounds(420, 241, 49, 23);
      MainPanel.add(btnNewButton_1_3_2);

      JButton btnNewButton_1_4_5 = new JButton("C8");
      btnNewButton_1_4_5.setForeground(Color.WHITE);
      btnNewButton_1_4_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_5.setBounds(480, 241, 51, 23);
      MainPanel.add(btnNewButton_1_4_5);

      JButton btnNewButton_1_4_1_2 = new JButton("C9");
      btnNewButton_1_4_1_2.setForeground(Color.WHITE);
      btnNewButton_1_4_1_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_2.setBounds(540, 241, 52, 23);
      MainPanel.add(btnNewButton_1_4_1_2);

      JButton btnNewButton_1_4_2_2 = new JButton("C10");
      btnNewButton_1_4_2_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_2.setForeground(Color.WHITE);
      btnNewButton_1_4_2_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_2.setBounds(600, 241, 54, 23);
      MainPanel.add(btnNewButton_1_4_2_2);

      JButton btnNewButton_1_4_3_1_2 = new JButton("C1");
      btnNewButton_1_4_3_1_2.setForeground(Color.WHITE);
      btnNewButton_1_4_3_1_2.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_1_2.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_1_2.setBounds(50, 241, 47, 23);
      MainPanel.add(btnNewButton_1_4_3_1_2);

      JButton btnNewButton_5 = new JButton("D1");
      btnNewButton_5.setForeground(Color.WHITE);
      btnNewButton_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_5.setBounds(50, 270, 47, 23);
      MainPanel.add(btnNewButton_5);

      JButton btnNewButton_1_1_3 = new JButton("D2");
      btnNewButton_1_1_3.setForeground(Color.WHITE);
      btnNewButton_1_1_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_3.setBounds(110, 270, 52, 23);
      MainPanel.add(btnNewButton_1_1_3);

      JButton btnNewButton_2_3 = new JButton("D3");
      btnNewButton_2_3.setForeground(Color.WHITE);
      btnNewButton_2_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_3.setBounds(170, 270, 50, 23);
      btnNewButton_2_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      MainPanel.add(btnNewButton_2_3);

      JButton btnNewButton_1_7 = new JButton("D4");
      btnNewButton_1_7.setForeground(Color.WHITE);
      btnNewButton_1_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_7.setBounds(230, 270, 53, 23);
      MainPanel.add(btnNewButton_1_7);

      JButton btnNewButton_1_2_3 = new JButton("D5");
      btnNewButton_1_2_3.setForeground(Color.WHITE);
      btnNewButton_1_2_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_3.setBounds(290, 270, 50, 23);
      MainPanel.add(btnNewButton_1_2_3);

      JButton btnNewButton_1_3_3 = new JButton("D6");
      btnNewButton_1_3_3.setForeground(Color.WHITE);
      btnNewButton_1_3_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_3.setBounds(360, 270, 50, 23);
      MainPanel.add(btnNewButton_1_3_3);

      JButton btnNewButton_1_4_6 = new JButton("D7");
      btnNewButton_1_4_6.setForeground(Color.WHITE);
      btnNewButton_1_4_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_6.setBounds(420, 270, 49, 23);
      MainPanel.add(btnNewButton_1_4_6);

      JButton btnNewButton_1_4_1_3 = new JButton("D8");
      btnNewButton_1_4_1_3.setForeground(Color.WHITE);
      btnNewButton_1_4_1_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_3.setBounds(480, 270, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_3);

      JButton btnNewButton_1_4_2_3 = new JButton("D9");
      btnNewButton_1_4_2_3.setForeground(Color.WHITE);
      btnNewButton_1_4_2_3.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_3.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_3.setBounds(540, 270, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_3);

      JButton btnNewButton_1_4_3_4 = new JButton("D10");
      btnNewButton_1_4_3_4.setForeground(Color.WHITE);
      btnNewButton_1_4_3_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_4.setBounds(600, 270, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_4);

      JButton btnNewButton_6 = new JButton("E10");
      btnNewButton_6.setForeground(Color.WHITE);
      btnNewButton_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_6.setBounds(600, 299, 54, 23);
      MainPanel.add(btnNewButton_6);

      JButton btnNewButton_1_1_4 = new JButton("E9");
      btnNewButton_1_1_4.setForeground(Color.WHITE);
      btnNewButton_1_1_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_4.setBounds(540, 299, 52, 23);
      MainPanel.add(btnNewButton_1_1_4);

      JButton btnNewButton_2_4 = new JButton("E8");
      btnNewButton_2_4.setForeground(Color.WHITE);
      btnNewButton_2_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_4.setBounds(480, 299, 51, 23);
      MainPanel.add(btnNewButton_2_4);

      JButton btnNewButton_1_8 = new JButton("E7");
      btnNewButton_1_8.setForeground(Color.WHITE);
      btnNewButton_1_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_8.setBounds(420, 299, 49, 23);
      MainPanel.add(btnNewButton_1_8);

      JButton btnNewButton_1_2_4 = new JButton("E6");
      btnNewButton_1_2_4.setForeground(Color.WHITE);
      btnNewButton_1_2_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_4.setBounds(360, 299, 50, 23);
      MainPanel.add(btnNewButton_1_2_4);

      JButton btnNewButton_1_3_4 = new JButton("E5");
      btnNewButton_1_3_4.setForeground(Color.WHITE);
      btnNewButton_1_3_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_4.setBounds(290, 299, 50, 23);
      MainPanel.add(btnNewButton_1_3_4);

      JButton btnNewButton_1_4_7 = new JButton("E4");
      btnNewButton_1_4_7.setForeground(Color.WHITE);
      btnNewButton_1_4_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_7.setBounds(230, 299, 53, 23);
      MainPanel.add(btnNewButton_1_4_7);

      JButton btnNewButton_1_4_1_4 = new JButton("E3");
      btnNewButton_1_4_1_4.setForeground(Color.WHITE);
      btnNewButton_1_4_1_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_4.setBounds(170, 299, 50, 23);
      MainPanel.add(btnNewButton_1_4_1_4);

      JButton btnNewButton_1_4_2_4 = new JButton("E2");
      btnNewButton_1_4_2_4.setForeground(Color.WHITE);
      btnNewButton_1_4_2_4.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_4.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_4.setBounds(110, 299, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_4);

      JButton btnNewButton_1_4_3_5 = new JButton("E1");
      btnNewButton_1_4_3_5.setForeground(Color.WHITE);
      btnNewButton_1_4_3_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_5.setBounds(50, 299, 47, 23);
      MainPanel.add(btnNewButton_1_4_3_5);

      JButton btnNewButton_7 = new JButton("F10");
      btnNewButton_7.setForeground(Color.WHITE);
      btnNewButton_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_7.setBounds(600, 328, 54, 23);
      MainPanel.add(btnNewButton_7);

      JButton btnNewButton_1_1_5 = new JButton("F9");
      btnNewButton_1_1_5.setForeground(Color.WHITE);
      btnNewButton_1_1_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_5.setBounds(540, 328, 52, 23);
      MainPanel.add(btnNewButton_1_1_5);

      JButton btnNewButton_2_5 = new JButton("F8");
      btnNewButton_2_5.setForeground(Color.WHITE);
      btnNewButton_2_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_5.setBounds(480, 328, 51, 23);
      MainPanel.add(btnNewButton_2_5);

      JButton btnNewButton_1_9 = new JButton("F7");
      btnNewButton_1_9.setForeground(Color.WHITE);
      btnNewButton_1_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_9.setBounds(420, 328, 49, 23);
      MainPanel.add(btnNewButton_1_9);

      JButton btnNewButton_1_2_5 = new JButton("F6");
      btnNewButton_1_2_5.setForeground(Color.WHITE);
      btnNewButton_1_2_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_5.setBounds(360, 328, 50, 23);
      MainPanel.add(btnNewButton_1_2_5);

      JButton btnNewButton_1_3_5 = new JButton("F5");
      btnNewButton_1_3_5.setForeground(Color.WHITE);
      btnNewButton_1_3_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_5.setBounds(290, 328, 50, 23);
      MainPanel.add(btnNewButton_1_3_5);

      JButton btnNewButton_1_4_8 = new JButton("F4");
      btnNewButton_1_4_8.setForeground(Color.WHITE);
      btnNewButton_1_4_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton_1_4_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_8.setBounds(230, 328, 53, 23);
      MainPanel.add(btnNewButton_1_4_8);

      JButton btnNewButton_1_4_1_5 = new JButton("F3");
      btnNewButton_1_4_1_5.setForeground(Color.WHITE);
      btnNewButton_1_4_1_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_5.setBounds(170, 328, 50, 23);
      MainPanel.add(btnNewButton_1_4_1_5);

      JButton btnNewButton_1_4_2_5 = new JButton("F2");
      btnNewButton_1_4_2_5.setForeground(Color.WHITE);
      btnNewButton_1_4_2_5.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_5.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_5.setBounds(110, 328, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_5);

      JButton btnNewButton_1_4_3_6 = new JButton("F1");
      btnNewButton_1_4_3_6.setForeground(Color.WHITE);
      btnNewButton_1_4_3_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_6.setBounds(50, 328, 47, 23);
      MainPanel.add(btnNewButton_1_4_3_6);

      JButton btnNewButton_8 = new JButton("G1");
      btnNewButton_8.setForeground(Color.WHITE);
      btnNewButton_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_8.setBounds(48, 435, 51, 23);
      MainPanel.add(btnNewButton_8);

      JButton btnNewButton_1_1_6 = new JButton("G2");
      btnNewButton_1_1_6.setForeground(Color.WHITE);
      btnNewButton_1_1_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_6.setBounds(108, 435, 52, 23);
      MainPanel.add(btnNewButton_1_1_6);

      JButton btnNewButton_2_6 = new JButton("G3");
      btnNewButton_2_6.setForeground(Color.WHITE);
      btnNewButton_2_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_6.setBounds(168, 435, 50, 23);
      MainPanel.add(btnNewButton_2_6);

      JButton btnNewButton_1_10 = new JButton("G4");
      btnNewButton_1_10.setForeground(Color.WHITE);
      btnNewButton_1_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_10.setBounds(228, 435, 53, 23);
      MainPanel.add(btnNewButton_1_10);

      JButton btnNewButton_1_2_6 = new JButton("G5");
      btnNewButton_1_2_6.setForeground(Color.WHITE);
      btnNewButton_1_2_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_6.setBounds(288, 435, 50, 23);
      MainPanel.add(btnNewButton_1_2_6);

      JButton btnNewButton_1_3_6 = new JButton("G6");
      btnNewButton_1_3_6.setForeground(Color.WHITE);
      btnNewButton_1_3_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_6.setBounds(358, 435, 50, 23);
      MainPanel.add(btnNewButton_1_3_6);

      JButton btnNewButton_1_4_9 = new JButton("G7");
      btnNewButton_1_4_9.setForeground(Color.WHITE);
      btnNewButton_1_4_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_9.setBounds(418, 435, 49, 23);
      MainPanel.add(btnNewButton_1_4_9);

      JButton btnNewButton_1_4_1_6 = new JButton("G8");
      btnNewButton_1_4_1_6.setForeground(Color.WHITE);
      btnNewButton_1_4_1_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_6.setBounds(478, 435, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_6);

      JButton btnNewButton_1_4_2_6 = new JButton("G9");
      btnNewButton_1_4_2_6.setForeground(Color.WHITE);
      btnNewButton_1_4_2_6.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_6.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_6.setBounds(538, 435, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_6);

      JButton btnNewButton_1_4_3_7 = new JButton("G10");
      btnNewButton_1_4_3_7.setForeground(Color.WHITE);
      btnNewButton_1_4_3_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_7.setBounds(598, 435, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_7);

      JButton btnNewButton_9 = new JButton("H1");
      btnNewButton_9.setForeground(Color.WHITE);
      btnNewButton_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_9.setBounds(48, 464, 51, 23);
      MainPanel.add(btnNewButton_9);

      JButton btnNewButton_1_1_7 = new JButton("H2");
      btnNewButton_1_1_7.setForeground(Color.WHITE);
      btnNewButton_1_1_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_7.setBounds(108, 464, 52, 23);
      MainPanel.add(btnNewButton_1_1_7);

      JButton btnNewButton_2_7 = new JButton("H3");
      btnNewButton_2_7.setForeground(Color.WHITE);
      btnNewButton_2_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_7.setBounds(168, 464, 50, 23);
      MainPanel.add(btnNewButton_2_7);

      JButton btnNewButton_1_11 = new JButton("H4");
      btnNewButton_1_11.setForeground(Color.WHITE);
      btnNewButton_1_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_11.setBounds(228, 464, 53, 23);
      MainPanel.add(btnNewButton_1_11);

      JButton btnNewButton_1_2_7 = new JButton("H5");
      btnNewButton_1_2_7.setForeground(Color.WHITE);
      btnNewButton_1_2_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_7.setBounds(288, 464, 50, 23);
      MainPanel.add(btnNewButton_1_2_7);

      JButton btnNewButton_1_3_7 = new JButton("H6");
      btnNewButton_1_3_7.setForeground(Color.WHITE);
      btnNewButton_1_3_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_7.setBounds(358, 464, 50, 23);
      MainPanel.add(btnNewButton_1_3_7);

      JButton btnNewButton_1_4_10 = new JButton("H7");
      btnNewButton_1_4_10.setForeground(Color.WHITE);
      btnNewButton_1_4_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_10.setBounds(418, 464, 49, 23);
      MainPanel.add(btnNewButton_1_4_10);

      JButton btnNewButton_1_4_1_7 = new JButton("H8");
      btnNewButton_1_4_1_7.setForeground(Color.WHITE);
      btnNewButton_1_4_1_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_7.setBounds(478, 464, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_7);

      JButton btnNewButton_1_4_2_7 = new JButton("H9");
      btnNewButton_1_4_2_7.setForeground(Color.WHITE);
      btnNewButton_1_4_2_7.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_7.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_7.setBounds(538, 464, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_7);

      JButton btnNewButton_1_4_3_8 = new JButton("H10");
      btnNewButton_1_4_3_8.setForeground(Color.WHITE);
      btnNewButton_1_4_3_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_8.setBounds(598, 464, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_8);

      JButton btnNewButton_10 = new JButton("I1");
      btnNewButton_10.setForeground(Color.WHITE);
      btnNewButton_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_10.setBounds(48, 493, 51, 23);
      MainPanel.add(btnNewButton_10);

      JButton btnNewButton_1_1_8 = new JButton("I2");
      btnNewButton_1_1_8.setForeground(Color.WHITE);
      btnNewButton_1_1_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_8.setBounds(108, 493, 52, 23);
      MainPanel.add(btnNewButton_1_1_8);

      JButton btnNewButton_2_8 = new JButton("I3");
      btnNewButton_2_8.setForeground(Color.WHITE);
      btnNewButton_2_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_8.setBounds(168, 493, 50, 23);
      MainPanel.add(btnNewButton_2_8);

      JButton btnNewButton_1_12 = new JButton("I4");
      btnNewButton_1_12.setForeground(Color.WHITE);
      btnNewButton_1_12.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_12.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_12.setBounds(228, 493, 53, 23);
      MainPanel.add(btnNewButton_1_12);

      JButton btnNewButton_1_2_8 = new JButton("I5");
      btnNewButton_1_2_8.setForeground(Color.WHITE);
      btnNewButton_1_2_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_8.setBounds(288, 493, 50, 23);
      MainPanel.add(btnNewButton_1_2_8);

      JButton btnNewButton_1_3_8 = new JButton("I6");
      btnNewButton_1_3_8.setForeground(Color.WHITE);
      btnNewButton_1_3_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_8.setBounds(358, 493, 50, 23);
      MainPanel.add(btnNewButton_1_3_8);

      JButton btnNewButton_1_4_11 = new JButton("I7");
      btnNewButton_1_4_11.setForeground(Color.WHITE);
      btnNewButton_1_4_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_11.setBounds(418, 493, 49, 23);
      MainPanel.add(btnNewButton_1_4_11);

      JButton btnNewButton_1_4_1_8 = new JButton("I8");
      btnNewButton_1_4_1_8.setForeground(Color.WHITE);
      btnNewButton_1_4_1_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_8.setBounds(478, 493, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_8);

      JButton btnNewButton_1_4_2_8 = new JButton("I9");
      btnNewButton_1_4_2_8.setForeground(Color.WHITE);
      btnNewButton_1_4_2_8.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_8.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_8.setBounds(538, 493, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_8);

      JButton btnNewButton_1_4_3_9 = new JButton("I10");
      btnNewButton_1_4_3_9.setForeground(Color.WHITE);
      btnNewButton_1_4_3_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_9.setBounds(598, 493, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_9);

      JButton btnNewButton_11 = new JButton("J1");
      btnNewButton_11.setForeground(Color.WHITE);
      btnNewButton_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_11.setBounds(48, 522, 51, 23);
      MainPanel.add(btnNewButton_11);

      JButton btnNewButton_1_1_9 = new JButton("J2");
      btnNewButton_1_1_9.setForeground(Color.WHITE);
      btnNewButton_1_1_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_9.setBounds(108, 522, 52, 23);
      MainPanel.add(btnNewButton_1_1_9);

      JButton btnNewButton_2_9 = new JButton("J3");
      btnNewButton_2_9.setForeground(Color.WHITE);
      btnNewButton_2_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_9.setBounds(168, 522, 50, 23);
      MainPanel.add(btnNewButton_2_9);

      JButton btnNewButton_1_13 = new JButton("J4");
      btnNewButton_1_13.setForeground(Color.WHITE);
      btnNewButton_1_13.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_13.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_13.setBounds(228, 522, 53, 23);
      MainPanel.add(btnNewButton_1_13);

      JButton btnNewButton_1_2_9 = new JButton("J5");
      btnNewButton_1_2_9.setForeground(Color.WHITE);
      btnNewButton_1_2_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_9.setBounds(288, 522, 50, 23);
      MainPanel.add(btnNewButton_1_2_9);

      JButton btnNewButton_1_3_9 = new JButton("J6");
      btnNewButton_1_3_9.setForeground(Color.WHITE);
      btnNewButton_1_3_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_9.setBounds(358, 522, 50, 23);
      MainPanel.add(btnNewButton_1_3_9);

      JButton btnNewButton_1_4_12 = new JButton("J7");
      btnNewButton_1_4_12.setForeground(Color.WHITE);
      btnNewButton_1_4_12.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_12.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_12.setBounds(418, 522, 49, 23);
      MainPanel.add(btnNewButton_1_4_12);

      JButton btnNewButton_1_4_1_9 = new JButton("J8");
      btnNewButton_1_4_1_9.setForeground(Color.WHITE);
      btnNewButton_1_4_1_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_9.setBounds(478, 522, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_9);

      JButton btnNewButton_1_4_2_9 = new JButton("J9");
      btnNewButton_1_4_2_9.setForeground(Color.WHITE);
      btnNewButton_1_4_2_9.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_9.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_9.setBounds(538, 522, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_9);

      JButton btnNewButton_1_4_3_10 = new JButton("J10");
      btnNewButton_1_4_3_10.setForeground(Color.WHITE);
      btnNewButton_1_4_3_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_10.setBounds(598, 522, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_10);

      JButton btnNewButton_12 = new JButton("K1");
      btnNewButton_12.setForeground(Color.WHITE);
      btnNewButton_12.setBackground(Color.LIGHT_GRAY);
      btnNewButton_12.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_12.setBounds(48, 550, 51, 23);
      MainPanel.add(btnNewButton_12);

      JButton btnNewButton_1_1_10 = new JButton("K2");
      btnNewButton_1_1_10.setForeground(Color.WHITE);
      btnNewButton_1_1_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_10.setBounds(108, 550, 52, 23);
      MainPanel.add(btnNewButton_1_1_10);

      JButton btnNewButton_2_10 = new JButton("K3");
      btnNewButton_2_10.setForeground(Color.WHITE);
      btnNewButton_2_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_10.setBounds(168, 550, 50, 23);
      MainPanel.add(btnNewButton_2_10);

      JButton btnNewButton_1_14 = new JButton("K4");
      btnNewButton_1_14.setForeground(Color.WHITE);
      btnNewButton_1_14.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_14.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_14.setBounds(228, 550, 53, 23);
      MainPanel.add(btnNewButton_1_14);

      JButton btnNewButton_1_2_10 = new JButton("K5");
      btnNewButton_1_2_10.setForeground(Color.WHITE);
      btnNewButton_1_2_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_10.setBounds(288, 550, 50, 23);
      MainPanel.add(btnNewButton_1_2_10);

      JButton btnNewButton_1_3_10 = new JButton("K6");
      btnNewButton_1_3_10.setForeground(Color.WHITE);
      btnNewButton_1_3_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_10.setBounds(358, 550, 50, 23);
      MainPanel.add(btnNewButton_1_3_10);

      JButton btnNewButton_1_4_13 = new JButton("K7");
      btnNewButton_1_4_13.setForeground(Color.WHITE);
      btnNewButton_1_4_13.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_13.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_13.setBounds(418, 550, 49, 23);
      MainPanel.add(btnNewButton_1_4_13);

      JButton btnNewButton_1_4_1_10 = new JButton("K8");
      btnNewButton_1_4_1_10.setForeground(Color.WHITE);
      btnNewButton_1_4_1_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_10.setBounds(478, 550, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_10);

      JButton btnNewButton_1_4_2_10 = new JButton("K9");
      btnNewButton_1_4_2_10.setForeground(Color.WHITE);
      btnNewButton_1_4_2_10.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_10.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_10.setBounds(538, 550, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_10);

      JButton btnNewButton_1_4_3_11 = new JButton("K10");
      btnNewButton_1_4_3_11.setForeground(Color.WHITE);
      btnNewButton_1_4_3_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_11.setBounds(598, 550, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_11);

      JButton btnNewButton_13 = new JButton("L1");
      btnNewButton_13.setForeground(Color.WHITE);
      btnNewButton_13.setBackground(Color.LIGHT_GRAY);
      btnNewButton_13.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_13.setBounds(48, 579, 51, 23);
      MainPanel.add(btnNewButton_13);

      JButton btnNewButton_1_1_11 = new JButton("L2");
      btnNewButton_1_1_11.setForeground(Color.WHITE);
      btnNewButton_1_1_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_1_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_1_11.setBounds(108, 579, 52, 23);
      MainPanel.add(btnNewButton_1_1_11);

      JButton btnNewButton_2_11 = new JButton("L3");
      btnNewButton_2_11.setForeground(Color.WHITE);
      btnNewButton_2_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_2_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_2_11.setBounds(168, 579, 50, 23);
      MainPanel.add(btnNewButton_2_11);

      JButton btnNewButton_1_15 = new JButton("L4");
      btnNewButton_1_15.setForeground(Color.WHITE);
      btnNewButton_1_15.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_15.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_15.setBounds(228, 579, 53, 23);
      MainPanel.add(btnNewButton_1_15);

      JButton btnNewButton_1_2_11 = new JButton("L5");
      btnNewButton_1_2_11.setForeground(Color.WHITE);
      btnNewButton_1_2_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_2_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_2_11.setBounds(288, 579, 50, 23);
      MainPanel.add(btnNewButton_1_2_11);

      JButton btnNewButton_1_3_11 = new JButton("L6");
      btnNewButton_1_3_11.setForeground(Color.WHITE);
      btnNewButton_1_3_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_3_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_3_11.setBounds(358, 579, 50, 23);
      MainPanel.add(btnNewButton_1_3_11);

      JButton btnNewButton_1_4_14 = new JButton("L7");
      btnNewButton_1_4_14.setForeground(Color.WHITE);
      btnNewButton_1_4_14.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_14.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_14.setBounds(418, 579, 49, 23);
      MainPanel.add(btnNewButton_1_4_14);

      JButton btnNewButton_1_4_1_11 = new JButton("L8");
      btnNewButton_1_4_1_11.setForeground(Color.WHITE);
      btnNewButton_1_4_1_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_1_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_1_11.setBounds(478, 579, 51, 23);
      MainPanel.add(btnNewButton_1_4_1_11);

      JButton btnNewButton_1_4_2_11 = new JButton("L9");
      btnNewButton_1_4_2_11.setForeground(Color.WHITE);
      btnNewButton_1_4_2_11.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_2_11.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_2_11.setBounds(538, 579, 52, 23);
      MainPanel.add(btnNewButton_1_4_2_11);

      JButton btnNewButton_1_4_3_12 = new JButton("L10");
      btnNewButton_1_4_3_12.setForeground(Color.WHITE);
      btnNewButton_1_4_3_12.setBackground(Color.LIGHT_GRAY);
      btnNewButton_1_4_3_12.setFont(new Font("굴림", Font.PLAIN, 10));
      btnNewButton_1_4_3_12.setBounds(598, 579, 54, 23);
      MainPanel.add(btnNewButton_1_4_3_12);

      JLabel lblFloor = new JLabel("----------------------------------------------------------------------");
      lblFloor.setHorizontalAlignment(SwingConstants.CENTER);
      lblFloor.setBounds(0, 370, 703, 44);
      MainPanel.add(lblFloor);
      
      
      //버튼 비활성화
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            
//            seat = btnNewButton.getText();
            seatlist.add(btnNewButton.getText());
            
         }
      });
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            
            seatlist.add(btnNewButton_1.getText());
         }
      });
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2.getText());
         }
      });
      
      btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1.getText());
         }
      });
      btnNewButton_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2.getText());
         }
      });
      btnNewButton_1_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3.getText());
         }
      });
      
      btnNewButton_1_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4.getText());
         }
      });
      btnNewButton_1_4_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1.getText());
         }
      });
      btnNewButton_1_4_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2.getText());
         }
      });
      
      btnNewButton_1_4_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3.getText());
         }
      });
      btnNewButton_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_1.getText());
         }
      });
      btnNewButton_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_1.getText());
         }
      });
      btnNewButton_1_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_5.getText());
         }
      });
      btnNewButton_1_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_1.getText());
         }
      });
      btnNewButton_1_3_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_1.getText());
         }
      });
      btnNewButton_1_4_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_4.getText());
         }
      });
      btnNewButton_1_4_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_1.getText());
         }
      });
      btnNewButton_1_4_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_1.getText());
         }
      });
      btnNewButton_1_4_3_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_2.getText());
         }
      });
      btnNewButton_1_4_3_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_1_1.getText());
         }
      });
      btnNewButton_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_4.getText());
         }
      });
      btnNewButton_1_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_2.getText());
         }
      });
      btnNewButton_2_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_2.getText());
         }
      });
      btnNewButton_1_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_6.getText());
         }
      });
      btnNewButton_1_2_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_2.getText());
         }
      });
      btnNewButton_1_3_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_2.getText());
         }
      });
      btnNewButton_1_4_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_5.getText());
         }
      });
      btnNewButton_1_4_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_2.getText());
         }
      });
      btnNewButton_1_4_3_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_1_2.getText());
         }
      });
      btnNewButton_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_5.getText());
         }
      });
      btnNewButton_1_1_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_3.getText());
         }
      });
      btnNewButton_2_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_3.getText());
         }
      });
      btnNewButton_1_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_7.getText());
         }
      });
      btnNewButton_1_2_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_3.getText());
         }
      });
      btnNewButton_1_3_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_3.getText());
         }
      });
      btnNewButton_1_4_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_6.getText());
         }
      });
      btnNewButton_1_4_1_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_3.getText());
         }
      });
      btnNewButton_1_4_2_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_3.getText());
         }
      });
      btnNewButton_1_4_3_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_4.getText());
         }
      });
      btnNewButton_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_6.getText());
         }
      });
      btnNewButton_1_1_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_4.getText());
         }
      });
      btnNewButton_2_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_4.getText());
         }
      });
      btnNewButton_1_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_8.getText());
         }
      });
      btnNewButton_1_2_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_4.getText());
         }
      });
      btnNewButton_1_3_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_4.getText());
         }
      });
      btnNewButton_1_4_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_7.getText());
         }
      });
      btnNewButton_1_4_1_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_4.getText());
         }
      });
      btnNewButton_1_4_2_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_4.getText());
         }
      });
      btnNewButton_1_4_3_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_5.getText());
         }
      });
      btnNewButton_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_7.getText());
         }
      });
      btnNewButton_1_1_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_5.getText());
         }
      });
      btnNewButton_2_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_5.getText());
         }
      });
      btnNewButton_1_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_9.getText());
         }
      });
      btnNewButton_1_2_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_5.getText());
         }
      });
      btnNewButton_1_3_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_5.getText());
         }
      });
      btnNewButton_1_4_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_8.getText());
         }
      });
      btnNewButton_1_4_1_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_5.getText());
         }
      });
      btnNewButton_1_4_2_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_5.getText());
         }
      });
      btnNewButton_1_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_9.getText());
         }
      });

      btnNewButton_1_4_3_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_6.getText());
         }
      });
      btnNewButton_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_8.getText());
         }
      });
      btnNewButton_1_1_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_6.getText());
         }
      });
      btnNewButton_2_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_6.getText());
         }
      });
      btnNewButton_1_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_9.getText());
         }
      });
         
      btnNewButton_1_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_10.getText());
         }
      });
      btnNewButton_1_2_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_6.getText());
         }
      });
      btnNewButton_1_3_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_6.getText());
         }
      });
      btnNewButton_1_4_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_9.getText());
         }
      });
      btnNewButton_1_4_1_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_6.getText());
         }
      });
      btnNewButton_1_4_2_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_6.getText());
         }
      });
      btnNewButton_1_4_3_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_7.getText());
         }
      });
      btnNewButton_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_9.getText());
         }
      });
      btnNewButton_1_1_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_7.getText());
         }
      });
      btnNewButton_2_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_7.getText());
         }
      });
      btnNewButton_1_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_11.getText());
         }
      });
      btnNewButton_1_2_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_7.getText());
         }
      });
      btnNewButton_1_3_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_7.getText());
         }
      });
      btnNewButton_1_4_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_10.getText());
         }
      });
      btnNewButton_1_4_1_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_7.getText());
         }
      });
      btnNewButton_1_4_2_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_7.getText());
         }
      });
      btnNewButton_1_4_3_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_8.getText());
         }
      });
      btnNewButton_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_10.getText());
         }
      });
      btnNewButton_1_1_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_8.getText());
         }
      });
      btnNewButton_2_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_8.getText());
         }
      });
      btnNewButton_1_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_12.getText());
         }
      });
      btnNewButton_1_2_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_8.getText());
         }
      });
      btnNewButton_1_3_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_8.getText());
         }
      });
      btnNewButton_1_4_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_11.getText());
         }
      });
      btnNewButton_1_4_1_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_8.getText());
         }
      });
      btnNewButton_1_4_2_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_8.getText());
         }
      });
      btnNewButton_1_4_3_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_9.getText());
         }
      });
      btnNewButton_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_11.getText());
         }
      });
      btnNewButton_1_1_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_9.getText());
         }
      });
      btnNewButton_2_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_9.getText());
         }
      });
      btnNewButton_1_13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_13.getText());
         }
      });
      btnNewButton_1_2_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_9.getText());
         }
      });
      btnNewButton_1_3_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_9.getText());
         }
      });
      btnNewButton_1_4_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_12.getText());
         }
      });
      btnNewButton_1_4_1_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_9.getText());
         }
      });
      btnNewButton_1_4_2_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_9.getText());
         }
      });
      btnNewButton_1_4_3_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_10.getText());
         }
      });
      btnNewButton_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_12.getText());
         }
      });
      btnNewButton_1_1_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_10.getText());
         }
      });
      btnNewButton_2_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_10.getText());
         }
      });
      btnNewButton_1_14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_14.getText());
         }
      });
      btnNewButton_1_2_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_10.getText());
         }
      });
      btnNewButton_1_3_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_10.getText());
         }
      });
      btnNewButton_1_4_13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_13.getText());
         }
      });
      btnNewButton_1_4_1_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_10.getText());
         }
      });
      btnNewButton_1_4_2_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_10.getText());
         }
      });
      btnNewButton_1_4_3_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_11.getText());
         }
      });
      btnNewButton_13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_13.getText());
         }
      });
      btnNewButton_1_1_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_1_11.getText());
         }
      });
      btnNewButton_2_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_2_11.getText());
         }
      });
      btnNewButton_1_15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_15.getText());
         }
      });
      btnNewButton_1_2_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_2_11.getText());
         }
      });
      btnNewButton_1_3_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_3_11.getText());
         }
      });
      btnNewButton_1_4_14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_14.getText());
         }
      });
      btnNewButton_1_4_1_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_1_11.getText());
         }
      });
      btnNewButton_1_4_2_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            
            seatlist.add(btnNewButton_1_4_2_11.getText());
         }
      });
      btnNewButton_1_4_3_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_3_12.getText());
         }
      });
      btnNewButton_1_4_2_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(false); // 버튼 비활성화
            seatlist.add(btnNewButton_1_4_2_2.getText());
         }
      });
      
      //버튼 다시 선택
      
      List<JButton> buttons = new ArrayList<>();
      buttons.add(btnNewButton_1_4_3_12);
      buttons.add(btnNewButton_1_4_2_11);
      buttons.add(btnNewButton_1_4_1_11);
      buttons.add(btnNewButton_1_4_1_11);
      buttons.add(btnNewButton_1_4_14);
      buttons.add(btnNewButton_1_3_11);
      buttons.add(btnNewButton_1_2_11);
      buttons.add(btnNewButton_1_15);
      buttons.add(btnNewButton_2_11);
      buttons.add(btnNewButton_1_1_11);
      buttons.add(btnNewButton_13);
      buttons.add(btnNewButton_1_4_3_11);
      buttons.add(btnNewButton_1_4_2_10);
      buttons.add(btnNewButton_1_4_1_10);
      buttons.add(btnNewButton_1_4_13);
      buttons.add(btnNewButton_1_3_10);
      buttons.add(btnNewButton_1_2_10);
      buttons.add(btnNewButton_1_14);
      buttons.add(btnNewButton_2_10);
      buttons.add(btnNewButton_1_1_10);
      buttons.add(btnNewButton_12);
      buttons.add(btnNewButton_1_4_3_10);
      buttons.add(btnNewButton_1_4_2_9);
      buttons.add(btnNewButton_1_4_1_9);
      buttons.add(btnNewButton_1_4_12);
      buttons.add(btnNewButton_1_3_9);
      buttons.add(btnNewButton_1_2_9);
      buttons.add(btnNewButton_1_13);
      buttons.add(btnNewButton_2_9);
      buttons.add(btnNewButton_1_1_9);
      buttons.add(btnNewButton_11);
      buttons.add(btnNewButton_1_4_3_9);
      buttons.add(btnNewButton_1_4_2_8);
      buttons.add(btnNewButton_1_4_1_8);
      buttons.add(btnNewButton_1_4_11);
      buttons.add(btnNewButton_1_3_8);
      buttons.add(btnNewButton_1_2_8);
      buttons.add(btnNewButton_1_12);
      buttons.add(btnNewButton_2_8);
      buttons.add(btnNewButton_1_1_8);
      buttons.add(btnNewButton_10);
      buttons.add(btnNewButton_1_4_3_8);
      buttons.add(btnNewButton_1_4_2_7);
      buttons.add(btnNewButton_1_4_1_7);
      buttons.add(btnNewButton_1_4_10);
      buttons.add(btnNewButton_1_3_7);
      buttons.add(btnNewButton_1_2_7);
      buttons.add(btnNewButton_1_11);
      buttons.add(btnNewButton_2_7);
      buttons.add(btnNewButton_1_1_7);
      buttons.add(btnNewButton_9);
      buttons.add(btnNewButton_1_4_3_7);
      buttons.add(btnNewButton_1_4_2_6);
      buttons.add(btnNewButton_1_4_1_6);
      buttons.add(btnNewButton_1_4_9);
      buttons.add(btnNewButton_1_3_6);
      buttons.add(btnNewButton_1_2_6);
      buttons.add(btnNewButton_1_4_1_6);
      buttons.add(btnNewButton_1_4_9);
      buttons.add(btnNewButton_1_3_6);
      buttons.add(btnNewButton_1_2_6);
      buttons.add(btnNewButton_1_10);
      buttons.add(btnNewButton_2_6);
      buttons.add(btnNewButton_1_1_6);
      buttons.add(btnNewButton_8);
      buttons.add(btnNewButton_1_4_3_6);
      buttons.add(btnNewButton_1_4_2_5);
      buttons.add(btnNewButton_1_4_1_5);
      buttons.add(btnNewButton_1_4_8);
      buttons.add(btnNewButton_1_3_5);
      buttons.add(btnNewButton_1_2_5);
      buttons.add(btnNewButton_1_9);
      buttons.add(btnNewButton_2_5);
      buttons.add(btnNewButton_1_1_5);
      buttons.add(btnNewButton_7);
      buttons.add(btnNewButton_1_4_3_5);
      buttons.add(btnNewButton_1_4_2_4);
      buttons.add(btnNewButton_1_4_1_4);
      buttons.add(btnNewButton_1_4_7);
      buttons.add(btnNewButton_1_3_4);
      buttons.add(btnNewButton_1_2_4);
      buttons.add(btnNewButton_1_8);
      buttons.add(btnNewButton_2_4);
      buttons.add(btnNewButton_1_8);
      buttons.add(btnNewButton_2_4);
      buttons.add(btnNewButton_1_1_4);
      buttons.add(btnNewButton_6);
      buttons.add(btnNewButton_1_4_3_4);
      buttons.add(btnNewButton_1_4_2_3);
      buttons.add(btnNewButton_1_4_1_3);
      buttons.add(btnNewButton_1_4_6);
      buttons.add(btnNewButton_1_3_3);
      buttons.add(btnNewButton_1_2_3);
      buttons.add(btnNewButton_1_7);
      buttons.add(btnNewButton_2_3);
      buttons.add(btnNewButton_1_1_3);
      buttons.add(btnNewButton_5);
      buttons.add(btnNewButton_1_4_3_1_2);
      buttons.add(btnNewButton_1_4_2_2);
      buttons.add(btnNewButton_1_4_1_2);
      buttons.add(btnNewButton_1_4_5);
      buttons.add(btnNewButton_1_3_2);
      buttons.add(btnNewButton_1_2_2);
      buttons.add(btnNewButton_1_6);
      buttons.add(btnNewButton_2_2);
      buttons.add(btnNewButton_1_1_2);
      buttons.add(btnNewButton_4);
      buttons.add(btnNewButton_1_4_3_1_1);
      buttons.add(btnNewButton_1_4_3_2);
      buttons.add(btnNewButton_1_4_2_1);
      buttons.add(btnNewButton_1_4_1_1);
      buttons.add(btnNewButton_1_4_4);
      buttons.add(btnNewButton_1_3_1);
      buttons.add(btnNewButton_1_2_1);
      buttons.add(btnNewButton_1_5);
      buttons.add(btnNewButton_2_1);
      buttons.add(btnNewButton_1_1_1);
      buttons.add(btnNewButton_1_4_3);
      buttons.add(btnNewButton_1_4_2);
      buttons.add(btnNewButton_1_4_1);
      buttons.add(btnNewButton_1_4);
      buttons.add(btnNewButton_1_3);
      buttons.add(btnNewButton_1_2);
      buttons.add(btnNewButton_1_1);
      buttons.add(btnNewButton_2);
      buttons.add(btnNewButton_1);
      buttons.add(btnNewButton);
      
      
      
      JButton btnNewButton_3 = new JButton("다시 선택");
      btnNewButton_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      btnNewButton_3.setForeground(Color.DARK_GRAY);
      btnNewButton_3.setBackground(Color.WHITE);
      btnNewButton_3.setBounds(37, 22, 110, 29);
      MainPanel.add(btnNewButton_3);
      
      btnNewButton_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(true); // 버튼 비활성화
            for (JButton button : buttons) {
                button.setEnabled(true);
            }
            seatlist.clear();
         }
      });
      
      
      JButton btnNewButton_14 = new JButton("선택 완료");
      btnNewButton_14.setForeground(Color.DARK_GRAY);
      btnNewButton_14.setBackground(Color.WHITE);
      btnNewButton_14.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      btnNewButton_14.setBounds(540, 22, 114, 29);
      MainPanel.add(btnNewButton_14);
      
      btnNewButton_14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            clickedButton.setEnabled(true); // 버튼 비활성화
            MainPanel.setVisible(false);
            Order order = new Order();
            order.frame.setVisible(true);
            System.out.println(seatlist.toString());
         }
      });
      
      
      
      
      
   }
}