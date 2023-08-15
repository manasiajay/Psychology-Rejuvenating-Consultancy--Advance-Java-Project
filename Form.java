import java.awt.*;
import java.applet.*;
public class Form extends java.applet.Applet 
{
    public void init() 
    {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new Label("Product Name          :"));
        add(new TextField(15));

        add(new Label("Product ID       :"));
        add(new TextField(15));
        
        add(new Label("Price      :"));
        add(new TextField(15)); 
        

        add(new Label("Bulk order        :"));
        Choice ch = new Choice(); 
        ch.addItem("Yes"); 
        ch.addItem("No"); 
        Component add = add(ch); 

        add(new Label("GST            :"));
        CheckboxGroup g = new CheckboxGroup();
        add(new Checkbox("Yes", g, false));
        add(new Checkbox("No", g, false));
                
        add(new Button("SUBMIT"));
        add(new Button("CLOSE"));
        }
}
/*
<applet code="Form.class" width=230 height=300>
</applet>
*/