package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeePay extends Main{
    private JComboBox employes;
    private JTextField hours;
    private JLabel hlabel;
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
                index=(byte)employes.getSelectedIndex();
                System.out.println(index);
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
        frame.add(hlabel);
        frame.add(hours);
        frame.add(employes);
        Thread employeHourUpdate=new Thread(new Runnable() {
            public void run() {
                while(true)
                {
                    
                }
            }
        });
        employeHourUpdate.start();
    }
    public void show(boolean tf)
    {
        frame.setTitle("Lesson 3 and 4 - Employee Pay");
        employes.setVisible(tf);
        hours.setVisible(tf);
        hlabel.setVisible(tf);
    }
}
