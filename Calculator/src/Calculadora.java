import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton clear;
    private JButton delete;
    private JButton abs;
    private JButton plus_minus;
    private JButton powButton;
    private JButton sqrtButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divide;
    private JButton sinButton;
    private JButton arcsinButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiply;
    private JButton cosButton;
    private JButton arccosButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton minus;
    private JButton tanButton;
    private JButton arctanButton;
    private JButton a0Button;
    private JButton point;
    private JButton equal;
    private JButton plus;
    private JButton logButton;
    private JButton lnButton;
    public JPanel panel;
    private JLabel Display;
    private String Valor;
    private String x;
    private String y;
    int o;

    public Calculadora() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor=Display.getText();
                if(Valor.length() == 1 && Valor.equals(("0"))){
                    Display.setText("0");
                } else{
                    Display.setText(Valor+"0");
                }
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor=Display.getText();
                if (Valor.equals("0")){
                    Display.setText("1");
                } else{
                    Display.setText(Valor+"1");
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("2");
                } else {
                    Display.setText(Valor + "2");
                }
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("3");
                } else {
                    Display.setText(Valor + "3");
                }
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("4");
                } else {
                    Display.setText(Valor + "4");
                }
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("5");
                } else {
                    Display.setText(Valor + "5");
                }
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("6");
                } else {
                    Display.setText(Valor + "6");
                }
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("7");
                } else {
                    Display.setText(Valor + "7");
                }
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("8");
                } else {
                    Display.setText(Valor + "8");
                }
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.equals("0")) {
                    Display.setText("9");
                } else {
                    Display.setText(Valor + "9");
                }
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (!Valor.contains(".")) {
                    Display.setText(Valor +".");
                }
            }
        });

        abs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.abs(num)));
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("0");
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (Valor.length() > 1) {
                    Display.setText(Valor.substring(0, Valor.length() - 1));
                } else {
                    Display.setText("0");
                }
            }
        });

        plus_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                if (!Valor.equals("0")) {
                    if (Valor.charAt(0) == '-') {
                        Display.setText(Valor.substring(1));
                    } else {
                        Display.setText("-" + Valor);
                    }
                }
            }
        });

        powButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Display.getText();
                o = 5;
                Display.setText("");
            }
        });

        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                if (num >= 0) {
                    Display.setText(String.valueOf(Math.sqrt(num)));
                } else {
                    Display.setText("Error");
                }
            }
        });

        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.sin(num)));
            }
        });

        arcsinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.asin(num)));
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.cos(num)));
            }
        });

        arccosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.acos(num)));
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.tan(num)));
            }
        });

        arctanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.atan(num)));
            }
        });

        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.log10(num)));
            }
        });

        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor = Display.getText();
                double num = Double.parseDouble(Valor);
                Display.setText(String.valueOf(Math.log(num)));
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Display.getText();
                o = 1; // Operador de suma
                Display.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Display.getText();
                o = 2; // Operador de resta
                Display.setText("");
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Display.getText();
                o = 3; // Operador de multiplicación
                Display.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Display.getText();
                o = 4; // Operador de división
                Display.setText("");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = Display.getText();
                double num1 = Double.parseDouble(x);
                double num2 = Double.parseDouble(y);

                switch (o) {
                    case 1:
                        Display.setText(String.valueOf(num1 + num2));
                        break;
                    case 2:
                        Display.setText(String.valueOf(num1 - num2));
                        break;
                    case 3:
                        Display.setText(String.valueOf(num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            Display.setText(String.valueOf(num1 / num2));
                        } else {
                            Display.setText("Error");
                        }
                        break;
                    case 5:
                        Display.setText(String.valueOf(Math.pow(num1, num2)));
                        break;
                }
            }
        });
    }
}
