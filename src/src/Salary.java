package src;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Salary extends Main{
    private JPanel panel;
    public Salary()
    {
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                
            }
        };
    }
    public void visible(boolean tf)
    {
        panel.setVisible(tf);
        if(tf)
        {
            frame.setTitle("Lesson2 and 3 - Salary Table");
            frame.setSize(700,700);
        }
    }
}
