package ChapterTen.Exercise5_1;

import javax.swing.*;
import java.awt.*;

public class E {
    public static void main(String[] args) {
        ComputerFrame fr=new ComputerFrame();
        fr.setTitle("计算");
    }
}
class ComputerFrame extends JFrame {
    TextArea inputNumber,showResult;
    Computer computer;
    public ComputerFrame() {
        computer = new Computer();
        setLayout(new FlowLayout());
        inputNumber=new TextArea(6,20);
        showResult=new TextArea(6,20);
        add(inputNumber);
        add(showResult);
        showResult.setEditable(false);
        inputNumber.addTextListener((e)->{
            computer.setComputer(inputNumber.getText());
            String s= "和"+computer.getSum()+"\n"+
                    "平均"+computer.getAver();
            showResult.setText(s);
        });
        setSize(300,320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }

}
