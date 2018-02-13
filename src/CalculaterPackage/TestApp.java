package CalculaterPackage;

public class TestApp {
	public static void main(String[] args) 
	{
		model Model = new model();
		view View = new view();
 
		new controller(Model,View);
	}
}
