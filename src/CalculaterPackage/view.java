package CalculaterPackage;
import javax.swing.*;
import java.awt.*;
public class view {
	JButton oneButton, twoButton, threeButton, fourButton, fiveButton;
	JButton sixButton,sevenButton, eightButton, nineButton, zeroButton;
	JButton addButton, subButton, multiButton, divButton,modButton,sqrButton;
	JButton resetButton, equalButton;
	JPanel Panel1;
	JTextField textFeild;
 
	JFrame frame;
 
	
 
	view()
	{ 
		addButton= new JButton("+");
		addButton.setPreferredSize(new Dimension(10,10));
		subButton= new JButton("-");
		multiButton= new JButton("*");
		divButton= new JButton("/");
        modButton =new JButton("%");
        sqrButton= new JButton("sqr");
		resetButton= new JButton("C");
		equalButton= new JButton("=");
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton= new JButton("4");
		fiveButton= new JButton("5");
		sixButton= new JButton("6");
		sevenButton= new JButton("7");
		eightButton= new JButton("8");
		nineButton= new JButton("9");
		zeroButton= new JButton("0");
		textFeild = new JTextField();
		textFeild.setPreferredSize(new Dimension(400,60));
		textFeild.setFont( new Font("SansSerif", Font.BOLD, 25));
		frame = new JFrame("My Calculator");
		frame.setSize(400,500);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		
 
	    Panel1 = new JPanel();
	    Panel1.setLayout(new GridLayout(5,4));
	    Panel1.add(resetButton);
	    Panel1.add(addButton);
		Panel1.add(subButton);
		Panel1.add(multiButton);
		Panel1.add(oneButton);
		Panel1.add(twoButton);
	    Panel1.add(threeButton);
		Panel1.add(divButton);
		Panel1.add(fourButton);
		Panel1.add(fiveButton);
		Panel1.add(sixButton);
		Panel1.add(modButton);
		Panel1.add(sevenButton);
		Panel1.add(eightButton);
		Panel1.add(nineButton);
		Panel1.add(equalButton);
		Panel1.add(sqrButton);
		Panel1.add(zeroButton);
 
		
		frame.add(textFeild,BorderLayout.NORTH);
		frame.add(Panel1);
		frame.setResizable(false);
		frame.setVisible(true);
	}
 
	
 
	void setTextValue(double value)
	{
		
		textFeild.setText(Double.toString(value));
	}
 
	
	double getTextFeildValue()
	{
		double value = Double.parseDouble(textFeild.getText());
 
		return value;
	}

}
