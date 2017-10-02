
package VeikkausPiste;

import VeikkausPiste.LottoArpoja;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class LottoTesti {

    
    public static void main(String[] args) {

        LottoArpoja lotto = new LottoArpoja();
        ArrayList<Integer> lottorivi = lotto.numerot();
        int[] omat = new int[7];

        for (int i = 0; i < omat.length; i++) {
            omat[i] = Integer.parseInt(JOptionPane.showInputDialog("Lotto: Anna " + (i+1) + ". numero", ""));
        }
        

        System.out.println("voittorivi: " + lottorivi);
        System.out.println("oma rivi: " + Arrays.toString(omat));
        System.out.println("oikein: " + lotto.tarkistus(omat));
    }

}
