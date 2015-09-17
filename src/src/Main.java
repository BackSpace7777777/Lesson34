package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static JFrame frame=new JFrame("Lesson 3 and 4 - Menu");
    public static JButton mainMenu,Employee,divide,powersChart,SalaryTable;
    public static EmployeePay ep;
    public static Divide d;
    public static PowersChart pc;
    public static Salary s;
    public static void main(String[] args) {
        frame.setSize(475,200);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setResizable(false);
        mainMenu=new JButton();
        mainMenu.setBounds(5,5,150,30);
        mainMenu.setVisible(false);
        mainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu(true);
            }
        });
        mainMenu.setText("Main Menu");
        Employee=new JButton();
        Employee.setBounds(5,5,150,30);
        Employee.setText("Employee Pay");
        Employee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu(false);
                ep.visible(true);
            }
        });
        divide=new JButton();
        divide.setText("Divide");
        divide.setBounds(160,5,150,30);
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu(false);
                d.visible(true);
            }
        });
        powersChart=new JButton();
        powersChart.setText("Powers Chart");
        powersChart.setBounds(160+155,5,150,30);
        powersChart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu(false);
                pc.visible(true);
            }
        });
        SalaryTable=new JButton();
        SalaryTable.setBounds(160,40,150,30);
        SalaryTable.setText("Salary Table");
        SalaryTable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu(false);
                s.visible(true);
            }
        });
        frame.add(SalaryTable);
        frame.add(powersChart);
        frame.add(divide);
        frame.add(Employee);
        frame.add(mainMenu);
        ep=new EmployeePay();
        d=new Divide();
        pc=new PowersChart();
        s=new Salary();
        frame.add(mainMenu);
        frame.setVisible(true);
    }
    public static void menu(boolean tf)
    {
        Employee.setVisible(tf);
        divide.setVisible(tf);
        powersChart.setVisible(tf);
        SalaryTable.setVisible(tf);
        if(tf)
        {
            mainMenu.setVisible(false);
            ep.visible(false);
            d.visible(false);
            pc.visible(false);
            s.visible(false);
            frame.setSize(475,200);
            frame.setTitle("Lesson 3 and 4 - Menu");
        }
        else
        {
            mainMenu.setVisible(true);
        }
    }
}
