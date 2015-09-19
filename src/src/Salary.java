package src;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Salary extends Main{
    private JPanel panel;
    private double raise[]=new double[20],currSal[]=new double[20];
    public Salary()
    {
        raise[0]=0;
        raise[1]=1200;
        currSal[0]=0;
        currSal[1]=40000;
        for(int i=2;i<20;i++)
        {
            currSal[i]=Math.round((currSal[i-1]*1.03)*100);
            currSal[i]=currSal[i]/100;
            raise[i]=Math.round((currSal[i-1]*0.03)*100);
            raise[i]=raise[i]/100;
        }
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.BLACK);
                g.fillRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.WHITE);
                g.drawString("Year",10,25);
                g.drawString("Old Salary",10+(150*1),25);
                g.drawString("Raise",10+(150*2),25);
                g.drawString("New Salary",10+(150*3),25);
                for(int i=0;i<4;i++)
                g.drawString("============",10+(150*i),35);
                for(int i=0;i<3;i++)
                {
                    for(int k=0;k<35;k++)
                    {
                        g.drawString("|",130+(150*i),35+(15*k));
                    }
                }
                for(int i=0;i<20;i++)
                {
                    g.drawString("" + (i+1),50,50+(20*i));
                    g.drawString("" + currSal[i],10+(150*1),50+(20*i));
                    g.drawString("" + raise[i],10+(150*2),50+(20*i));
                }
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
