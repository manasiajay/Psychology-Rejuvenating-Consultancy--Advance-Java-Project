import java.awt.*;
import java.applet.*;

public class Library extends Applet{
	String name,i_date, i_month;

public void init(){
name = getParameter("C_name");
i_date = getParameter("Issue1");
i_month = getParameter("Issue2");
}

public void paint(Graphics g){
g.drawString("Customer name:" +name , 30,60);
g.drawString("Customer issue date:" +i_date , 30,80);
g.drawString("Month of issued books:" +i_month , 30,100);
}
}

/*
<applet code = "Library.class" width = "400" height = "400">
<param name ="C_name" value="manasi">
<param name="Issue1" value="November">
<param name="Issue2" value="November">
</applet>
*/