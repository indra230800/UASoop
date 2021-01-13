package nomor2;

public class Main {
    
    public static void main(String[] args) {
        bangundatar bd  = new bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        System.out.println("NIM SAYA 201969040023");
        System.out.println("========================");
        System.out.println("===> LUAS DAN KELILING SEGITIGA <===");
        
    segitiga st = new segitiga();
    st.HitungLuas();
        System.out.println("==========");
        st.HitungKeliling();
        
        System.out.println("========================");
        System.out.println("========================");
        System.out.println("========================");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        persegi kotak = new persegi();
        System.out.println("========================");
        kotak.HitungKeliling();
        
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("======================");
        
        System.out.println("Luas Dan keliling Lingkaran");
        Lingkaran Bundar = new Lingkaran();
        Bundar.HitungLuas();
        System.out.println("======================");
        Bundar.HitungKeliling();
        
    }
}