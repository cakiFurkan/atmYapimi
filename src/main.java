
public class main {
    public static void main (String[] args){
        
        ATM a1= new ATM();
        Hesap hesap1=new Hesap("Furkan Çakı", "123", 20000);
       a1.calıs(hesap1);
       // hesap1.calis(hesap1);
        
        System.out.println("sistemden çıkılıyor...");
    }
}
