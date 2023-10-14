
package schoolmanagementsystem;

import javax.swing.*;
import java.awt.*;


public class Splash {
   public static void main(String[] args){
       SplashFrame frame = new SplashFrame();
       frame.setVisible(true);
       int x =1;
       for(int i=1; i<=700; i+=5, x+=4){
       frame.setLocation(10, 20);
       frame.setSize(x+i, i);
       
       }
       
       frame.setVisible(true);
       
   }
    
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    JFrame f = new JFrame();
    
    SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("schoolmanagementsystem/icons/management.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
         
        t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
            this.setVisible(false);
            new login().setVisible(true);
        }catch(Exception e){}
    }

}
