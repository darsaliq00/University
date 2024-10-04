import java.awt.Button; 
import java.applet.Applet; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.Component; 
/*<applet code=AButton.class width=100 height=100> 
  </applet> */ 
 
public class AButton extends Applet implements ActionListener { 
  public void init() { 
    // STEP 1: Compose the GUI 
    Button beepButton = new Button("Beep");  
    add(beepButton); 
 
    // STEP 2: Setup Event handlers 
    beepButton.addActionListener(this); 
 
    // STEP 3: Display the GUI (automatic -- this is an applet) 
  } 
public void actionPerformed(ActionEvent event) { 
    Component c = (Component)event.getSource(); 
   c.getToolkit().beep(); 
  } 

} 

