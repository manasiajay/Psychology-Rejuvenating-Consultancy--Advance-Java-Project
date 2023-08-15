
import java.io.*;
import java.awt.*;
import java.awt.Graphics;
import java.applet.*;
public class Ptype extends Applet
{
  Image img1, img2, img3, img4, img5, img6, img7, img8;

  public void init()
  {
    try{
	System.out.println("******************************************************************Visualize your Personality Type************************************************************************************************************");
	 
    img1=getImage(getDocumentBase(),"a.png");
    img2=getImage(getDocumentBase(),"b.png");
    img3=getImage(getDocumentBase(),"c.png");
    img4=getImage(getDocumentBase(),"d.png");
    img5=getImage(getDocumentBase(),"e.png");
    img6=getImage(getDocumentBase(),"f.png");
    img7=getImage(getDocumentBase(),"g.png");
    img8=getImage(getDocumentBase(),"h.png");
	}
  
   catch (NullPointerException ex){
	 
	}

   
    
}
  public void paint(Graphics g)
  {
   
    setBackground(Color.white);
    setForeground(Color.black);
   
    Font fb = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    Font fi = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    Font fbi = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);     

    Font fbx = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    Font fix = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    Font fbix = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);
    Font fiz = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);         
    Font fbiz = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);             
    g.setFont(fi);
    g.drawString("THE MASTERMIND: ",6,400);
    g.drawImage(img1,0,0,this);
    g.setFont(fb);
    g.drawString("THE ARCHITECT: ",500,400);
    g.drawImage(img2,500,0,this);
    g.setFont(fi);
    g.drawString("THE CHAMPION: ",1000,400);
    g.drawImage(img3,1000,0,this);
    g.setFont(fbi);
    g.drawString("THE INSPECTOR: ",1500,400);
    g.drawImage(img4,1500,0,this);
    g.setFont(fbx);
    g.setColor(Color.magenta);
    g.drawString("THE PROVIDER: ",12,500);
    g.drawImage(img5,12,500,this);
    g.setFont(fix);
    g.drawString("THE PERFORMER: ",500,500);
    g.drawImage(img6,500,500,this);
    g.setFont(fbix);
    g.drawString("THE VISIONARY: ",1000,500);
    g.drawImage(img7,1000,500,this);
    g.setFont(fiz);
    g.drawString("THE HEALER: ",1500,500);
    g.drawImage(img8,1500,500,this);
    g.setFont(fbiz);
   }
 
}
/*

<html>
<applet code = Ptype height=300 width=300>
</applet>
</html>
*/  