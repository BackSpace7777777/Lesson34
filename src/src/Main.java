package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static JFrame frame=new JFrame();
    public static JButton mainMenu,Employee,divide,powersChart,SalaryTable;
    public static EmployeePay ep;
    public static void main(String[] args) {
        frame.setSize(475,200);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setResizable(false);
        mainMenu=new JButton();
        mainMenu.setBounds(0,0,150,30);
        mainMenu.setVisible(false);
        mainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        ep=new EmployeePay();
        frame.add(mainMenu);
    }
}
