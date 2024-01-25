package course.chapter29.example1;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JPanel windowContent = new JPanel();  // панель

        FlowLayout fl = new FlowLayout();     // менеджер отображения
        windowContent.setLayout(fl);

        // элементы управления
        JLabel label1 = new JLabel("Число 1:");
        JLabel label2 = new JLabel("Число 2:");
        JLabel label3 = new JLabel("Сумма:");

        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JTextField result = new JTextField(10);

        JButton button = new JButton("Вычислить");

        // добавление элементов на панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(button);

        JFrame frame = new JFrame("Калькулятор");  // окно приложения
        frame.setContentPane(windowContent);
        frame.setSize(400, 200);
        frame.setVisible(true);

        // регистрация события
        //Calculator_Engine calc = new Calculator_Engine();
        //button.addActionListener(calc);
    }
}