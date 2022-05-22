package ChapterTen.Exercise5_2;

import javax.swing.*;
import java.awt.*;

public class ComputerFrame extends JFrame {
    JTextField inputNumber1,inputNumber2,showResult;
    JButton buttonMultiAdd,buttonMultiSub,buttonMulti,buttonMultiDiv;
    JLabel showOperator;
    public ComputerFrame() {
        setLayout(new FlowLayout());
        inputNumber1=new JTextField(10);
        inputNumber2=new JTextField(10);
        showResult=new JTextField(10);
        showOperator=new JLabel(" ",showOperator.CENTER);
        showOperator.setBackground(Color.green);
        add(inputNumber1);
        add(showOperator);
        add(inputNumber2);
        add(showResult);
        buttonMultiAdd=new JButton("加");
        buttonMultiSub=new JButton("减");
        buttonMulti=new JButton("乘");
        buttonMultiDiv=new JButton("除");
        add(buttonMultiAdd);
        add(buttonMultiSub);
        add(buttonMulti);
        add(buttonMultiDiv);
        buttonMultiAdd.addActionListener((e)->{
            double n1,n2,n;
            try{ n1=Double.parseDouble(inputNumber1.getText());
                n2=Double.parseDouble(inputNumber2.getText());
                n=n1+n2;
                showResult.setText(String.valueOf(n));
                showOperator.setText("+");
            }
            catch(NumberFormatException ee){
                showResult.setText("请输入数字字符");
            }
        });
        buttonMultiSub.addActionListener((e)->{
            double n1,n2,n;
            try{ n1=Double.parseDouble(inputNumber1.getText());
                n2=Double.parseDouble(inputNumber2.getText());
                n=n1-n2;
                showResult.setText(String.valueOf(n));
                showOperator.setText("-");
            }
            catch(NumberFormatException ee){
                showResult.setText("请输入数字字符");
            }
        });
        buttonMulti.addActionListener((e)->{
            double n1,n2,n;
            try{ n1=Double.parseDouble(inputNumber1.getText());
                n2=Double.parseDouble(inputNumber2.getText());
                n=n1*n2;
                showResult.setText(String.valueOf(n));
                showOperator.setText("×");
            }
            catch(NumberFormatException ee){
                showResult.setText("请输入数字字符");
            }
        });
        buttonMultiDiv.addActionListener((e)->{
            double n1,n2,n;
            try{ n1=Double.parseDouble(inputNumber1.getText());
                n2=Double.parseDouble(inputNumber2.getText());
                n=n1/n2;
                showResult.setText(String.valueOf(n));
                showOperator.setText("÷");
            }
            catch(NumberFormatException ee){
                showResult.setText("请输入数字字符");
            }
        });
        setSize(300,320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
}
