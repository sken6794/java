package holy.swing;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import holy.dao.FilmDAO;
import holy.vo.FilmVO;

public class Lesson extends JFrame{
	public Lesson() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image Panel Example");

        
        String currentDirectory = System.getProperty("user.dir");
        String imagePath = currentDirectory + "/images/test.png";
        
        //ImagePanel2 imagePanel = new ImagePanel2(imagePath);
        //add(imagePanel);
        // 패널 생성
        JPanel mainPanel = new JPanel(new GridLayout(1, 4)); // 2x2 그리드 레이아웃 사용
        
        FilmDAO fdao = new FilmDAO();
        List<FilmVO> list = fdao.getMovie();
        for (FilmVO filmVO : list) {
        	ImagePanel2 imagePanel = new ImagePanel2(currentDirectory+ filmVO.getFilmpath());
            mainPanel.add(imagePanel);
		}
        
        
        // 이미지 패널 생성 및 추가
        /*
        String imagePath1 = "path/to/your/image1.jpg";
        ImagePanel2 imagePanel = new ImagePanel2(currentDirectory+ "/images/test.png");
        mainPanel.add(imagePanel);

        String imagePath2 = "path/to/your/image2.jpg";
        ImagePanel2 imagePanel2 = new ImagePanel2(currentDirectory+ "/images/test2.png");
        mainPanel.add(imagePanel2);

        String imagePath3 = "path/to/your/image3.jpg";
        ImagePanel2 imagePanel3 = new ImagePanel2(currentDirectory+ "/images/test3.png");
        mainPanel.add(imagePanel3);

        String imagePath4 = "path/to/your/image4.jpg";
        ImagePanel2 imagePanel4 = new ImagePanel2(currentDirectory+ "/images/test4.png");
        mainPanel.add(imagePanel4);
         */
        // 메인 프레임에 패널 추가
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
    	Lesson frame = new Lesson();
    }
	
		
		
		
		
		
		
		
}
