import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPanel loginPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton ingresarButton;
    private JLabel img;

    public login() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(loginPanel);
        setLocationRelativeTo(null);
       ImageIcon icon = new ImageIcon("Clase10/imagen/icon.png");
       img.setIcon(icon);
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "Lubswer@gmail.com";
                String clave = "12345";

                if(textField1.getText().equals(usuario) && textField2.getText().equals(clave)){

                    JOptionPane.showMessageDialog(null, usuario + " con exito");
                    dispose();
                    new calcular();


                }else{
                    JOptionPane.showMessageDialog(null, "Clave o Usuario incorrecto");
                }

            }
        });
    }


}

