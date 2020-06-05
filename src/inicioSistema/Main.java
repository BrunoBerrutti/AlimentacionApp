package inicioSistema;

import dominio.Sistema;
import interfaz.VentanaMenuPrincipal;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * Esta clase es la que inicializa el sistema.
 * @author Usuario
 */
public class Main {
    /**
     * Este metodo inicializa el programa.
     * @param args Recibe la etiqueta args
     */
    public static void main(String[] args) {
        Sistema sistema;

        try {
            try (FileInputStream f = new FileInputStream("Sistema.data")) {
                sistema = (Sistema) new
                ObjectInputStream(new BufferedInputStream(f)).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            sistema = new Sistema();
        }
        VentanaMenuPrincipal ventana = new VentanaMenuPrincipal(sistema);
        ventana.setVisible(true);
    }

}
