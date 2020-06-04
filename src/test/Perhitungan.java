package test;

public class Perhitungan {

    int volume(Balok sisi){
        return sisi.getPanjang()*sisi.getLebar()*sisi.getTinggi();
    }

    int luas(Balok sisi){
        return 4*sisi.getPanjang()*sisi.getLebar()*sisi.getTinggi();
    }

//        int volume(Balok sisi){
//        int panjang = sisi.getPanjang();
//        int lebar = sisi.getLebar();
//        int tinggi = sisi.getTinggi();
//        return panjang*lebar*tinggi;
//    }

//        int luas(Balok sisi){
//        int panjang = sisi.getPanjang();
//        int lebar = sisi.getLebar();
//        int tinggi = sisi.getTinggi();
//        return 4*panjang*lebar*tinggi;
//    }
}
