package nomor2;

public class persegi extends segitiga {
    
@Override

   public void HitungLuas() {
       double luas;
       luas = this.sisic * this.sisic;
       System.out.println("Panjang SISI :" + this.sisic + "CM");
       System.out.println("Luas Persegi Adalah : " + luas + "CM");
   }    
@Override

   public void HitungKeliling() {
    double keliling;
    keliling = this.sisic * 2;
    System.out.println("Panjang SISI : " + this.sisic + "CM");
    System.out.println("Luas Persegi Adalah : " + keliling + "CM");
    
   }
}