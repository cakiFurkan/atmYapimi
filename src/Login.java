
import java.util.Scanner;


public class Login {
    
    public  boolean login(Hesap hesap){
        
        Scanner scan=new Scanner(System.in);
     String kullanıcıAdı;
     String parola;
            System.out.println("kullanıcı adını giriniz");
            kullanıcıAdı=scan.nextLine();
            System.out.println("kullanıcı parolasını giriniz");
            parola=scan.nextLine();
            if(hesap.getKullanıcıAdı().equals(kullanıcıAdı)&&hesap.getParola().equals(parola)){
                return true;
                
            } else{
                return false;
                
            }
    }
}
    
    


