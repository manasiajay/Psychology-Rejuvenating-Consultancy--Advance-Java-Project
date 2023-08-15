import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class GUI_components extends Applet implements ItemListener{
	String str = " ";
	Checkbox Sh, Rusk, Nanc;
	CheckboxGroup grp;
	Choice drama, thriller;
	public void init(){
		grp = new CheckboxGroup();
		drama = new Choice();
		thriller = new Choice();
		Sh = new Checkbox("Sherlock Holmes" ,null, false);
		Rusk = new Checkbox("Ruskin Bond" ,grp,false);
		Nanc = new Checkbox("Nancy Drew" , grp, true);
		add(Sh);
		add(Rusk);
		add(Nanc);

		drama.add("College dramas");
		drama.add("Elite OP college drama");
		drama.add("Riverdale OP college drama");

		thriller.add("Sherlock Holmes game of shadows");
		thriller.add("Dexter");
		thriller.add("The Suits");
		
		thriller.select("Dexter");
		
		add(drama);
		add(thriller);

		Sh.addItemListener(this);
		Rusk.addItemListener(this);
		Nanc.addItemListener(this);
		drama.addItemListener(this);
		thriller.addItemListener(this);


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
	

	}
	
	public void itemStateChanged(ItemEvent x){
		repaint();
	}

	public void paint(Graphics z){
		str = "Your default type is:";
		z.drawString(str,6,80);
		str = "Sherlock Holmes:" + Sh.getState();
		z.drawString(str,6,100);
		str = "Ruskin Bond:" +Rusk.getState();
		z.drawString(str,6,120);
		str="Checkbox Group: current";
		str+=grp.getSelectedCheckbox().getLabel();
		z.drawString(str,7,140);
		
		str="Choice control 1 for DRAMA: current : ";
		str+=drama.getSelectedItem();
		z.drawString(str,8,160);
		str="Choice control 2 for THRILLERS: current: ";
		str+=thriller.getSelectedItem();
		z.drawString(str,8,180);

		//z.drawString("Give your Feedback:  " +feed.getText(), 10, 100);
		}
}
