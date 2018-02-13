package CalculaterPackage;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestCases {
	
	model obj=new model();
	double result;

	@Test
	public void TestAdd() {
		obj.number=4.0;
		obj.number2=2.0;
		obj.calculate('+');
		result=obj.getRes();
		if(result==6.0)
			JOptionPane.showMessageDialog(null, "Add is Successed");
			
	}
	@Test
	public void TestSub() {
		obj.number=4.0;
		obj.number2=2.0;
		obj.calculate('-');
		result=obj.getRes();
		if(result==2.0)
			JOptionPane.showMessageDialog(null, "Sub is Successed");
			
	}
	@Test
	public void Testmul() {
		obj.number=4;
		obj.number2=7;
	obj.calculate('*');
	
	if (obj.getRes()==28) {
		JOptionPane.showMessageDialog(null, "Multiplication is Successed");
	}

	}
	@Test
	public void Testdiv() {
		obj.number=25;
		obj.number2=5;
	obj.calculate('/');
	
	if (obj.getRes()==5) {
		JOptionPane.showMessageDialog(null, "divition is Successed");
	}
	
	 

	}
	@Test
	public void Testmod() {
		obj.number=5;
		obj.number2=3;
	obj.calculate('%');
	
	if (obj.getRes()==2) {
		JOptionPane.showMessageDialog(null, "Mod is Successed");
	}

	}
	
	@Test
	public void Testdivby0() {
		obj.number=3;
		obj.number2=0;
	obj.calculate('/');
	

	}
	@Test
	public void Testsqrt() {
		obj.number=-3;
	obj.square();
	

	}
	@Test
	public void Testmodby0() {
		obj.number=3;
		obj.number2=0;
	obj.calculate('%');
	

	}
}
