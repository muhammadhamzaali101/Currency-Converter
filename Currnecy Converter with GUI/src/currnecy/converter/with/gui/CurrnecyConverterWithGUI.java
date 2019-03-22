
package currnecy.converter.with.gui;

import javax.swing.JFrame;
public class CurrnecyConverterWithGUI extends JFrame {

    public static void main(String[] args) {
        
        Gui g=new Gui();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(390,255);
        g.setLocation(450,250);
        g.setResizable(false);
        g.setVisible(true);
        
    }
}