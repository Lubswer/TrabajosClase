import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class calcular extends JFrame {
    private JTextField valor1TF;
    private JTextField valor2TF;
    private JTextField resultadoTF;
    private JPanel calcularPanel;
    private JRadioButton sumaRB;
    private JRadioButton multiRB;
    private JRadioButton divRB;
    private JRadioButton restaRB;
    private JButton limpiarButton;
    private JButton calcularButton;
    private JLabel valor1;
    private JLabel valor2;
    private JLabel resultado;
    private ButtonGroup grupo1 = new ButtonGroup();


    public calcular() {
        setTitle("Calcular");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(calcularPanel);
        setLocationRelativeTo(null);
        grupo1.add(sumaRB);
        grupo1.add(multiRB);
        grupo1.add(divRB);
        grupo1.add(restaRB);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(valor1TF.getText());
                    double valor2 = Double.parseDouble(valor2TF.getText());

                    if (sumaRB.isSelected()) {
                        resultadoTF.setText(String.valueOf(valor1 + valor2));
                    } else if (multiRB.isSelected()) {
                        resultadoTF.setText(String.valueOf(valor1 * valor2));
                    } else if (divRB.isSelected()) {

                        if (valor2 != 0) {
                            double a = valor1 / valor2;
                            resultadoTF.setText(String.valueOf(a));
                        } else {
                            resultadoTF.setText("Valores incorrectos");
                            throw new IllegalArgumentException("Valor incorrecto");
                        }
                    } else if (restaRB.isSelected()) {

                        resultadoTF.setText(String.valueOf(valor1 - valor2));
                    } else {
                        resultadoTF.setText("00");
                    }
                } catch (InputMismatchException ime) {
                    JOptionPane.showMessageDialog(null, "Valor incorrecto");
                }catch (IllegalArgumentException iea) {
                    JOptionPane.showMessageDialog(null, iea.getMessage());
                }


            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1TF.setText("");
                valor2TF.setText("");
                resultadoTF.setText("");
            }
        });
    }
}
