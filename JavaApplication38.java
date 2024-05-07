
package javaapplication38;

/**
 *
 * @author alber
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numEst;
        Metodos obj = new Metodos();
        numEst = obj.numEst();
        for (int i = 0; i < numEst; i++) {
            obj.escribir();
        }
        // Arreglos
        obj.traer(numEst);
        
    }
    
}
