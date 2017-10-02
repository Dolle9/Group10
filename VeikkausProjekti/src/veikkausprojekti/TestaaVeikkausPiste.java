
package VeikkausPiste;

public class TestaaVeikkausPiste {


    public static void main(String[] args) {
       
        Kayttoliittyma kayttis = new Kayttoliittyma();
        Kontrolleri ctrl = new Kontrolleri();
        Pankkitili ptili = new Pankkitili(50);
        Veikkaustili vtili = new Veikkaustili(15);
        LottoArpoja lotto = new LottoArpoja();
        
        kayttis.setKontrolleri(ctrl);
        
        ctrl.setKäyttöliittymä(kayttis);
        ctrl.setLottoArpoja(lotto);
        ctrl.setPankkitili(ptili);
        ctrl.setVeikkaustili(vtili);
        
        kayttis.keskustelu();
        
        System.out.println("Loppu");
    }
    
}
