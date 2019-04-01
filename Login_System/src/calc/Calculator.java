package calc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Calculator
{

	private JFrame frame;
	private JTextField textField;
	private JButton btnPlus;
	private JButton btnDot;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMinus;
	private JButton btnPlusMinus;
	private JButton btnMulti;
	private JButton btnC;
	private JButton btnBack;
	private JButton btnEquals;
	private JButton btnDivide;
	private JButton btnPercent;
	private JButton btnPi;
	private JButton btnSqrt;
	private JButton btnSquareX;
	private JButton btnCubeX;
	private JButton btnFactorial;
	private JButton btnOneByX;
	private JButton btnSin;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnLog;
	private JButton btnSinInverse;
	private JButton btnCosInverse;
	private JButton btnTanInverse;
	private JButton btnDegree;
	private JButton btnRadian;

	// Vars
	Double num1, num2, num3, result;
	String operation, operation1, answer;
	private JButton btnNpr;
	private JButton btnNcr;

	// Valids
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					window.frame.setTitle("Calculator v1.06");
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(0, 0, 663, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 630, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					if (textField.getText().contains(".") == true)
					{
						JOptionPane.showMessageDialog(null, "Not Allowed",
								"Error", JOptionPane.ERROR_MESSAGE);
					} else
					{
						String num = textField.getText() + btnDot.getText();
						textField.setText(num);
					}
				} else
				{
					JOptionPane.showMessageDialog(null, "Enter 0 first",
							"Info", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDot.setBounds(10, 253, 90, 50);
		frame.getContentPane().add(btnDot);

		btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				if (textField.getText().length() != 0)
				{
					if ((textField.getText().substring(0, 1).equals("P"))
							|| (textField.getText().substring(0, 1) == "C"))
					{
						JOptionPane.showMessageDialog(null,
								"Enter Non-Negative Value", "Data Invalid",
								JOptionPane.ERROR_MESSAGE);
					} else if (validateNeg(textField.getText().substring(0, 1)) == false)
					{
						double opp = Double.parseDouble(String
								.valueOf(textField.getText().substring(1)));
						opp = opp * (-1);
						textField.setText(textField.getText().substring(0, 1)
								+ String.valueOf(opp));
					} else
					{
						double opp = Double.parseDouble(String
								.valueOf(textField.getText()));
						opp = opp * (-1);
						textField.setText(String.valueOf(opp));
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnPlusMinus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlusMinus.setBounds(190, 253, 90, 50);
		frame.getContentPane().add(btnPlusMinus);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBounds(100, 253, 90, 50);
		frame.getContentPane().add(btn0);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn1.getText();
				textField.setText(num);

			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBounds(10, 203, 90, 50);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				String num = textField.getText() + btn2.getText();
				textField.setText(num);

			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(100, 203, 90, 50);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				String num = textField.getText() + btn3.getText();
				textField.setText(num);

			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(190, 203, 90, 50);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn4.getText();
				textField.setText(num);

			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBounds(10, 153, 90, 50);
		frame.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn5.getText();
				textField.setText(num);

			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(100, 153, 90, 50);
		frame.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn6.getText();
				textField.setText(num);

			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(190, 153, 90, 50);
		frame.getContentPane().add(btn6);

		btn7 = new JButton("7");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn7.getText();
				textField.setText(num);

			}
		});
		btn7.setBounds(10, 103, 90, 50);
		frame.getContentPane().add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String num = textField.getText() + btn8.getText();
				textField.setText(num);

			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(100, 103, 90, 50);
		frame.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				String num = textField.getText() + btn9.getText();
				textField.setText(num);

			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(190, 103, 90, 50);
		frame.getContentPane().add(btn9);

		btnDivide = new JButton("/");
		btnDivide.setBackground(Color.ORANGE);
		btnDivide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					if (validateNum(textField.getText().substring(0, 1)) == false)
					{
						JOptionPane.showMessageDialog(null,
								"Invalid Operation", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else
					{
						num1 = Double.parseDouble(textField.getText());
						textField.setText("/");
						operation = "/";
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDivide.setBounds(280, 103, 80, 50);
		frame.getContentPane().add(btnDivide);

		btnMulti = new JButton("X");
		btnMulti.setBackground(Color.ORANGE);
		btnMulti.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					if (validateNum(textField.getText().substring(0, 1)) == false)
					{
						JOptionPane.showMessageDialog(null,
								"Invalid Operation", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else
					{
						num1 = Double.parseDouble(textField.getText());
						textField.setText("X");
						operation = "*";
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnMulti.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMulti.setBounds(280, 153, 80, 50);
		frame.getContentPane().add(btnMulti);

		btnMinus = new JButton("-");
		btnMinus.setBackground(Color.ORANGE);
		btnMinus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{

				if (textField.getText().length() != 0)
				{
					if (validateNum(textField.getText().substring(0, 1)) == false)
					{
						JOptionPane.showMessageDialog(null,
								"Click +/- Button after Entering Number",
								"Error", JOptionPane.ERROR_MESSAGE);
					} else
					{
						num1 = Double.parseDouble(textField.getText());
						textField.setText("-");
						operation = "-";
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMinus.setBounds(280, 203, 80, 50);
		frame.getContentPane().add(btnMinus);

		btnPlus = new JButton("+");
		btnPlus.setBackground(Color.ORANGE);
		btnPlus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					if (validateNum(textField.getText().substring(0, 1)) == false)
					{
						JOptionPane.showMessageDialog(null,
								"Invalid Operation", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else
					{
						num1 = Double.parseDouble(textField.getText());
						textField.setText("+");
						operation = "+";
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlus.setBounds(280, 253, 80, 50);
		frame.getContentPane().add(btnPlus);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC.setBounds(10, 303, 90, 50);
		frame.getContentPane().add(btnC);

		btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String back = null;
				if (textField.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					back = strB.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(100, 303, 90, 50);
		frame.getContentPane().add(btnBack);

		btnEquals = new JButton("=");
		btnEquals.setBackground(Color.RED);
		btnEquals.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num2 = Double.parseDouble(textField.getText().substring(1));
					if (operation == "+")
					{
						if (operation1 == "%")
						{
							result = Math.round((num1 + num3) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						} else
						{
							result = Math.round((num1 + num2) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						}

					}
					if (operation == "-")
					{
						if (operation1 == "%")
						{
							result = Math.round((num1 - num3) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						} else
						{
							result = Math.round((num1 - num2) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						}
					}
					if (operation == "*")
					{
						if (operation1 == "%")
						{
							result = Math.round((num1 * num3) * 10000000000.0) / 10000000000.0;
							;
							answer = String.valueOf(result);
							textField.setText(answer);
						} else
						{
							result = Math.round((num1 * num2) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						}
					}
					if (operation == "/")
					{
						if (operation1 == "%")
						{
							result = Math.round((num1 / num3) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						} else
						{
							result = Math.round((num1 / num2) * 10000000000.0) / 10000000000.0;
							answer = String.valueOf(result);
							textField.setText(answer);
						}
					}
					if (operation == "P")
					{
						// nPr = n!/(n-r)!
						if (num2 < 0)
						{
							JOptionPane.showMessageDialog(null,
									"Enter Non-Negative Value", "Data Invalid",
									JOptionPane.INFORMATION_MESSAGE);
						} else if ((num2.intValue() < num2))
						{
							JOptionPane.showMessageDialog(null,
									"Enter Integer Value ", "Data Invalid",
									JOptionPane.INFORMATION_MESSAGE);

						} else
						{
							result = fact(num1) / fact(num1 - num2);
							answer = String.valueOf(result);
							textField.setText(answer);
						}
					}
					if (operation == "C")
					{
						// nCr = n!/(n-r)!*r!
						if (num2 < 0)
						{
							JOptionPane.showMessageDialog(null,
									"Enter Non-Negative Value", "Data Invalid",
									JOptionPane.INFORMATION_MESSAGE);
						} else if ((num2.intValue() < num2))
						{
							JOptionPane.showMessageDialog(null,
									"Enter Integer Value ", "Data Invalid",
									JOptionPane.INFORMATION_MESSAGE);

						} else
						{
							result = fact(num1) / fact(num2)
									* fact(num1 - num2);
							answer = String.valueOf(result);
							textField.setText(answer);
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnEquals.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEquals.setBounds(190, 303, 90, 50);
		frame.getContentPane().add(btnEquals);

		btnPercent = new JButton("%");
		btnPercent.setBackground(Color.GREEN);
		btnPercent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num3 = Double.parseDouble(textField.getText().substring(1));
					num3 = (num3 * (num1 / 100));
					answer = String.valueOf(num3);
					textField.setText(answer);
					operation1 = "%";
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPercent.setBounds(370, 103, 90, 50);
		frame.getContentPane().add(btnPercent);

		btnSqrt = new JButton("\u221Ax");
		btnSqrt.setBackground(Color.GREEN);
		btnSqrt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					if (num1 < 0)
					{
						JOptionPane.showMessageDialog(null,
								"Enter Non-Negative Value", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);
					} else
						textField.setText(String.valueOf(Math.sqrt(num1)));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnSqrt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSqrt.setBounds(370, 153, 90, 50);
		frame.getContentPane().add(btnSqrt);

		btnSquareX = new JButton("x^2");
		btnSquareX.setBackground(Color.GREEN);
		btnSquareX.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.valueOf(Math.pow(num1, 2)));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnSquareX.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSquareX.setBounds(370, 253, 90, 50);
		frame.getContentPane().add(btnSquareX);

		btnOneByX = new JButton("1/x");
		btnOneByX.setBackground(Color.GREEN);
		btnOneByX.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.valueOf(1 / num1));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnOneByX.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnOneByX.setBounds(370, 203, 90, 50);
		frame.getContentPane().add(btnOneByX);

		btnCubeX = new JButton("x^3");
		btnCubeX.setBackground(Color.GREEN);
		btnCubeX.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.valueOf(Math.pow(num1, 3)));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnCubeX.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCubeX.setBounds(370, 303, 90, 50);
		frame.getContentPane().add(btnCubeX);

		btnFactorial = new JButton("n!");
		btnFactorial.setBackground(new Color(0, 255, 255));
		btnFactorial.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					if (num1 < 0)
					{
						JOptionPane.showMessageDialog(null,
								"Enter Non-Negative Value ", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);
					} else if ((num1.intValue() < num1))
					{
						JOptionPane.showMessageDialog(null,
								"Enter Integer Value ", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);

					} else
					{
						num1 = fact(num1);
						textField.setText(String.valueOf(num1));
					}
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnFactorial.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnFactorial.setBounds(460, 103, 90, 50);
		frame.getContentPane().add(btnFactorial);

		btnSin = new JButton("sin(x)");
		btnSin.setBackground(new Color(0, 255, 255));
		btnSin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f", Math.sin(num1)));
				} else
				{
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSin.setBounds(460, 153, 90, 50);
		frame.getContentPane().add(btnSin);

		btnCos = new JButton("cos(x)");
		btnCos.setBackground(new Color(0, 255, 255));
		btnCos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f", Math.cos(num1)));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCos.setBounds(460, 203, 90, 50);
		frame.getContentPane().add(btnCos);

		btnTan = new JButton("tan(x)");
		btnTan.setBackground(new Color(0, 255, 255));
		btnTan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f", Math.tan(num1)));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnTan.setBounds(460, 253, 90, 50);
		frame.getContentPane().add(btnTan);

		btnLog = new JButton("ln(x)");
		btnLog.setBackground(new Color(0, 255, 255));
		btnLog.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					num1 = Math.log(num1);
					textField.setText(String.valueOf(num1));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnLog.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLog.setBounds(460, 303, 90, 50);
		frame.getContentPane().add(btnLog);

		btnPi = new JButton("\u03C0");
		btnPi.setBackground(Color.ORANGE);
		btnPi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					JOptionPane.showMessageDialog(null, "Enter Operation",
							"Info", JOptionPane.INFORMATION_MESSAGE);
				} else
					textField.setText(textField.getText()
							+ String.valueOf(Math.PI));

			}
		});
		btnPi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPi.setBounds(280, 303, 80, 50);
		frame.getContentPane().add(btnPi);

		btnDegree = new JButton("Degree");
		btnDegree.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					num1 = Math.toDegrees(num1);
					textField.setText(String.valueOf(num1));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnDegree.setBounds(370, 69, 89, 23);
		frame.getContentPane().add(btnDegree);

		btnRadian = new JButton("Radian");
		btnRadian.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					num1 = Math.toRadians(num1);
					textField.setText(String.valueOf(num1));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);

			}
		});
		btnRadian.setBounds(461, 69, 89, 23);
		frame.getContentPane().add(btnRadian);

		btnSinInverse = new JButton("sin^-1");
		btnSinInverse.setBackground(Color.MAGENTA);
		btnSinInverse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f",
							(Math.asin(num1) * (180 / Math.PI))));
				} else
				{
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSinInverse.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSinInverse.setBounds(550, 153, 90, 50);
		frame.getContentPane().add(btnSinInverse);

		btnTanInverse = new JButton("tan^-1");
		btnTanInverse.setBackground(Color.MAGENTA);
		btnTanInverse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f",
							(Math.atan(num1) * (180 / Math.PI))));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnTanInverse.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnTanInverse.setBounds(550, 253, 90, 50);
		frame.getContentPane().add(btnTanInverse);

		btnCosInverse = new JButton("cos^-1");
		btnCosInverse.setBackground(Color.MAGENTA);
		btnCosInverse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					textField.setText(String.format("%.15f",
							(Math.acos(num1) * (180 / Math.PI))));
				} else
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnCosInverse.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCosInverse.setBounds(550, 203, 90, 50);
		frame.getContentPane().add(btnCosInverse);

		final JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (rdbtnStandard.isSelected())
				{
					enableStandard();
				}
			}
		});
		rdbtnStandard.setBounds(10, 61, 90, 35);
		frame.getContentPane().add(rdbtnStandard);

		final JRadioButton rdbtnScientific = new JRadioButton("Scientific");
		rdbtnScientific.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (rdbtnScientific.isSelected())
				{
					enableScientific();
				}
			}
		});
		rdbtnScientific.setBounds(100, 61, 90, 35);
		frame.getContentPane().add(rdbtnScientific);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnStandard);
		bg.add(rdbtnScientific);

		btnNpr = new JButton("nPr");
		btnNpr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					if (num1 < 0)
					{
						JOptionPane.showMessageDialog(null,
								"Enter Non-Negative Value", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);
					} else if ((num1.intValue() < num1))
					{
						JOptionPane.showMessageDialog(null,
								"Enter Integer Value ", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);

					} else
					{
						textField.setText("P");
						operation = "P";
					}
				} else
				{
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNpr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNpr.setEnabled(false);
		btnNpr.setBackground(Color.MAGENTA);
		btnNpr.setBounds(550, 103, 90, 50);
		frame.getContentPane().add(btnNpr);

		btnNcr = new JButton("nCr");
		btnNcr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (textField.getText().length() != 0)
				{
					num1 = Double.parseDouble(textField.getText());
					if (num1 < 0)
					{
						JOptionPane.showMessageDialog(null,
								"Enter Non-Negative Value", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);
					} else if ((num1.intValue() < num1))
					{
						JOptionPane.showMessageDialog(null,
								"Enter Integer Value ", "Data Invalid",
								JOptionPane.INFORMATION_MESSAGE);

					} else
					{
						textField.setText("C");
						operation = "C";
					}
				} else
				{
					JOptionPane.showMessageDialog(null, "Enter Number First",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNcr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNcr.setEnabled(false);
		btnNcr.setBackground(Color.MAGENTA);
		btnNcr.setBounds(550, 303, 90, 50);
		frame.getContentPane().add(btnNcr);

		disableAll();

	}

	public double fact(double num1)
	{

		if (num1 == 0)
			return 1;
		else if (num1 != 1)
			return num1 * fact(num1 - 1);
		else
			return num1;

	}

	public void disableAll()
	{
		btn0.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btnC.setEnabled(false);
		btnBack.setEnabled(false);
		btnEquals.setEnabled(false);
		btnDot.setEnabled(false);
		btnPlus.setEnabled(false);
		btnPlusMinus.setEnabled(false);
		btnMinus.setEnabled(false);
		btnDivide.setEnabled(false);
		btnMulti.setEnabled(false);
		btnPercent.setEnabled(false);
		btnPi.setEnabled(false);
		btnFactorial.setEnabled(false);
		btnSqrt.setEnabled(false);
		btnSquareX.setEnabled(false);
		btnCubeX.setEnabled(false);
		btnOneByX.setEnabled(false);
		btnSin.setEnabled(false);
		btnSinInverse.setEnabled(false);
		btnCos.setEnabled(false);
		btnCosInverse.setEnabled(false);
		btnTan.setEnabled(false);
		btnTanInverse.setEnabled(false);
		btnLog.setEnabled(false);
		btnDegree.setEnabled(false);
		btnRadian.setEnabled(false);
		textField.setEnabled(false);
	}

	public void enableStandard()
	{
		// JOptionPane.showMessageDialog(null, "Enabling Standard Workspace...",
		// "Enabling...", JOptionPane.YES_NO_OPTION);

		frame.setBounds(0, 0, 381, 400);
		textField.setBounds(10, 11, 350, 43);

		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btnC.setEnabled(true);
		btnBack.setEnabled(true);
		btnEquals.setEnabled(true);
		btnDot.setEnabled(true);
		btnPlus.setEnabled(true);
		btnPlusMinus.setEnabled(true);
		btnMinus.setEnabled(true);
		btnDivide.setEnabled(true);
		btnMulti.setEnabled(true);
		btnPi.setEnabled(true);
		textField.setEnabled(true);
	}

	public void enableScientific()
	{
		// JOptionPane.showMessageDialog(null,
		// "Enabling Scientific Workspace...",
		// "Enabling...", JOptionPane.INFORMATION_MESSAGE);

		frame.setBounds(0, 0, 663, 400);
		textField.setBounds(10, 11, 630, 43);

		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btnC.setEnabled(true);
		btnBack.setEnabled(true);
		btnEquals.setEnabled(true);
		btnDot.setEnabled(true);
		btnPlus.setEnabled(true);
		btnPlusMinus.setEnabled(true);
		btnMinus.setEnabled(true);
		btnDivide.setEnabled(true);
		btnMulti.setEnabled(true);
		btnPi.setEnabled(true);
		btnPercent.setEnabled(true);
		btnFactorial.setEnabled(true);
		btnSqrt.setEnabled(true);
		btnSquareX.setEnabled(true);
		btnCubeX.setEnabled(true);
		btnOneByX.setEnabled(true);
		btnSin.setEnabled(true);
		btnSinInverse.setEnabled(true);
		btnCos.setEnabled(true);
		btnCosInverse.setEnabled(true);
		btnTan.setEnabled(true);
		btnTanInverse.setEnabled(true);
		btnLog.setEnabled(true);
		btnDegree.setEnabled(true);
		btnRadian.setEnabled(true);
		textField.setEnabled(true);
		btnNcr.setEnabled(true);
		btnNpr.setEnabled(true);
	}

	public static boolean validateNum(String text)
	{
		try
		{
			@SuppressWarnings("unused")
			double d = Double.parseDouble(text);
			return true;
		} catch (NumberFormatException e)
		{
			return true;
		}
	}

	public static boolean validateNeg(String text)
	{
		try
		{
			@SuppressWarnings("unused")
			double d = Double.parseDouble(text);
			return true;
		} catch (NumberFormatException e)
		{
			return false;
		}
	}
}