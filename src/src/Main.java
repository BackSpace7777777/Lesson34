package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static JFrame frame=new JFrame("Lesson 3 and 4 - Menu");
    public static JButton mainMenu,Employee,divide,powersChart,SalaryTable;
    public static EmployeePay ep;
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
                ep.show(true);
            }
        });
        divide=new JButton();
        divide.setText("Divide");
        divide.setBounds(160,5,150,30);
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        frame.add(divide);
        frame.add(Employee);
        frame.add(mainMenu);
        ep=new EmployeePay();
        frame.add(mainMenu);
        frame.setVisible(true);
    }
    public static void menu(boolean tf)
    {
        Employee.setVisible(tf);
        divide.setVisible(tf);
        if(tf)
        {
            mainMenu.setVisible(false);
            ep.show(false);
            frame.setSize(475,200);
            frame.setTitle("Lesson 3 and 4 - Menu");
        }
        else
        {
            mainMenu.setVisible(true);
        }
    }
}
