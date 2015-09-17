package src;

import javax.swing.JTextField;

public class Divide extends Main{
    private JTextField number1,number2;
    public Divide()
    {
        number1=new JTextField();
        number1.setBounds(5,40,150,30);
        number1.setVisible(false);
        number2=new JTextField();
        number2.setBounds(5,80,150,30);
        number2.setVisible(false);
        frame.add(number2);
        frame.add(number1);
    }
    public void visible(boolean tf)
    {
        number1.setVisible(tf);
        number1.setVisible(tf);
    }
}
