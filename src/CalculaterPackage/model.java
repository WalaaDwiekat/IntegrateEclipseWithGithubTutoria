package CalculaterPackage;
import javax.swing.*;

public class model {

	double number;
    double number2;
	 double res;
	 char opt;
 
	public model()
	{
		res = 0;
		number = 0;
		number2=0;
	}
 
	public void setOperand(String opra) {
		if(opt==0) 
			number=Double.parseDouble(opra);	
			else {
				number2=Double.parseDouble(opra);
				calculate(opt);
				}
			
	}
	public void set(char operation)
	{
		opt = operation;
 
	
	}
	public char getO()
	{
		return opt;
 
	
	}
	
 
	public double getRes() {
		return res;
	}
 
	private void setRes(double res) 
	{
		this.res = res;
	}
 
	void calculate(char sign)
	{
		if(sign== '+') {
			res = number+number2; 
			setRes(res);
			
			}
		else if(sign== '-') {
			res = number-number2;
			setRes(res);
			
			}
 
		else if(sign== '/') {
			if (this.number2==0) {
				JOptionPane.showMessageDialog(null, "divide on 0 is not allowed");
			}
			else
			res= number/number2;
			setRes(res);
			
			}
		else if(sign== '%') {
			if (this.number2==0) {
				JOptionPane.showMessageDialog(null, "mod on 0 is not allowed");
			}
			else
			res = number%number2;
			setRes(res);
			
            }
			 
		else if(sign== '*') {
			res = number*number2;
			setRes(res);
			
            }
		
		
		else if(sign== '=') {
			setRes(res);
			}
		
		}
 public void clear() {
	 opt = 0;
		number = 0;
		res = 0;
		number2=0;
		setRes(res);
 }

public void square() {
	if(number<0)
		JOptionPane.showMessageDialog(null, "square root can’t accept any number less than 0");
	res = Math.sqrt(number);
	setRes(res);
}
}
