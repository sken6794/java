package holy.swing;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import holy.dao.FilmDAO;
import holy.dao.ScheduleDAO;
import holy.dao.TicketDAO;
import holy.vo.FilmVO;
import holy.vo.ScheduleVO;

import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketOrder {

	public JFrame frame;
	FilmDAO ticdao = new FilmDAO();
	ScheduleDAO sv = new ScheduleDAO();
	String selectedValue;
	String selectedValue2;
	String selectedValue3;
	String id2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketOrder window = new TicketOrder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicketOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel MainPanel = new ImagePanel(new ImageIcon("C:\\Users\\user\\Desktop\\course\\java\\work\\project2\\src\\image\\ticketorder.jpg").getImage());
		frame.setSize(new Dimension(790, 620));
		frame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane(); // 영화 리스트
		scrollPane.setBounds(85, 138, 173, 183);
		MainPanel.add(scrollPane);
		ArrayList<String> al = new ArrayList<>();
		List<FilmVO> fv = ticdao.getTitle();
		for(FilmVO f : fv) {
			al.add(f.getFilmTitle());
		}
		String[] arr = al.toArray(String[]::new);
		JList list = new JList(); // 영화리스트 
		list.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 14));

		list.setModel(new AbstractListModel() { // 영화리스트 목록
			String[] values = arr;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);

		JScrollPane scrollPane_1 = new JScrollPane(); // 날짜 선택 리스트
		scrollPane_1.setBounds(312, 138, 166, 183);
		MainPanel.add(scrollPane_1);
		JList list_1 = new JList(); // 날짜 선택 
		list_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));

		scrollPane_1.setViewportView(list_1);

		// 시간 선택~~~~~~~~~~~~~~~~~
		JScrollPane scrollPane_2 = new JScrollPane(); 
		scrollPane_2.setBounds(534, 138, 157, 183);
		MainPanel.add(scrollPane_2);
		JList list_3 = new JList();
		list_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
		scrollPane_2.setViewportView(list_3);





		JTextPane textPane = new JTextPane(); // 상세정보
		textPane.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 20));
		textPane.setText("");
		textPane.setBounds(101, 385, 403, 144);
		MainPanel.add(textPane);
		
		
		
		
		
		
		

		// 영화 선택 리스트 눌렀을때
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				selectedValue = (String) list.getSelectedValue();
				ArrayList<String> aa = new ArrayList<>();
				List<ScheduleVO> sb = sv.getDetail(selectedValue);
				String detail = sb.get(0).getFilmContent();
				textPane.setText(detail);
				
				StringBuilder sb2 = new StringBuilder(selectedValue);
				String answer="";
				for(int i = 0 ; i < sb2.length() ; i++) {
					if(sb2.charAt(i)!=':') {
						answer+=sb2.charAt(i);
					}
				}
			
				//사진 추가하자
				JPanel panel = new JPanel();
				panel.setBounds(534, 352, 157, 156);
				MainPanel.add(panel);
				String currentDirectory = System.getProperty("user.dir");
				String testpath = currentDirectory + "\\img\\"+ answer+".png";
				panel.setVisible(true);
				ImagePanel2 imagePanel = new ImagePanel2(testpath);
				panel.add(imagePanel);
				

				for(ScheduleVO a : sb) {
					String b = a.getScheDate().substring(0, 10);

					aa.add(b);

				}
				String [] arr = aa.stream().distinct().toArray((String[]::new));
								
				
				

				

				// 날짜 선택 리스트 만들기
				list_1.setModel(new AbstractListModel() {

					String[] values = arr;
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				scrollPane_1.setViewportView(list_1);



				//날짜 선택 리스트 눌렀을때


			}
		});
		list_1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selectedValue2 = (String) list_1.getSelectedValue();
				
				ArrayList<String> aa = new ArrayList<>();
				List<ScheduleVO> sb = sv.getDetail(selectedValue,selectedValue2);
				for(ScheduleVO a : sb) {
					String b = a.getScheTime();					
					aa.add(b);
				}
				String [] arr = aa.stream().distinct().toArray((String[]::new));

				// 날짜 선택 리스트 만들기
				list_3.setModel(new AbstractListModel() {

					String[] values = arr;
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				scrollPane_2.setViewportView(list_3);

			}
		});
		
		list_3.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selectedValue3 = (String) list_3.getSelectedValue();				
			}
		});

		JButton btnNewButton = new JButton("좌석 선택하기 ->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				SEAT_SWING seat = new SEAT_SWING();
				seat.id3 = id2;
				seat.title = ;
				seat.setVisible(true);
				
				
			}
		});
		btnNewButton.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(622, 546, 140, 27);
		MainPanel.add(btnNewButton);



	}
}
