public class Ortak {
    private int can;
    private String name;

    public Ortak(int can , String name){
        this.can=can;
        this.name=name;
    }
    public Ortak(){}

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        if (can > 100000) {
            throw new IllegalArgumentException("can 1000 den daha büyük olamaz");
        }
        this.can = can;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int canavarhasar() {
        can = can - EkAyar.hasar();
        return can;
    }
    public int savascihasar() {
        can = can - EkAyar.hasar();
        return getCan();
    }

}