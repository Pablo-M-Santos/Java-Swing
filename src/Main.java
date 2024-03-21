import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private JLabel LabelTitle1;
    private JTextField textField1;
    private JButton cliqueEmTuButton;
    private JPanel section1;
    private JButton criarUmaNovaTelaButton;


    public Main() {
        setContentPane(section1);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        cliqueEmTuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                LabelTitle1.setText(texto);
            }
        });


        criarUmaNovaTelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Section2();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
