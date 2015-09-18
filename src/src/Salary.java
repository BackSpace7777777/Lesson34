package src;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Salary extends Main{
    private JPanel panel;
    private int year=0;
    private double raise[]=new double[20],currSal[]=new double[20];
    public Salary()
    {
        raise[0]=0;
        raise[1]=1200;
        currSal[0]=0;
        currSal[1]=40000;
        for(int i=2;i<20;i++)
        {
            currSal[i]=currSal[i-1]*1.03;
            raise[i]=currSal[i-1]*0.03;
        }
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.BLACK);
                g.fillRect(0,0,panel.getWidth(),panel.getHeight());
                repaint();
            }
        };
        panel.setBounds(5,40,685,625);
        panel.setVisible(false);
        frame.add(panel);
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
