
import java.awt.*;
import java.applet.*;

public class Param1 extends Applet{
	int r,sum,temp;    
 	int n;

public void init(){
r = Integer.parseInt(getParameter("Remainder") );
sum = Integer.parseInt(getParameter("Total") );
temp = Integer.parseInt(getParameter("Temporary") );
n = Integer.parseInt(getParameter( "Number") );

  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}

public void paint(Graphics g){
g.drawString("Remainder is:" +r , 30,60);
g.drawString("Sum is:" +sum , 30,80);
g.drawString("Last iteration for Palindrome is:" +n , 30,100);
}
}

/*
<applet code = "Param1" width = "400" height = "400">
<param name ="Remainder" value= 0>
<param name ="Total" value= 0>
<param name ="Temporary" value= 0>
<param name ="Number" value= "545">
</applet>
*/