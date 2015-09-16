package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeePay extends Main{
    private JComboBox employes;
    private JTextField hours;
    private JLabel hlabel;
    private JButton set;
    private double hoursD[]=new double[5];
    private byte index=0;
    public EmployeePay()
    {
        employes=new JComboBox();
        employes.setBounds(160,5,150,30);
        employes.setVisible(false);
        for(int i=0;i<5;i++) 
        {
            employes.addItem("Employee " + (i+1));
            hoursD[i]=0;
        }
        employes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    hours.setText("" + hoursD[employes.getSelectedIndex()]);
                }
                catch(Exception ex){}
            }
        });
        employes.setSelectedIndex(0);
        hours=new JTextField();
        hours.setBounds(50,40,150,30);
        hours.setText("" + hoursD[0]);
        hours.setVisible(false);
        hlabel=new JLabel();
        hlabel.setBounds(5,41,40,25);
        hlabel.setText("Hours:");
        hlabel.setVisible(false);
        set=new JButton();
        set.setBounds(210,40,150,30);
        set.setText("Set");
        set.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double temp=Double.valueOf(hours.getText());
                    if(temp>=0 && temp<=70)
                    {
                        hoursD[employes.getSelectedIndex()]=temp;
                    }
                    else if(temp>70)
                    {
                        hours.setText("70");
                        hoursD[employes.getSelectedIndex()]=70D;
                    }
                    else if(temp<0)
                    {
                        hours.setText("0");
                        hoursD[employes.getSelectedIndex()]=0D;
                    }
                }catch(Exception ex){}
            }
        });
        set.setVisible(false);
        frame.add(set);
        frame.add(hlabel);
        frame.add(hours);
        frame.add(employes);
    }
    public void show(boolean tf)
    {
        frame.setTitle("Lesson 3 and 4 - Employee Pay");
        employes.setVisible(tf);
        hours.setVisible(tf);
        hlabel.setVisible(tf);
        set.setVisible(tf);
    }
}
