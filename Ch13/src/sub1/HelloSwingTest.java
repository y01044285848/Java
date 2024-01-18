package sub1;


import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이승윤
 * 내용 : Java Swing 실습하기
 */
public class HelloSwingTest {
	public static void main(String[] args) {
		
		//윈도우 생성
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(300,200));
		frame.pack();
		frame.setVisible(true);
		
		Container pane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello Swing");
		pane.add(label);
		
		JButton button = new JButton("dd");
		pane.add(button);
		
	}
}
