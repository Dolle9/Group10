package VeikkausPiste;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Kontrolleri {

    private Kayttoliittyma kayttoliittyma;
    private LottoArpoja arpoja;
    private Pankkitili ptili;
    private Veikkaustili vtili;

    public Kontrolleri() {

    }

    public void setPankkitili(Pankkitili ptili) {
        this.ptili = ptili;
    }

    public void setVeikkaustili(Veikkaustili vtili) {
        this.vtili = vtili;
    }

    public void setKäyttöliittymä(Kayttoliittyma kayttoliittyma) {
        this.kayttoliittyma = kayttoliittyma;
    }

    public void setLottoArpoja(LottoArpoja arpoja) {
        this.arpoja = arpoja;
    }

    
    public void pelaaLotto() {
        arpoja.arvoNumerot();
        int[] omat = new int[7];
        int omanro;

        for (int i = 0; i < omat.length; i++) {
            omanro = Integer.parseInt(JOptionPane.showInputDialog("Lotto: Anna " + (i + 1) + ". numero", ""));
                omat[i] = omanro;
            }
        arpoja.tarkistus(omat);
        System.out.println("voittorivi: " + arpoja.numerot());
        System.out.println("oma rivi: " + Arrays.toString(omat));
        System.out.println("oikein: " + arpoja.tarkistus(omat));
        }

    

    void katsoSaldo() {
        int viestityyppi = JOptionPane.QUESTION_MESSAGE;
        String[] valinnat = {"Veikkaustili", "Pankkitili", "Takaisin"};
        int valinta = JOptionPane.showOptionDialog(null,
                "Tilin valinta",
                "VeikkausPiste", 0, viestityyppi,
                null, valinnat, "Lopetan");
        if (valinta == 0) {
            JOptionPane.showMessageDialog(null,
                    vtili.getRahamäärä() + "e");
        } else if (valinta == 1) {
            JOptionPane.showMessageDialog(null,
                    ptili.getSaldo()+ "e");
        }

    }

    void vtiliPano() {

        double lisays;

        lisays = (Integer.parseInt(JOptionPane.showInputDialog("Paljonko laitetaan?", "")));

        if (lisays < 0 || ptili.getSaldo() - lisays < 0) {
            JOptionPane.showMessageDialog(null,
                    "Et voi lisätä negatiivista rahamäärää / Pankkitilillä ei tarpeeksi rahaa.",
                    "Siirto epäonnistui",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            ptili.nosta(lisays);
            vtili.lisää(lisays);
        }

    }

    void ptiliPano() {
        double lisays;

        lisays = (Integer.parseInt(JOptionPane.showInputDialog("Paljonko laitetaan?", "")));
        if (lisays < 0 || vtili.getRahamäärä() - lisays < 0) {
            JOptionPane.showMessageDialog(null,
                    "Et voi lisätä negatiivista rahamäärää / Veikkaustilillä ei tarpeeksi rahaa.",
                    "Siirto epäonnistui",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            ptili.talleta(lisays);
            vtili.vähennä(lisays);
        }

    }

    void pelaus() {
        int viestityyppi = JOptionPane.QUESTION_MESSAGE;
        String[] valinnat = {"Lotto", "Eurojackpot", "Onnenpeli", "Takaisin"};
        int valinta = JOptionPane.showOptionDialog(null,
                "Mitä haluat pelata?",
                "Pelit", 0, viestityyppi,
                null, valinnat, "Lopetan");

        switch (valinta) {
            case 0:
                pelaaLotto();
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
        }

    }
}
