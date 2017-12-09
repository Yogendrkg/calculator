
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
public class App2 extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField textField;
	private boolean newC=true;
	private float score;
	private String newD=null;
	String currentText=null;
	String currentText2=null;
	String exp;
	
	public float num;
	private JTextField textField_1;
	
	

	/**
	 * Launch the App2lication.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App2 frame = new App2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App2() {
		setResizable(false);
		setBackground(new Color(255, 250, 250));
		setTitle("Simple Basic Calculator");
		setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 500);
		JPanel jPanel = new JPanel();
		jPanel.setBackground(new Color(250, 250, 210));
		contentPane = jPanel;
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton bt1 = new JButton("1");
		bt1.setToolTipText("1");
		bt1.setBackground(new Color(255, 250, 250));
		bt1.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if(newC==true)
				{
					textField.setText(bt1.getText());
					textField_1.setText(bt1.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt1.getText());
					textField_1.setText(currentText2+bt1.getText());
					}
			}
			
		});
		bt1.setForeground(Color.RED);
		bt1.setBounds(10, 92, 55, 48);
		contentPane.add(bt1);
		
		final JButton bt4 = new JButton("4");
		bt4.setToolTipText("4");
		bt4.setBackground(new Color(255, 250, 250));
		bt4.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt4.getText());
					textField_1.setText(bt4.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt4.getText());
					textField_1.setText(currentText2+bt4.getText());
					}
			}
		});
		bt4.setForeground(Color.RED);
		bt4.setBounds(10, 151, 55, 48);
		contentPane.add(bt4);
		
		final JButton bt2 = new JButton("2");
		bt2.setToolTipText("2");
		bt2.setBackground(new Color(255, 250, 250));
		bt2.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt2.getText());
					textField_1.setText(bt2.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt2.getText());
					textField_1.setText(currentText2+bt2.getText());
					}
			}
		});
		bt2.setForeground(Color.RED);
		bt2.setBounds(75, 92, 55, 48);
		contentPane.add(bt2);
		
		final JButton bt3 = new JButton("3");
		bt3.setToolTipText("3");
		bt3.setBackground(new Color(255, 250, 250));
		bt3.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt3.getText());
					textField_1.setText(bt3.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt3.getText());
					textField_1.setText(currentText2+bt3.getText());
					}
			}
		});
		bt3.setForeground(Color.RED);
		bt3.setBounds(140, 92, 55, 48);
		contentPane.add(bt3);
		
		final JButton bt5 = new JButton("5");
		bt5.setToolTipText("5");
		bt5.setBackground(new Color(255, 250, 250));
		bt5.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt5.getText());
					textField_1.setText(bt5.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt5.getText());
					textField_1.setText(currentText2+bt5.getText());
					}
			}
		});
		bt5.setForeground(Color.RED);
		bt5.setBounds(75, 151, 55, 48);
		contentPane.add(bt5);
		
		final JButton bt6 = new JButton("6");
		bt6.setToolTipText("6");
		bt6.setBackground(new Color(255, 250, 250));
		bt6.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt6.getText());
					textField_1.setText(bt6.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt6.getText());
					textField_1.setText(currentText2+bt6.getText());
					}
			}
		});
		bt6.setForeground(Color.RED);
		bt6.setBounds(140, 151, 55, 48);
		contentPane.add(bt6);
		
		final JButton bt7 = new JButton("7");
		bt7.setToolTipText("7");
		bt7.setBackground(new Color(255, 250, 250));
		bt7.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt7.getText());
					textField_1.setText(bt7.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt7.getText());
					textField_1.setText(currentText2+bt7.getText());
					}
			}
		});
		bt7.setForeground(Color.RED);
		bt7.setBounds(10, 210, 55, 48);
		contentPane.add(bt7);
		
		final JButton bt8 = new JButton("8");
		bt8.setToolTipText("8");
		bt8.setBackground(new Color(255, 250, 250));
		bt8.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt8.getText());
					textField_1.setText(bt8.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt8.getText());
					textField_1.setText(currentText2+bt8.getText());
					}
			}
		});
		bt8.setForeground(new Color(255, 0, 0));
		bt8.setBounds(75, 210, 55, 48);
		contentPane.add(bt8);
		
		final JButton bt9 = new JButton("9");
		bt9.setToolTipText("9");
		bt9.setBackground(new Color(255, 250, 250));
		bt9.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt9.getText());
					textField_1.setText(bt9.getText());
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt9.getText());
					textField_1.setText(currentText2+bt9.getText());
					}
			}
		});
		bt9.setForeground(Color.RED);
		bt9.setBounds(140, 210, 55, 48);
		contentPane.add(bt9);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(new Color(220, 220, 220));
		textField.setToolTipText("RESULT");
		textField.setEditable(false);
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 379, 327, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton bt0 = new JButton("0");
		bt0.setToolTipText("0");
		bt0.setBackground(new Color(255, 250, 250));
		bt0.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(newC==true)
				{
					textField.setText(bt0.getText());
					textField_1.setText(bt0.getText());
					newC=true;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					textField.setText(currentText+bt0.getText());
					textField_1.setText(currentText2+bt0.getText());
					}
				
			}
		});
		bt0.setForeground(Color.RED);
		bt0.setBounds(75, 269, 55, 48);
		contentPane.add(bt0);
		
		final JButton btS = new JButton("-");
		btS.setToolTipText("Substract");
		btS.setBackground(new Color(255, 250, 250));
		btS.setFont(new Font("Dialog", Font.PLAIN, 20));
		btS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();
				textField_1.setText(currentText2+btS.getText());
				if(textField.getText().isEmpty())
					return;
				if(newD != null)
				{ switch(newD)
				{	case "+":
						score += Float.parseFloat(textField.getText());
						break;						
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					case "x":
						score =score*Float.parseFloat(textField.getText());
						break;
					case "/":
						score = score/Float.parseFloat(textField.getText());
						break;
					case "":
						break;					}
				}
				else{
					score = Float.parseFloat(textField.getText());
				}
				textField.setText("");				
				newD="-";
			}
		});
		btS.setForeground(Color.GREEN);
		btS.setBounds(205, 151, 55, 48);
		contentPane.add(btS);
		
		JButton btP = new JButton(".");
		btP.setToolTipText("Point");
		btP.setBackground(new Color(255, 250, 250));
		btP.setFont(new Font("Dialog", Font.BOLD, 20));
		btP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				if(newC==true)
				{	textField.setText("0.");
					textField_1.setText("0.");
					newC=false;
					}
				else
					{
					String currentText=textField.getText();
					String currentText2=textField_1.getText();
					if(currentText.indexOf(".") == -1)
					{ textField.setText(currentText + ".");
					textField_1.setText(currentText2 + "."); }
					}
			}
		});
		btP.setForeground(Color.GREEN);
		btP.setBounds(140, 269, 55, 48);
		contentPane.add(btP);
		
		JButton btE = new JButton("=");
		btE.setToolTipText("Equal to");
		btE.setBackground(new Color(255, 250, 250));
		btE.setFont(new Font("Dialog", Font.PLAIN, 20));
		btE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty())
					return;
				if(newD != null)
				{ switch(newD)
				{   case "+":
						score += Float.parseFloat(textField.getText());
						break;						
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					case "x":
						score =score*Float.parseFloat(textField.getText());
						break;
					case "/":
						score = score/Float.parseFloat(textField.getText());
						break;
					case "":
						break;
					}
				}
				else{
					score = Float.parseFloat(textField.getText());
				}
			 textField.setText(String.valueOf(score));	 
			 newD=null; }
		});
		btE.setForeground(Color.GREEN);
		btE.setBounds(205, 269, 55, 48);
		contentPane.add(btE);
		
		final JButton btC = new JButton("CLR");
		btC.setToolTipText("Clear");
		btC.setBackground(new Color(255, 250, 250));
		btC.setFont(new Font("Tahoma", Font.BOLD, 10));
		btC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				newC = true;
				newD =null;
				num=0;
			}
		});
		btC.setForeground(Color.GREEN);
		btC.setBounds(10, 267, 55, 48);
		contentPane.add(btC);
		
		final JButton btPP = new JButton("+");
		btPP.setToolTipText("Add");
		btPP.setBackground(new Color(255, 250, 250));
		btPP.setFont(new Font("Dialog", Font.PLAIN, 20));
		btPP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();				
				textField_1.setText(currentText2+btPP.getText());				
				if(textField.getText().isEmpty())
					return;
				if(newD != null)
				{ switch(newD)
			{    	case "+":
						score += Float.parseFloat(textField.getText());
						break;						
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					case "x":
						score =score*Float.parseFloat(textField.getText());
						break;
					case "/":
						score = score/Float.parseFloat(textField.getText());
						break;
					case "":
						break;					}
				}
				else
				{
					score = Float.parseFloat(textField.getText());
				}
     			textField.setText("");
				newD="+";
			}
		});
		btPP.setForeground(Color.GREEN);
		btPP.setBounds(270, 269, 67, 48);
		contentPane.add(btPP);
		
		final JButton btnNewButton = new JButton("/");
		btnNewButton.setToolTipText("Devide");
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();
				textField_1.setText(currentText2+btnNewButton.getText());
				if(textField.getText().isEmpty())
					return;
				if(newD != null)
				{ switch(newD)
				{ 	case "+":
						score += Float.parseFloat(textField.getText());
						break;
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					case "x":
						score =score*Float.parseFloat(textField.getText());
						break;
					case "/":
						score = score/Float.parseFloat(textField.getText());
						break;
					case "":
						break;					}
				}
				else
				{	score = Float.parseFloat(textField.getText());
				}
				textField.setText("");
				newD="/";				
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(205, 210, 55, 48);
		jPanel.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("x");
		btnNewButton_1.setToolTipText("Multiply");
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();				
				textField_1.setText(currentText2+btnNewButton_1.getText());
				if(textField.getText().isEmpty())
					return;
				if(newD != null)
				{ switch(newD)
			     {	case "+":
						score += Float.parseFloat(textField.getText());
						break;						
					case "-":
						score -= Float.parseFloat(textField.getText());
						break;
					case "x":
						score =score*Float.parseFloat(textField.getText());
						break;
					case "/":
						score = score/Float.parseFloat(textField.getText());
						break;
					case "":						
						break;					}
				}
				else
				{	score = Float.parseFloat(textField.getText());
				}
				textField.setText("");				
				newD="x";
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(205, 92, 55, 48);
		jPanel.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setToolTipText("Equation");
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setForeground(Color.BLUE);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(10, 38, 328, 43);
		jPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOff = new JButton("OFF");
		btnOff.setToolTipText("Shut OFF");
		btnOff.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOff.setForeground(Color.BLACK);
		btnOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				System.exit(0);
			}
					});
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOff.setBackground(new Color(255, 250, 250));
		btnOff.setBounds(270, 94, 68, 46);
		jPanel.add(btnOff);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResult.setForeground(Color.DARK_GRAY);
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(114, 340, 111, 28);
		jPanel.add(lblResult);
		
		/*JButton btnNewButton_2 = new JButton("SIN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();
				double degree = math.sin(Double.parseDouble(currentText2));
				textField.setText(String.valueOf(degree));
				textField_1.setText("sin"+currentText2);
				
				
	     }
		});
		btnNewButton_2.setBounds(345, 96, 55, 28);
		jPanel.add(btnNewButton_2);*/
		
		JButton btnNewButton_3 = new JButton("Log'10");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				currentText2=textField_1.getText();
				double log=Math.log10(Double.parseDouble(currentText2));
				textField.setText(String.valueOf(log));
				textField_1.setText("log"+currentText2);
			}
		});
		btnNewButton_3.setBounds(270, 151, 68, 48);
		jPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("log'e");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setForeground(Color.GRAY);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();
				double log=Math.log(Double.parseDouble(currentText2));
				textField.setText(String.valueOf(log));
				textField_1.setText("log"+currentText2);
			}
		});
		btnNewButton_4.setBounds(270, 212, 68, 48);
		jPanel.add(btnNewButton_4);
		
		JLabel lblEquation = new JLabel("Equation");
		lblEquation.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEquation.setForeground(Color.BLACK);
		lblEquation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquation.setBounds(127, 11, 86, 16);
		jPanel.add(lblEquation);
		
		/*JButton btnNewButton_5 = new JButton("PI");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				currentText2=textField_1.getText();
				double py=Math.PI;
				textField.setText(String.valueOf(py));
			}
		});
		btnNewButton_5.setBounds(348, 216, 76, 28);
		jPanel.add(btnNewButton_5);*/
	}
}
