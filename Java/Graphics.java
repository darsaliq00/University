// import statements  
import java.awt.*;    
import javax.swing.*;    
    
public class Graphics  
{   
   
JFrame frameObj;  
  
// constructor    
Graphics()  
{    
    // creating a frame object  
    frameObj = new JFrame();    
        
     // creating the buttons  
    JButton b1 = new JButton("1");    
    JButton b2 = new JButton("2");    
    JButton b3 = new JButton("3");    
    JButton b4 = new JButton("4");       
    
         
    // adding the buttons to frame        
    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);            
       
    // parameter less constructor is used  
    // therefore, alignment is center   
    // horizontal as well as the vertical gap is 5 units.  
    frameObj.setLayout(new FlowLayout(FlowLayout.RIGHT));    
        
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);    
}    
  
// main method  
public static void main(String argvs[])   
{    
    new Graphics();    
}    
}    