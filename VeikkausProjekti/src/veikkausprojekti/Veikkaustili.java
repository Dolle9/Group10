package VeikkausPiste;

public class Veikkaustili {

    private double rahat;
    private String rahatS;
    private Pankkitili tili;

    public Veikkaustili(double x) {
        this.rahat = x;
        this.rahatS = Integer.toString((int) x);
    }

    public void setPankkitili(Pankkitili tili) {
        this.tili = tili;
    }

    public Veikkaustili() {

    }

    public void setRahat(double x) {
        this.rahat = x;
        this.rahatS = Integer.toString((int) x);
    }

    public double getRahamäärä() {
        return rahat;
    }

    public String rahatilanneS() {
        return rahatS;
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

    @Override
    public String toString() {
        return "Veikkaustili";
    }

}
