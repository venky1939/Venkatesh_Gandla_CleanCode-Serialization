import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class SimpleInterest extends JFrame implements ActionListener {
	
	
	Label PrincipalAmount,TimePeriod,RateOfInterest,SI,CI;
	TextField AmountInput,TimeInput,RateOfInterestInput,SimpleInterestOutput,CompoundInterestOutput;
	Button SInterest;
	
	
	
SimpleInterest(){
	setLayout(null);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	PrincipalAmount =new Label("Principal Amount:");
	add(PrincipalAmount);
	PrincipalAmount.setBounds(20, 50, 100, 20);
	AmountInput=new TextField(20);
	add(AmountInput);
	AmountInput.setBounds(120, 50, 150, 20);
	TimePeriod =new Label("Time Period:");
	add(TimePeriod);
	TimePeriod.setBounds(20, 80, 100, 20);
	TimeInput=new TextField(20);
	add(TimeInput);
	TimeInput.setBounds(120, 80, 150, 20);
	
	RateOfInterest =new Label("Rate Of Interest:");
	add(RateOfInterest);
	RateOfInterest.setBounds(20, 110, 100, 20);
	RateOfInterestInput=new TextField(20);
	add(RateOfInterestInput);
	RateOfInterestInput.setBounds(120, 110, 150, 20);
	
	SInterest = new Button("Calculate");
	add(SInterest);
	SInterest.setBounds(20, 140, 100, 20);
	
	SI=new Label("Simple Interest:");
	add(SI);
	SI.setBounds(20, 170, 100, 20);
	SimpleInterestOutput=new TextField(20);
	add(SimpleInterestOutput);
	SimpleInterestOutput.setBounds(120, 170, 150, 20);
	SimpleInterestOutput.setEditable(false);
	
	SInterest.addActionListener(this);
	setVisible(true);
	
	CI=new Label("Compound Interest");
	add(CI);
	CI.setBounds(20, 200, 100, 20);
	CompoundInterestOutput=new TextField(20);
	add(CompoundInterestOutput);
	CompoundInterestOutput.setBounds(120, 200, 150, 20);
	CompoundInterestOutput.setEditable(false);
	SInterest.addActionListener(this);
	setVisible(true);
}

	

public void actionPerformed(ActionEvent ae) {
	// TODO Auto-generated method stub
	try {
		float amount = Float.parseFloat(AmountInput.getText());
		float time = Float.parseFloat(TimeInput.getText());
		float rate = Float.parseFloat(RateOfInterestInput.getText());
		float simpleinterest=(amount*time*rate)/100;
		float compound=(float) (amount * Math.pow(1+rate/100,time)-amount);
		SimpleInterestOutput.setText(String.valueOf(simpleinterest));
		CompoundInterestOutput.setText(String.valueOf(compound));
	}catch(NumberFormatException ex) {
		JOptionPane.showMessageDialog(this,ex.getMessage());
	}
	
	
}
}
public class Interest{
	public static void main(String args[]) {
		SimpleInterest si=new SimpleInterest();
	}
}
