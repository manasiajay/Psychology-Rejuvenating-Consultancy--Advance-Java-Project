import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="RegistrationForm.class" height=1000 width=1000></applet>*/

public class RegistrationForm extends Applet implements ActionListener, ItemListener
{
	String s_name=" ", genre=" ";
	String str = " ";
	int age;
	Checkbox Sh;
	TextField n=new TextField(10);
	CheckboxGroup g=new CheckboxGroup(); 
	Checkbox d=new Checkbox("drama",g,true);
	Checkbox t=new Checkbox("thriller",g,false);
	Choice c=new Choice();
	Label l1=new Label("Enter Series you want to watch:");
	Label l2=new Label("Choose genre:");
	Label l3=new Label("age:");
	Button b=new Button("SUBMIT");
	public void init()
	{
		b.setBackground(Color.green);
		c.setBackground(Color.green);
		
		add(l1);
 		add(n);
		add(l2);
		add(d);
		add(t);
		add(l3);
		c.add("10");
		c.add("15");
		c.add("20");
		c.add("25");
		c.add("30");
		c.add("35");
		add(c);
		add(b);
		b.addActionListener(this);

		Sh = new Checkbox("Sherlock Holmes" ,null, false);
		add(Sh);
		

		Sh.addItemListener(this);
	

		String info = "Sherlock Holmes, fictional character created by the Scottish writer Arthur Conan Doyle." + "The prototype for the modern mastermind detective, Holmes first appeared in Conan Doyle’s A Study in Scarlet, published in Beeton’s Christmas Annual of 1887.\n"+
		"As the worlds first and only consulting detective he pursued criminals throughout Victorian and Edwardian London, the south of England, and continental Europe\n"+
		"Although the fictional detective had been anticipated by Edgar Allan Poe’s C. Auguste Dupin and Émile Gaboriau’s Monsieur Lecoq, Holmes made a singular impact upon the popular imagination and has been the most enduring character of the detective story.\n"+
		"Conan Doyle modeled Holmes’s methods and mannerisms on those of Dr. Joseph Bell, who had been his professor at the University of Edinburgh Medical School. \n"+
		"In particular, Holmes’s uncanny ability to gather evidence based upon his honed skills of observation and deductive reasoning paralleled Bell’s method of diagnosing a patient’s disease.\n"+
		"Holmes offered some insight into his method, claiming that When you have excluded the impossible, whatever remains, however improbable, must be the truth.\n"+
		"His detecting abilities become clear, though no less amazing, when explained by his companion, Dr. John H. Watson, who recounts the criminal cases they jointly pursue.\n\n"+
		"By SIR ARTHER CONAN DOYLE ";

		TextArea text = new TextArea(info, 40, 60);
		add(text);
		setBackground(Color.black);
		setForeground(Color.white);

	}

	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		s_name=n.getText();
		genre=g.getSelectedCheckbox().getLabel();
		age=Integer.parseInt(c.getSelectedItem());
		repaint();
	}

	@Override
	public void itemStateChanged(ItemEvent x){
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Series name: "+s_name,20,100);
		g.drawString("Genre: "+genre,20,120);
		g.drawString("Your age: "+age,20,140);
		str = "Your default type is:";
		g.drawString(str,20,160);
		str = "Sherlock Holmes:" + Sh.getState();
		
	}
}