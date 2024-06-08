import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
   public MyFrame(){
       super("Snowman");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setDefaultLookAndFeelDecorated(true);
       setBounds(300, 100, 700, 600);
       MyPanel panel = new MyPanel();
       Container container = getContentPane();
       container.add(panel, BorderLayout.CENTER);
       setVisible(true);
   }
}
