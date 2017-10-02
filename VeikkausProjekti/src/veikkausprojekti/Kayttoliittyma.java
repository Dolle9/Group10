package VeikkausPiste;

import javax.swing.JOptionPane;

public class Kayttoliittyma {

    private Kontrolleri ctrl;
    final int LOPETUS = 4;

    public void setKontrolleri(Kontrolleri ctrl) {

        this.ctrl = ctrl;

    }


    public void keskustelu() {

        int valinta;

        do {
            valinta = kysyValinta();
            suorita(valinta);
        } while (valinta != LOPETUS);
    }

    private int kysyValinta() {

        int viestityyppi = JOptionPane.QUESTION_MESSAGE;
        String[] valinnat = {"Pelaan", "Laitan rahaa veikkaustilille", "Laitan rahaa pankkitilille", "Katson saldon", "Lopetan"};
        int valinta = JOptionPane.showOptionDialog(null,
                "Mitä teet?",
                "VeikkausPiste", 0, viestityyppi,
                null, valinnat, "Lopetan");

        return valinta;
    }

    private void suorita(int valinta) {

        switch (valinta) {
            case 0:
                ctrl.pelaus();
                break;
            case 1:
                ctrl.vtiliPano();
                break;
            case 2:
                ctrl.ptiliPano();
                break;
            case 3:
                ctrl.katsoSaldo();
                break;
            default:

        }

    }

}
