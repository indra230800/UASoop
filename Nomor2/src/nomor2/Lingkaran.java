package nomor2;

public class Lingkaran extends segitiga {
    
    @Override


    public void HitungLuas() {
        double luas;
        luas = 3.14 * jarijari * jarijari;
        System.out.println("Jari jari Lingkaran : " + jarijari);
        System.out.println("Luas Lingkaran Adalah : " + luas);
   }
    @Override
        public void HitungKeliling () {
            double keliling;
            keliling = 2 * 3.14 * jarijari;
            System.out.println("Jari Jari Lingkaran : " + jarijari);
            System.out.println("Keliling Lingkaran Adalah : " + keliling);
   }
}