package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	private JTextField num5;
	private JTextField num6;
	private JTextField num8;
	private JCheckBox chk1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 83, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 버튼을 클릭했을 때 실행되는 리스너(헨들러)
				System.out.println("확인1 클릭!!!");
				
				
			}
		});
		btn1.setBounds(32, 58, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
				
			}
		});
		btn2.setBounds(182, 58, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!!","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("yes 클릭");
				}else {
					System.out.println("no 클릭");
				}
				
			}
		});
		btn3.setBounds(326, 58, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(22, 33, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트 필드 실습");
		lblNewLabel_2.setBounds(12, 90, 106, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(58, 115, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("아이디");
		lblNewLabel_2_1.setBounds(12, 118, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnUid = new JButton("확인");

		btnUid.setBounds(182, 114, 63, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(259, 118, 83, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(259, 150, 83, 15);
		frame.getContentPane().add(lbResultName);
		
		JButton btnName = new JButton("확인");

		btnName.setBounds(182, 146, 63, 23);
		frame.getContentPane().add(btnName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(58, 147, 116, 21);
		frame.getContentPane().add(txtName);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("이름");
		lblNewLabel_2_1_1.setBounds(12, 150, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(259, 179, 83, 15);
		frame.getContentPane().add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.setBounds(182, 175, 63, 23);
		frame.getContentPane().add(btnHp);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(58, 176, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("휴대폰");
		lblNewLabel_2_1_2.setBounds(12, 179, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("덧셈");
		lblNewLabel_2_1_2_1.setBounds(12, 240, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		num1 = new JTextField();
		num1.setColumns(10);
		num1.setBounds(58, 237, 48, 21);
		frame.getContentPane().add(num1);
		
		JButton btnPlus = new JButton("확인");

		btnPlus.setBounds(182, 236, 63, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과 :");
		lbResultPlus.setBounds(259, 240, 83, 15);
		frame.getContentPane().add(lbResultPlus);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		lblNewLabel_3.setBounds(113, 240, 13, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(126, 237, 48, 21);
		frame.getContentPane().add(num2);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("뺄셈");
		lblNewLabel_2_1_2_1_1.setBounds(12, 269, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_1);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(58, 266, 48, 21);
		frame.getContentPane().add(num3);
		
		JLabel lblNewLabel_3_1 = new JLabel("-");
		lblNewLabel_3_1.setBounds(113, 269, 13, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(126, 266, 48, 21);
		frame.getContentPane().add(num4);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.setBounds(182, 265, 63, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbResultMinus = new JLabel("결과 :");
		lbResultMinus.setBounds(259, 269, 83, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lblNewLabel_2_1_2_1_2 = new JLabel("곱셈");
		lblNewLabel_2_1_2_1_2.setBounds(12, 298, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_2);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(58, 295, 48, 21);
		frame.getContentPane().add(num5);
		
		JLabel lblNewLabel_3_2 = new JLabel("*");
		lblNewLabel_3_2.setBounds(113, 298, 13, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		num6 = new JTextField();
		num6.setColumns(10);
		num6.setBounds(126, 295, 48, 21);
		frame.getContentPane().add(num6);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.setBounds(182, 294, 63, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbResultMulti = new JLabel("결과 :");
		lbResultMulti.setBounds(259, 298, 83, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lblNewLabel_2_1_2_1_3 = new JLabel("나눗셈");
		lblNewLabel_2_1_2_1_3.setBounds(12, 327, 48, 15);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_3);
		
		JTextField num7 = new JTextField();
		num7.setColumns(10);
		num7.setBounds(58, 324, 48, 21);
		frame.getContentPane().add(num7);
		
		JLabel lblNewLabel_3_3 = new JLabel("/");
		lblNewLabel_3_3.setBounds(113, 327, 13, 15);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		num8 = new JTextField();
		num8.setColumns(10);
		num8.setBounds(126, 324, 48, 21);
		frame.getContentPane().add(num8);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.setBounds(182, 323, 63, 23);
		frame.getContentPane().add(btnDiv);
		
		JLabel lbResultDiv = new JLabel("결과 :");
		lbResultDiv.setBounds(259, 327, 83, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JLabel lblNewLabel_4 = new JLabel("체크박스 실습");
		lblNewLabel_4.setBounds(12, 374, 83, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 395, 67, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(83, 395, 67, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(154, 395, 67, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(225, 395, 67, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(296, 395, 67, 23);
		frame.getContentPane().add(chk5);
		
		JButton brnCheck = new JButton("확인");

		brnCheck.setBounds(366, 395, 57, 23);
		frame.getContentPane().add(brnCheck);
		
		JLabel lbCheckResult = new JLabel("결과 : ");
		lbCheckResult.setBounds(12, 434, 410, 15);
		frame.getContentPane().add(lbCheckResult);
		
		
		
		
		// 이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultName.setText("결과 : " + name);
				
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultHp.setText("결과 : " + hp);
				
			}
		});
		
		// 사칙연산 버튼 이벤트
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num1.getText());
				int b = Integer.parseInt(num2.getText());
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultPlus.setText("결과 : " + (a+b));
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num3.getText());
				int b = Integer.parseInt(num4.getText());
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultMinus.setText("결과 : " + (a-b));
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num5.getText());
				int b = Integer.parseInt(num6.getText());
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultMulti.setText("결과 : " + (a*b));
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(num7.getText());
				int b = Integer.parseInt(num8.getText());
				// 결과 라벨에 가져온 문자열 입력하기
				lbResultDiv.setText("결과 : " + (a/b));
			}
		});
		
		// 체크박스 실습
		brnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText(cities.toString());
			}
		});
		
	}
}
