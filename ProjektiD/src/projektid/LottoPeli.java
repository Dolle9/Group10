package projektid;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LottoPeli {

    public static void main(String[] args) {
        
        LottoRivi lottoRivi = new LottoRivi();
        ArrayList<Integer> lottonumerot = lottoRivi.numerot();
        
        int arvottuR = 7;
        
        int[] pelaajanNmrt = new int [7];
        int samaNum;
        String apuStr;
        String palkinto;
        
        
        
        //public static int getUserData (int [] pelaajanNmrt){
        apuStr = JOptionPane.showInputDialog("Anna nmr.1: ");
        pelaajanNmrt[0] = Integer.parseInt(apuStr);

        apuStr = JOptionPane.showInputDialog("Anna nmr.2: ");
        pelaajanNmrt[1] = Integer.parseInt(apuStr);

        apuStr = JOptionPane.showInputDialog("Anna nmr.3: ");
        pelaajanNmrt[2] = Integer.parseInt(apuStr);

        apuStr = JOptionPane.showInputDialog("Anna nmr.4: ");
        pelaajanNmrt[3] = Integer.parseInt(apuStr);

        apuStr = JOptionPane.showInputDialog("Anna nmr.5: ");
        pelaajanNmrt[4] = Integer.parseInt(apuStr);
        
        apuStr = JOptionPane.showInputDialog("Anna nmr.6: ");
        pelaajanNmrt[5] = Integer.parseInt(apuStr);
  
        apuStr = JOptionPane.showInputDialog("Anna nmr.7: ");
        pelaajanNmrt[6] = Integer.parseInt(apuStr);
       
        JOptionPane.showMessageDialog(null,"Antamasi lottorivi on: "+Arrays.toString(pelaajanNmrt)); 

        
        
        

        
    
    }
    
}


//String palkinto = "";
//switch (samaNum) {
//    case 6: palkinto = "Voitit 1.200.000e!";
//             break;
//    case 5:  palkinto = "Voitit 110 032,50e!";
//             break;
//    case 4:  palkinto = "Voitit 813,60e!";
//             break;
//    case 3:  palkinto = "Voitit 26,30e!";
//             break;
//    case 2:  palkinto = "Voitit 10,00e!";
//             break;
//    case 1:  palkinto = "Voitit 2,00e!";
//             break;
//    case 0:  palkinto = "Ei voittoa.";
//             break;
//}



