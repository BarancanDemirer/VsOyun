import java.util.Scanner;
public class EkAyar {
    Savasci savasci = new Savasci(35, "Baran", 0);
    Canavar canavar1 = new Canavar(60, "Canavar");
    Savasci savasci1 = new Savasci(30, "Killua", 35);
    Savasci savasci2 = new Savasci(40, "İllumi", 5);

    public void karakterSecim() {     // kullanıcı karakter seçiyor
        System.out.println("prenses canavar tarafından kaçırıldı onu kurtarmak için savaşcı seç");
        System.out.println("lütfen seçmek istediğiniz karakteri seçin");
        System.out.println("1: Baran\n2 : Killua\n3 :İllumi");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if (secim == 2) {
            savasci = savasci1;
        } else if (secim == 3) {
            savasci = savasci2;
        }
    }
    public void savasbaslatici() {
        int illumihasar = 0;
        int killuahasar = 0;
        String killuam = "Killua";
        String İllumi = "İllumi";
        String baran = "Baran";

        while (savasci.getCan() > 25) {
            System.out.println(canavar1.getName() + ": " + canavar1.getCan());
            canavar1.canavarhasar();
            System.out.println(savasci.getName() + ": " + savasci.getCan());
            savasci.savascihasar();
        }
        System.out.println(savasci.getName()+"özel güç açıldı");

        if (savasci.getName().equals(baran)){
          savasci.ozelsecilimbaran();
        }
        else if (savasci.getName().equals(killuam)) {
            savasci.ozelsecilimkillua();}
        else if (savasci.getName().equals(İllumi)) {
           savasci.ozelsecilimillumi();
        }

    }

    public static int hasar() {
        int savasvurus = (int) (5 * Math.random());
        return savasvurus;
    }

}
