import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Semicientifica");
        frame.setContentPane(new Calculadora().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}