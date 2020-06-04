package test;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void hasil(){
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil volume balok : "+ph.volume(this));
        System.out.println("Hasil luas balok : "+ph.luas(this));
    }
}
