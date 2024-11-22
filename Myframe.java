import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Myframe extends JFrame{
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonTimes;
    JButton buttonDivide;
    JButton buttonSquare;
    JButton buttonSqrt;
    JButton buttonEquals;
    JButton buttonDelete;
    JButton buttonClearAll;
    JButton buttonFractionalPart;
    JButton buttonNegate;
    JButton buttonSin;
    JButton buttonCos;
    JTextField textField;

    String operator = "";
    double firstValue = 0;
    double secondValue = 0;

    public Myframe(){
        /*Frame options */
        this.setTitle("Calculator"); 
        this.setSize(400,600); 
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); 
        this.getContentPane().setBackground(Color.white);
        
        addGuiComponents();

    }

    private void addGuiComponents(){
                /*Buttons */

        button1 = new JButton();
        button1.setBounds(5, 340, 90, 50);
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setText("1");
        button1.addActionListener(new ButtonClick());
        add(button1);

        button2 = new JButton();
        button2.setBounds(100, 340, 90, 50);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setText("2");
        button2.setVisible(true);
        button2.addActionListener(new ButtonClick());
        this.add(button2);

        button3 = new JButton();
        button3.setBounds(195, 340, 90, 50);
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setText("3");
        button3.addActionListener(new ButtonClick());
        button3.setVisible(true);
        this.add(button3);

        button4 = new JButton();
        button4.setBounds(5, 395, 90, 50);
        button4.setForeground(Color.BLACK);
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setText("4");
        button4.addActionListener(new ButtonClick());
        button4.setVisible(true);
        this.add(button4);

        button5 = new JButton();
        button5.setBounds(100, 395, 90, 50);
        button5.setForeground(Color.BLACK);
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setText("5");
        button5.addActionListener(new ButtonClick());
        button5.setVisible(true);
        this.add(button5);

        button6 = new JButton();
        button6.setBounds(195, 395, 90, 50);
        button6.setForeground(Color.BLACK);
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setText("6");
        button6.addActionListener(new ButtonClick());
        button6.setVisible(true);
        this.add(button6);

        button7 = new JButton();
        button7.setBounds(5, 450, 90, 50);
        button7.setForeground(Color.BLACK);
        button7.setBackground(Color.LIGHT_GRAY);
        button7.setText("7");
        button7.addActionListener(new ButtonClick());
        button7.setVisible(true);
        this.add(button7);

        button8 = new JButton();
        button8.setBounds(100, 450, 90, 50);
        button8.setForeground(Color.BLACK);
        button8.setBackground(Color.LIGHT_GRAY);
        button8.setText("8");
        button8.addActionListener(new ButtonClick());
        button8.setVisible(true);
        this.add(button8);

        button9 = new JButton();
        button9.setBounds(195, 450, 90, 50);
        button9.setForeground(Color.BLACK);
        button9.setBackground(Color.LIGHT_GRAY);
        button9.setText("9");
        button9.addActionListener(new ButtonClick());
        button9.setVisible(true);
        this.add(button9);

        button0 = new JButton();
        button0.setBounds(100, 505, 90, 50);
        button0.setForeground(Color.BLACK);
        button0.setBackground(Color.LIGHT_GRAY);
        button0.setText("0");
        button0.addActionListener(new ButtonClick());
        button0.setVisible(true);
        this.add(button0);
        // operators

        buttonPlus = new JButton();
        buttonPlus.setBounds(5, 230, 90, 50);
        buttonPlus.setForeground(Color.BLACK);
        buttonPlus.setBackground(Color.LIGHT_GRAY);
        buttonPlus.setText("+");
        buttonPlus.setVisible(true);
        buttonPlus.addActionListener(new ButtonClick());
        this.add(buttonPlus);

        buttonMinus = new JButton();
        buttonMinus.setBounds(100, 230, 90, 50);
        buttonMinus.setForeground(Color.BLACK);
        buttonMinus.setBackground(Color.LIGHT_GRAY);
        buttonMinus.setText("-");
        buttonMinus.setVisible(true);
        buttonMinus.addActionListener(new ButtonClick());
        this.add(buttonMinus);

        buttonTimes = new JButton();
        buttonTimes.setBounds(195, 230, 90, 50);
        buttonTimes.setForeground(Color.BLACK);
        buttonTimes.setBackground(Color.LIGHT_GRAY);
        buttonTimes.setText("*");
        buttonTimes.setVisible(true);
        buttonTimes.addActionListener(new ButtonClick());
        this.add(buttonTimes);

        buttonDivide = new JButton();
        buttonDivide.setBounds(290, 230, 90, 50);
        buttonDivide.setForeground(Color.BLACK);
        buttonDivide.setBackground(Color.LIGHT_GRAY);
        buttonDivide.setText("/");
        buttonDivide.setVisible(true);
        buttonDivide.addActionListener(new ButtonClick());
        this.add(buttonDivide);

        buttonDelete = new JButton();
        buttonDelete.setBounds(290, 340, 90, 50);
        buttonDelete.setForeground(Color.BLACK);
        buttonDelete.setBackground(Color.LIGHT_GRAY);
        buttonDelete.setText("D");
        buttonDelete.setVisible(true);
        this.add(buttonDelete);

        buttonFractionalPart = new JButton();
        buttonFractionalPart.setBounds(195, 505, 90, 50);
        buttonFractionalPart.setForeground(Color.BLACK);
        buttonFractionalPart.setBackground(Color.LIGHT_GRAY);
        buttonFractionalPart.setText(",");
        buttonFractionalPart.setVisible(true);
        this.add(buttonFractionalPart);

        buttonNegate = new JButton();
        buttonNegate.setBounds(5, 505, 90, 50);
        buttonNegate.setForeground(Color.BLACK);
        buttonNegate.setBackground(Color.LIGHT_GRAY);
        buttonNegate.setText("+/-");
        buttonNegate.setVisible(true);
        this.add(buttonNegate);

        buttonSqrt = new JButton();
        buttonSqrt.setBounds(5, 285, 90, 50);
        buttonSqrt.setForeground(Color.BLACK);
        buttonSqrt.setBackground(Color.LIGHT_GRAY);
        buttonSqrt.setText("\u221A");
        buttonSqrt.setVisible(true);
        this.add(buttonSqrt);

        buttonSquare = new JButton();
        buttonSquare.setBounds(100, 285, 90, 50);
        buttonSquare.setForeground(Color.BLACK);
        buttonSquare.setBackground(Color.LIGHT_GRAY);
        buttonSquare.setText("x^2");
        buttonSquare.setVisible(true);
        this.add(buttonSquare);

        buttonSin = new JButton();
        buttonSin.setBounds(195, 285, 90, 50);
        buttonSin.setForeground(Color.BLACK);
        buttonSin.setBackground(Color.LIGHT_GRAY);
        buttonSin.setText("sin(x)");
        buttonSin.setVisible(true);
        this.add(buttonSin);
        
        buttonCos = new JButton();
        buttonCos.setBounds(290, 285, 90, 50);
        buttonCos.setForeground(Color.BLACK);
        buttonCos.setBackground(Color.LIGHT_GRAY);
        buttonCos.setText("cos(x)");
        buttonCos.setVisible(true);
        this.add(buttonCos);
        //others

        buttonEquals = new JButton();
        buttonEquals.setBounds(290, 450, 90, 105);
        buttonEquals.setForeground(Color.BLACK);
        buttonEquals.setBackground(Color.LIGHT_GRAY);
        buttonEquals.setText("=");
        buttonEquals.setVisible(true);
        buttonEquals.addActionListener(new ButtonClick());
        this.add(buttonEquals);

        buttonClearAll = new JButton();
        buttonClearAll.setBounds(290, 395, 91, 50);
        buttonClearAll.setForeground(Color.BLACK);
        buttonClearAll.setBackground(Color.LIGHT_GRAY);
        buttonClearAll.setText("C");
        buttonClearAll.addActionListener(new ButtonClick());
        add(buttonClearAll);

        textField = new JTextField();
        textField.setBounds( 5, 5, 375, 200);
        this.add(textField);
    }

    // private void writeToTextField(){

    // }


    private class ButtonClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            String value = "";
            System.out.println(command);
            switch(command){
                case "C":
                    textField.setText("");
                    firstValue = 0;
                    secondValue = 0;
                    operator = "";
                    break;
                case "+":
                    textField.setText("");
                    
                case "-":
                    // firstValue = Double.parseDouble(textField.getText());
                    // System.out.println(firstValue);
                    // operator = command;
                    // command = "";
                case "*":
                    // firstValue = Double.parseDouble(textField.getText());
                    // operator = command;
                    // command = "";   
                case "/":
                    // firstValue = Double.parseDouble(textField.getText());
                    // operator = command;
                    // command = "";
                case "=":
                    // secondValue = Double.parseDouble();
                    double result = 0;

                    switch (command) {
                        case "+":
                            result = firstValue + secondValue;
                            break;
                        case "-":
                            result = firstValue - secondValue;
                            break;
                        case "*":
                            result = firstValue * secondValue;
                            break;    
                        case "/":
                            if(secondValue == 0){
                                textField.setText("Ошибка");
                                return;
                            }
                            else{
                                result = firstValue / secondValue;
                            }
                            break;
                        default:
                            textField.setText(String.valueOf(result));
                            operator = "";
                            break;
                    }
                default:
                    textField.setText(command);
                    break;
            }
        }
        
    }
}
