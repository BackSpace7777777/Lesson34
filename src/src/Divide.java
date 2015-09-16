package src;

import javax.swing.JTextField;

public class Divide extends Main{
    private JTextField number1,number2;
    public Divide()
    {
        number1=new JTextField();
        number1.setBounds(5,40,150,30);
        number1.setVisible(false);
        frame.add(number1);
    }
    public void visible(boolean tf)
    {
        number1.setVisible(tf);
    }
}
