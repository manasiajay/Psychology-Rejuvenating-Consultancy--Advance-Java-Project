import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class GUI_components extends Applet implements ItemListener{
	String str = " ";
	Checkbox Sh, Rusk;
	
	public void init(){
		Sh = new Checkbox("Sherlock Holmes,null, true");
		Rusk = new Checkbox("Ruskin Bond");
		add(Sh);
		add(Rusk);
		Sh.addItemListener(this);
		Rusk.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent x){
		repaint();
	}

	public void paint(Graphics z){
		str = "Active !";
		z.drawString(str,6,80);
		str = "Sherlock Holmes:" + Sh.getState();
		z.drawString(str,6,100);
		str = "Ruskin Bond:" +Rusk.getState();
		z.drawString(str,6,120);
		}
}
