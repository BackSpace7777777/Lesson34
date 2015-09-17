package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Divide extends Main{
    private JTextField number1,number2,answer;
    private JButton div;
    private int mod,nonmod,o,t;
    public Divide()
    {
        number1=new JTextField();
        number1.setBounds(5,40,150,30);
        number1.setVisible(false);
        number2=new JTextField();
        number2.setBounds(5,80,150,30);
        number2.setVisible(false);
        answer=new JTextField();
        answer.setBounds(160,60,150,30);
        answer.setEditable(false);
        answer.setVisible(false);
        div=new JButton();
        div.setText("Divide");
        div.setBounds(5,115,150,30);
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean ok=true;
                try
                {
                    o=Integer.valueOf(number1.getText());
                }
                catch(NumberFormatException ex)
                {
                    number1.setText("Not an Integer");
                    ok=false;
                }
                try
                {
                    t=Integer.valueOf(number2.getText());
                }
                catch(NumberFormatException ex)
                {
                    number2.setText("Not and Integer");
                    ok=false;
                }
                if(ok)
                {
                    if(o>t)
                    {
                        mod=o%t;
                        nonmod=o/t;
                    }
                    else if(t>o)
                    {
                        mod=t%o;
                        nonmod=t/o;
                    }
                    else if(t==o)
                    {
                        mod=t%o;
                        nonmod=t/o;
                    }
                    else
                    {
                        answer.setText("Something went wrong");
                    }
                    answer.setText(nonmod + " R" + mod);
                }
            }
        });
        div.setVisible(false);
        frame.add(div);
        frame.add(answer);
        frame.add(number2);
        frame.add(number1);
    }
    public void visible(boolean tf)
    {
        if(tf)
        {
            frame.setTitle("Lesson 2 and 3 - Divide");
        }
        else
        {
            number1.setText("");
            number2.setText("");
            answer.setText("");
        }
        number1.setVisible(tf);
        number2.setVisible(tf);
        answer.setVisible(tf);
        div.setVisible(tf);
    }
}
