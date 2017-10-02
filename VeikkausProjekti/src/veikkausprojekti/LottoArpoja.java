package VeikkausPiste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoArpoja {

    private ArrayList<Integer> lottorivi;
    private Random rnd = new Random();
    
    
    public LottoArpoja(){
        this.arvoNumerot();
    }
    
    public int tarkistus(int[] omarivi){
        
        int oikeat = 0;
        for (int nro : omarivi) {
            if(lottorivi.contains(nro))
                oikeat++;
        }
        return oikeat;
    }
    
    public ArrayList<Integer> numerot(){
        Collections.sort(lottorivi);
        return this.lottorivi;
    }
    
    public void arvoNumerot(){
        this.lottorivi = new ArrayList<>();
        
        for (int i = 1; i <= 7; i++) {
            int arvottu = rnd.nextInt(40) + 1;
            if (sisaltaaNumeron(arvottu)) {
                arvottu = rnd.nextInt(40) + 1;
            }
            lottorivi.add(arvottu);
        }
        
    }
    public boolean sisaltaaNumeron(int numero){
        
        boolean onkoTotta;
        onkoTotta = lottorivi.contains(numero);
        return onkoTotta;
    }
    
 
}
