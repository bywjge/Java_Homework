package ChapterEleven;

import javax.swing.*;
import java.awt.*;

public class Exercise3 {
    public static void main(String[] args) {
        WindowColor win=new WindowColor();
        win.setTitle("带颜色对话框的窗口");
    }
}
class WindowColor extends JFrame {
    JTextArea text;
    JButton button;
    WindowColor() {
        button=new JButton("打开颜色对话框");
        text = new JTextArea(12,20);
        button.addActionListener((e)->{
            Color newColor=JColorChooser.showDialog(this,"调色板",button.getBackground());
            if(newColor!=null) {
                text.setForeground(newColor);
            }});
        setLayout(new FlowLayout());
        add(button);
        add(text);
        setBounds(60,60,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
