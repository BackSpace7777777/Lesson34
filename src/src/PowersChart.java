package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PowersChart extends Main{
    private JPanel panel;
    private JTextField number;
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
                try
                {
                    if(Integer.valueOf(number.getText())>10)
                    {
                        number.setText("10");
                    }
                    else if(Integer.valueOf(number.getText())<1)
                    {
                        number.setText("1");
                    }
                }catch(Exception ex){number.setText("");}
                
                try
                {
                    for(int i=0;i<Integer.valueOf(number.getText());i++)
                    {
                        g.drawString(Integer.valueOf(number.getText())+"^" + i,5+(70*i),15);
                        g.drawString("" + Math.pow(Integer.valueOf(number.getText()), i),5+(70*i),40);
                    }
                }
                catch(Exception ex){}
                
                try
                {
                    Thread.sleep(10);
                }catch(Exception ex){}
                repaint();
            }
        };
        panel.setBounds(5,40,680,225);
        panel.setVisible(false);
        number=new JTextField();
        number.setBounds(160,5,150,30);
        number.setVisible(false);
        frame.add(number);
        frame.add(panel);
    }
    public void visible(boolean tf)
    {
        panel.setVisible(tf);
        number.setVisible(tf);
        if(tf)
        {
            frame.setSize(700,300);
            frame.setTitle("Lesson 3 and 4 - Powers Chart");
        }
    }
}
