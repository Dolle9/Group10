

package veikkausprojekti;

import java.util.Random;


public class Onnenpeli {
    
    private int voittonumero;
    private Random rnd = new Random();
    
    
    public void arvoNumero(){
        
        this.voittonumero = rnd.nextInt(50) + 1;
        
    }
    
    public int getNumero(){
        return voittonumero;
    }
    
    public void voittikoPelaaja(int numero){
        if (numero == voittonumero){
            System.out.println("Päävoitto");
        } else if (numero > voittonumero){
            System.out.println("Numerosi on suurempi!");
        } else {
            System.out.println("Numerosi on pienempi!");
        }
    }
    
}
