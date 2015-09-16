package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeePay extends Main{
    private JComboBox employes;
    private JTextField hours,totalMoney,OT,RP;
    private JLabel hlabel,moneyL,OTl,RPl;
    private JButton set;
    private double hoursD[]=new double[5];
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
        hours.setBounds(50+30,40,150,30);
        hours.setText("" + hoursD[0]);
        hours.setVisible(false);
        hlabel=new JLabel();
        hlabel.setBounds(5,41,40,25);
        hlabel.setText("Hours:");
        hlabel.setVisible(false);
        set=new JButton();
        set.setBounds(205+30,40,150,30);
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
        totalMoney=new JTextField();
        totalMoney.setBounds(50+30,75,150,30);
        totalMoney.setText("$");
        totalMoney.setEditable(false);
        totalMoney.setVisible(false);
        moneyL=new JLabel();
        moneyL.setBounds(5,75,40,25);
        moneyL.setText("Total:");
        moneyL.setVisible(false);
        RP=new JTextField();
        RP.setBounds(50+30,110,150,30);
        RP.setEditable(false);
        RP.setVisible(false);
        RPl=new JLabel();
        RPl.setText("Regular Pay:");
        RPl.setBounds(5,110,100,25);
        RPl.setVisible(false);
        OT=new JTextField();
        OT.setBounds(50+30,145,150,30);
        OT.setEditable(false);
        OT.setVisible(false);
        OTl=new JLabel();
        OTl.setBounds(5,150,100,25);
        OTl.setText("Over Time:");
        OTl.setVisible(false);
        frame.add(OTl);
        frame.add(OT);
        frame.add(RPl);
        frame.add(RP);
        frame.add(moneyL);
        frame.add(totalMoney);
        frame.add(set);
        frame.add(hlabel);
        frame.add(hours);
        frame.add(employes);
        Thread update=new Thread(new Runnable() {
            public void run() {
                while(true)
                {
                    try
                    {
                        totalMoney.setText("$" + (hoursD[employes.getSelectedIndex()]*15));
                        if(hoursD[employes.getSelectedIndex()]<40)
                        {
                            RP.setText("$" + (hoursD[employes.getSelectedIndex()]*15));
                        }
                        if(hoursD[employes.getSelectedIndex()]>40)
                        {
                            OT.setText("$" + (hoursD[employes.getSelectedIndex()]*15));
                        }
                        else
                        {
                            OT.setText("$0.0");
                        }
                    }
                    catch(Exception ex){}
                }
            }
        });
        update.start();
    }
    public void show(boolean tf)
    {
        frame.setTitle("Lesson 3 and 4 - Employee Pay");
        frame.setSize(475,215);
        employes.setVisible(tf);
        hours.setVisible(tf);
        hlabel.setVisible(tf);
        set.setVisible(tf);
        totalMoney.setVisible(tf);
        moneyL.setVisible(tf);
        RP.setVisible(tf);
        RPl.setVisible(tf);
        OT.setVisible(tf);
        OTl.setVisible(tf);
    }
}
