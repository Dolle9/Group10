package veikkausprojekti;

public class Veikkaustili {

    private double rahat;
    private Pankkitili tili;

    public Veikkaustili(double x) {
        this.rahat = x;

    }

    public void setPankkitili (Pankkitili tili) {
        this.tili = tili;
    }
    
    public Veikkaustili() {

    }

    public void setRahat(double x) {
        this.rahat = x;
    }

    public double getRahamäärä() {
        return rahat;
    }

    public void lisää(double x) {
        if (x > 0) {
            this.rahat += x;
        } else {
            System.out.println("Et voi lisätä negatiivista rahamäärää!");
        }
    }

    public boolean vähennä(double x) {
        boolean onkoTotta;
        if ((this.rahat - x) < 0) {
            System.out.println("Sinulla ei ole tarpeeksi rahaa!");
            onkoTotta = false;
        } else {
            this.rahat -= x;
            onkoTotta = true;
        }
        return onkoTotta;
    }
}
