package src;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PowersChart extends Main{
    private JPanel panel;
    public PowersChart()
    {
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.BLACK);
                g.fillRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.WHITE);
                
                repaint();
            }
        };
        panel.setBounds(5,40,455,200);
        panel.setVisible(false);
        frame.add(panel);
    }
    public void visible(boolean tf)
    {
        panel.setVisible(tf);
        if(tf)
        {
            frame.setSize(475,300);
            frame.setTitle("Lesson 3 and 4 - Powers Chart");
        }
    }
}
