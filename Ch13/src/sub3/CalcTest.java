package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int operator = 0; // 1:더하기, 2:빼기, 3:곱하기, 4:나누기

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 318, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfResult = new JTextField();
		tfResult.setBackground(new Color(255, 255, 255));
		tfResult.setForeground(new Color(0, 0, 0));
		tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
		tfResult.setFont(new Font("굴림", Font.PLAIN, 24));
		tfResult.setEditable(false);
		tfResult.setText("0");
		tfResult.setBounds(12, 10, 276, 71);
		frame.getContentPane().add(tfResult);
		tfResult.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 91, 60, 57);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBounds(84, 91, 60, 57);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBounds(156, 91, 60, 57);
		frame.getContentPane().add(btn9);

		JButton btnDiv = new JButton("/");

		btnDiv.setBounds(228, 91, 60, 57);
		frame.getContentPane().add(btnDiv);

		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 158, 60, 57);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(84, 158, 60, 57);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(156, 158, 60, 57);
		frame.getContentPane().add(btn6);

		JButton btnMul = new JButton("*");

		btnMul.setBounds(228, 158, 60, 57);
		frame.getContentPane().add(btnMul);

		JButton btn1 = new JButton("1");

		btn1.setBounds(12, 225, 60, 57);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBounds(84, 225, 60, 57);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(156, 225, 60, 57);
		frame.getContentPane().add(btn3);

		JButton btnMin = new JButton("-");

		btnMin.setBounds(228, 225, 60, 57);
		frame.getContentPane().add(btnMin);

		JButton btnC = new JButton("C");

		btnC.setBounds(12, 292, 60, 57);
		frame.getContentPane().add(btnC);

		JButton btn0 = new JButton("0");
		btn0.setBounds(84, 292, 60, 57);
		frame.getContentPane().add(btn0);

		JButton btnResult = new JButton("=");

		btnResult.setBounds(156, 292, 60, 57);
		frame.getContentPane().add(btnResult);

		JButton btnPlu = new JButton("+");

		btnPlu.setBounds(228, 292, 60, 57);
		frame.getContentPane().add(btnPlu);

		// button event
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "1";
				tfResult.setText(str);

			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "2";
				tfResult.setText(str);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "3";
				tfResult.setText(str);
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "4";
				tfResult.setText(str);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "5";
				tfResult.setText(str);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "6";
				tfResult.setText(str);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "7";
				tfResult.setText(str);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "8";
				tfResult.setText(str);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "9";
				tfResult.setText(str);
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfResult.getText().equals("0")) {
					tfResult.setText("");
				}
				String str = tfResult.getText() + "0";
				tfResult.setText(str);
			}
		});

		/////////////////////////// 연산자 //////////////////////////////////
		// +
		btnPlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tfResult.getText();
				
				tfResult.setText(calc(str,"+"));
			}
		});
		
		// -
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tfResult.getText();
				
				tfResult.setText(calc(str,"-"));
			}
		});
		
		// *
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tfResult.getText();
				
				tfResult.setText(calc(str,"*"));
			}
		});
		
		// /
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tfResult.getText();
				
				tfResult.setText(calc(str,"/"));
			}
		});
		// clear
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfResult.setText("0");
			}
		});
		// =
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tfResult.getText();
				
				tfResult.setText(calc(str,""));
			}
		});

	}

	public static String calc(String txt,String sign){
		
		String[] strNum;
		int result = 0;
		
		
		if(txt.contains("+")) {
			strNum = txt.split("\\+");
			for(int i=0; i< strNum.length;i++) {
				if(i==0) {
					result = Integer.parseInt(strNum[0]);
				} else {
					result += Integer.parseInt(strNum[i]);
				}
				
			}
		}else if(txt.contains("-")) {
			strNum = txt.split("\\-");
			for(int i=0; i< strNum.length;i++) {
				if(i==0) {
					result = Integer.parseInt(strNum[0]);
				} else {
					result -= Integer.parseInt(strNum[i]);
				}
				
			}
		}else if(txt.contains("*")) {
			strNum = txt.split("\\*");
			for(int i=0; i< strNum.length;i++) {
				if(i==0) {
					result = Integer.parseInt(strNum[0]);
				} else {
					result *= Integer.parseInt(strNum[i]);
				}
				
			}
		}else if(txt.contains("/")) {
			strNum = txt.split("\\/");
			for(int i=0; i< strNum.length;i++) {
				if(i==0) {
					result = Integer.parseInt(strNum[0]);
				} else {
					result /= Integer.parseInt(strNum[i]);
				}
				
			}
		}
		else {
			result = Integer.parseInt(txt);
		}
		return result+sign;
		
	}
	
}
