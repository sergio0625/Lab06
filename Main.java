package Hilos;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
public static void main(String[] args) {
    metods metodos= new metods();
    metodos.setVisible(true);

    try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException 
                | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
}
    
}