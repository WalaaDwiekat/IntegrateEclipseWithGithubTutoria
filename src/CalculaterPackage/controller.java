package CalculaterPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class controller {
	
	model model;
	view view;
 
	controller(model model,view view)
	{
		this.model = model;
		this.view = view;
		view.addButton.addActionListener(new Actions());
		view.subButton.addActionListener(new Actions());
		view.modButton.addActionListener(new Actions());
		view.sqrButton.addActionListener(new Actions());
		view.multiButton.addActionListener(new Actions());
		view.divButton.addActionListener(new Actions());
		view.equalButton.addActionListener(new Actions());
		view.resetButton.addActionListener(new Actions());
		view.oneButton.addActionListener(new Actions());
		view.twoButton.addActionListener(new Actions());
		view.threeButton.addActionListener(new Actions());
		view.fourButton.addActionListener(new Actions());
		view.fiveButton.addActionListener(new Actions());
		view.sixButton.addActionListener(new Actions());
		view.sevenButton.addActionListener(new Actions());
		view.eightButton.addActionListener(new Actions());
		view.nineButton.addActionListener(new Actions());
		view.zeroButton.addActionListener(new Actions());
	}
	class Actions implements ActionListener
	{
 
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try{
				 if(e.getSource() == view.oneButton)
				{
					model.setOperand("1");
					view.setTextValue(1);
 
				}
				else if(e.getSource() == view.twoButton)
				{
					model.setOperand("2");
					view.setTextValue(2);
 
				}
				else if(e.getSource() == view.threeButton)
				{
					model.setOperand("3");
					view.setTextValue(3);
				}
				else if(e.getSource() == view.fourButton)
				{
					model.setOperand("4");
					view.setTextValue(4);
				}
				else if(e.getSource() == view.fiveButton)
				{
					model.setOperand("5");
					view.setTextValue(5);
				}
				else if(e.getSource() == view.sixButton)
				{
					model.setOperand("6");
					view.setTextValue(6);
				}
				else if(e.getSource() == view.sevenButton)
				{
					model.setOperand("7");
					view.setTextValue(7);
				}
				else if(e.getSource() == view.eightButton)
				{
					model.setOperand("8");
					view.setTextValue(8);
				}
				else if(e.getSource() == view.nineButton)
				{
					model.setOperand("9");
					view.setTextValue(9);
				}
				else if(e.getSource() == view.zeroButton)
				{
					model.setOperand("0");
					view.setTextValue(0);
				}
 
				else if(e.getSource() == view.addButton)
				{
					model.set('+');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.subButton)
				{
					model.set('-');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.divButton)
				{
					model.set('/');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.sqrButton)
				{
					model.square();
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.multiButton)
				{
					model.set('*');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.modButton)
				{
					model.set('%');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.equalButton)
				{
					model.set('=');
 
					view.setTextValue(model.getRes());
				}
				else if(e.getSource() == view.resetButton)
				{
					model.clear();
 
					view.setTextValue(model.getRes());
				}
				
				
			}catch(Exception ex)
			{
				System.out.println("There was an ERROR! "+ex);
 
			}
 
		}
 
 
	}
}
