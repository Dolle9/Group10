package veikkausprojekti;

public class Pankkitili {

    private double saldo;

    public Pankkitili() {

    }

    public Pankkitili(double x) {
        this.saldo = x;

    }

    public void setSaldo(double x) {
        this.saldo = x;
    }

    public double getSaldo() {
        return saldo;
    }

    public void talleta(double x) {
        if (x > 0) {
            this.saldo += x;
        } else {
            System.out.println("Et voi tallettaa negatiivista rahasummaa!");
        }
    }

    public boolean nosta(double x) {
        boolean onkoTotta;
        if ((this.saldo - x) < 0) {
            System.out.println("Sinulla ei ole tarpeeksi saldoa!");
            onkoTotta = false;
        } else {
            this.saldo -= x;
            onkoTotta = true;
        }
        return onkoTotta;
    }
}
