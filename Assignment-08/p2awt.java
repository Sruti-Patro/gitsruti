import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter //windowadapter is a class provided in listener
{
	public void windowClosing(WindowEvent e)	//event passed by cmponent window listener via object
	{
		System.exit(0);
	}
}
class AddDemo extends Frame implements ActionListener
{
	TextField t1,t2,t3; //3 textfield obj
	Button b; /*both of these are needed in multiple methods thus declared outside the local scope of consructor */
	AddDemo()
	{
		t1 = new TextField("11"); //buttons are created
		t1.setBounds(50,80,100,30);
		t2 = new TextField("22");
		t2.setBounds(50,120,100,30);
		t3 = new TextField();
		t3.setBounds(50,160,100,30);
		add(t1);
		add(t2);
		add(t3);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		b = new Button("Add");
		b.setBounds(50,200,100,30);
		add(b);
		b.addActionListener(this);
		addWindowListener(new MyClass());
	}
	public void actionPerformed(ActionEvent ae) //ae is the b obj passed by action listener
	{
		String s1 = t1.getText();
		String s2 = t2.getText();
		if(s1.isEmpty()||s2.isEmpty()) //can be omitted
		{
			t3.setText("added value");
		}
		else
		{
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a+b;
			String r = String.valueOf(c);
			t3.setText(r);
		}
	}
}
class p2awt
{
	public static void main(String args[])
	{
		AddDemo ad = new AddDemo();
		ad.setTitle("add 2 nos");
		ad.setResizable(false);
	}
}