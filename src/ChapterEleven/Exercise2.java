package ChapterEleven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Dwindow extends JFrame implements ActionListener {
    JTextField inputNumber;
    JTextArea  save;
    Dwindow(){
        inputNumber=new JTextField(22);
        inputNumber.addActionListener(this);
        save=new JTextArea(12,16);
        setLayout(new FlowLayout());
        add(inputNumber);
        add(save);
        setBounds(60,60,300,300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event) {
        String s=inputNumber.getText();
        double n;
        try{
            n=Double.parseDouble(s);
            if(n>1000){
                int select=
                        JOptionPane.showConfirmDialog(this,"已经超过1000确认正确吗？","确认对话框",
                                JOptionPane.YES_NO_OPTION );
                if(select==JOptionPane.YES_OPTION)
                    save.append("\n"+s);
                else
                    inputNumber.setText(null);
            }
            else {
                save.append("\n"+s);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"您输入了非法字符","警告对话框",
                    JOptionPane.WARNING_MESSAGE);
            inputNumber.setText(null);
        }
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        new Dwindow();
    }
}

