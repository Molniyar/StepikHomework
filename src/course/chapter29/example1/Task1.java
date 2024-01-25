package course.chapter29.example1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Task1 {

    public static void main(String[] args) {
            My_Frame frame = new My_Frame();
            frame.setVisible(true);

    }
}
class My_Frame extends JFrame {
    int number = 0;
    String operator = "";

    public static class ButtonListener implements ActionListener {  // интерфейс
        JTextField display;
        My_Frame myFrame;

        public ButtonListener(JTextField display,My_Frame myFrame) {
            this.display = display;
            this.myFrame = myFrame;
        }


        @Override
        public void actionPerformed(ActionEvent e) {      // метод
            JButton button = (JButton)e.getSource();



            if (Objects.equals(button.getText(), "0")  || Objects.equals(button.getText(), "1") || Objects.equals(button.getText(), "2") || Objects.equals(button.getText(), "3") || Objects.equals(button.getText(), "4") || Objects.equals(button.getText(), "5") || Objects.equals(button.getText(), "6") || Objects.equals(button.getText(), "7") || Objects.equals(button.getText(), "8") || Objects.equals(button.getText(), "9")) {
                display.setText(display.getText() + button.getText());
            }

            if (Objects.equals(button.getText(), "Del")){
                display.setText("");
            }

            if (Objects.equals(button.getText(), "+") || Objects.equals(button.getText(), "-") || Objects.equals(button.getText(), "*") || Objects.equals(button.getText(), "/")){
                myFrame.number = Integer.parseInt(display.getText());
                String operator = "";

                if (Objects.equals(button.getText(), "+")){
                    myFrame.operator = "+";
                }
                if (Objects.equals(button.getText(), "-")){
                    myFrame.operator = "-";
                }
                if (Objects.equals(button.getText(), "*")){
                    myFrame.operator = "*";
                }
                if (Objects.equals(button.getText(), "/")){
                    myFrame.operator = "/";
                }
                display.setText("");
            }

            if (Objects.equals(button.getText(), "=")){
                int secondNumber = Integer.parseInt(display.getText());
                int result = 0;
                if (Objects.equals(myFrame.operator, "+")){
                    result = myFrame.number + secondNumber;
                }
                if (Objects.equals(myFrame.operator, "-")){
                    result = myFrame.number - secondNumber;
                }
                if (Objects.equals(myFrame.operator, "*")){
                    result = myFrame.number * secondNumber;
                }
                if (Objects.equals(myFrame.operator, "/")){
                    result = myFrame.number / secondNumber;
                }
                display.setText(Integer.toString(result));
            }

            System.out.println("pressed button: " + button.getText());

        }

    }
    JButton[] numericButtons = new JButton[10];
    public My_Frame() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout( ));
        setTitle("Test");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField(75);
        Task1 myTask1 = new Task1();
        display.addActionListener(new ButtonListener(display, this));
        getContentPane().add(display);

        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBounds(50,100, 200,30);
        display.setSize(100, 20);

        display.setText("hello world");


        for (int count = 0; count < 10; count++){
            JButton jb = new JButton(Integer.toString(count));
            jb.addActionListener(new ButtonListener(display, this));
            //jb.setSize(250, 250);
            getContentPane().add(jb);
            numericButtons[count] = jb;
        }

        display.setText(numericButtons[0].getText());


        JButton jb1 = new JButton("+");
        jb1.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb1);

        JButton jb2 = new JButton("-");
        jb2.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb2);

        JButton jb3 = new JButton("*");
        jb3.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb3);

        JButton jb4 = new JButton("/");
        jb4.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb4);

        JButton jb5 = new JButton("=");
        jb5.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb5);

        JButton jb6 = new JButton("Del");
        jb6.addActionListener(new ButtonListener(display, this));
        getContentPane().add(jb6);

    }
}