package Hilos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dados extends JFrame {
    private JPanel Panel_Dados= new JPanel();
    private JButton Atras= new JButton("⬅️");
    public Dados(){
        this.setBounds(0, 0, 800, 600);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Metods_Dados();
    }
    private void Metods_Dados(){
        Panel_Dados();        
        Botones();
    }
    private void Panel_Dados(){
        this.getContentPane().add(Panel_Dados);
        Panel_Dados.setLayout(null);

    }
    private void Botones(){
        Atras.setBounds(0, 0, 100, 100);
        Panel_Dados.add(Atras);

        Atras.addActionListener(new ActionListener() {
            public void  actionPerformed(ActionEvent e){
                metods metodos= new metods();
                metodos.setVisible(true);
                dispose();  
            }
        });
    }
    
    
}
