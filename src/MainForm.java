import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtResult;
    private JPanel panel1;
    private JButton btn1;
    private JButton btn3;
    private JButton btn2;
    private JButton btn5;
    private JButton btn4;
    private JButton btn6;
    private JButton btn0;
    private JButton btnDec;
    private JButton btnEqual;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnClear;
    private JLabel lblResult;
    private double myValue=0.0;
    private String operand = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new MainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }

    public MainForm() {


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn1.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn2.getText());
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn3.getText());
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn4.getText());
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn5.getText());
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn6.getText());
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn7.getText());
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn8.getText());
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn9.getText());
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtResult.getText().equals("0")){
                    txtResult.setText("");
                }
                txtResult.setText(txtResult.getText() + btn0.getText());
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myValue = Double.parseDouble(txtResult.getText());
                operand = "+";
                lblResult.setText(txtResult.getText() + " " + operand);
                txtResult.setText("0");
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myValue = Double.parseDouble(txtResult.getText());
                operand = "-";
                lblResult.setText(txtResult.getText() + " " + operand);
                txtResult.setText("0");
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myValue = Double.parseDouble(txtResult.getText());
                operand = "x";
                lblResult.setText(txtResult.getText() + " " + operand);
                txtResult.setText("0");
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myValue = Double.parseDouble(txtResult.getText());
                operand = "/";
                lblResult.setText(txtResult.getText() + " " + operand);
                txtResult.setText("0");
            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operand)
                {
                    case "+":
                        txtResult.setText(Double.toString(myValue+Double.parseDouble(txtResult.getText())));
                        myValue = 0;
                        operand = "";
                        lblResult.setText("");
                        break;
                    case "-":
                        txtResult.setText(Double.toString(myValue-Double.parseDouble(txtResult.getText())));
                        myValue = 0;
                        operand = "";
                        lblResult.setText("");
                        break;
                    case "x":
                        txtResult.setText(Double.toString(myValue*Double.parseDouble(txtResult.getText())));
                        myValue = 0;
                        operand = "";
                        lblResult.setText("");
                        break;
                    case "/":
                        txtResult.setText(Double.toString(myValue/Double.parseDouble(txtResult.getText())));
                        myValue = 0;
                        operand = "";
                        lblResult.setText("");
                        break;
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand="";
                myValue=0.0;
                lblResult.setText("");
                txtResult.setText("0");
            }
        });

    }
}
