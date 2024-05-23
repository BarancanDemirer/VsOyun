public class Savasci extends Ortak{
    private int ozelguc;
    Canavar canavar1 = new Canavar(60, "Canavar");


    public Savasci( int can,String name, int ozelguc) {
       super(can,name);
        if (can > 1000) {
            throw new IllegalArgumentException("can 1000 den daha büyük olamaz");
        }
        this.ozelguc = ozelguc;
    }
    public Savasci(){
    }


    public int getÖzelguc() {
        return ozelguc;
    }
    public void setÖzelguc(int ozelguc) {
        this.ozelguc = ozelguc;
    }

    public void ozelsecilimkillua() {
        int a = getCan() + getÖzelguc();
        while (a > 0 && canavar1.getCan() > 0) {
            System.out.println(canavar1.getName() + ": " + canavar1.getCan());
            canavar1.canavarhasar();
            System.out.println(getName() + ": " + a);
            a = a - EkAyar.hasar();
        }
    }
    public void ozelsecilimillumi() {
        int can = canavar1.getCan();
        while (getCan() > 0 && can > 0) {
            int b = EkAyar.hasar() + getÖzelguc();
            System.out.println(canavar1.getName() + ": " + can);
            can = can - b;
            System.out.println(getName() + ": " + getCan());
            savascihasar();
        }
    }
    public int canavarcan() {
        int can = canavar1.getCan();
        while (getCan() > 0 && can > 0) {
            int b = EkAyar.hasar() + getÖzelguc();
            System.out.println(canavar1.getName() + ": " + can);
            can = can - b;
            System.out.println(getName() + ": " + getCan());
            savascihasar();
        }
        return can;
    }
    public void ozelsecilimbaran(){
        while (getCan()>0&&canavar1.getCan()>0){
            System.out.println(canavar1.getName() + ": " + canavar1.getCan());
            canavar1.canavarhasar();
            System.out.println(getName() + ": " + getCan());
            savascihasar();
        }
    }
    public void sonuc() {
        if (getCan() < 0) {
            System.out.println("canavar kazandı ");
        } else if(canavarcan()<0) {
            System.out.println(getName() + " prensesi kurtardı");
        }
    }
}
