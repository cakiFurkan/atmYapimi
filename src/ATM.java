
import java.util.Scanner;


public class ATM {
    public void calıs(Hesap hesap){
    
         Login login=new Login();
        Scanner keyb=new Scanner(System.in);
        System.out.println("bankaya hos geldinizzz");
        System.out.println("****************************");
        System.out.println("Kullanıcı girişi ...");
        System.out.println("*******************************");
        int girisHakkı=3;
        while (true){
            
            if(login.login(hesap)){
                System.out.println("giriş başarılıı ...");
                break;
                
                
            }
            else{
                System.out.println("giriş başarısızz");
                  girisHakkı-=1;
                System.out.println("kalan giriş hakkı :"+girisHakkı);
                
            }
            if(girisHakkı==0){
                System.out.println("giriş hakkınız tükenmiştir");
                return;
            }
        }
        
        System.out.println("*************************************");
        String islemler="3.bakiyeyi görüntüle\n"
                + "1.para çekme\n"
                + "2.para yatırma\n"
                + "çıkış için q ya basınız";
        System.out.println("islemler : "+islemler);
        System.out.println("***************************************");
        
        while (true){
            System.out.println("islemi seçiniz:");
            String islem=keyb.nextLine();
            if(islem.equals("q")){
                
                break;
            }
            else if(islem.equals("1")){
                System.out.println("çekmek istediğini tutar :");
                int tutar=keyb.nextInt();
                keyb.nextLine();
                if(tutar<=hesap.getBakiye()){
                hesap.paraCekme(tutar);
                }
                else{
                    System.out.println("yetersiz bakiye. hesabınızdaki güncel bakiye :"+hesap.getBakiye());
                }
                
            }
            else if(islem.equals("2")){
                System.out.println("yatırmak istediğiniz tutar :");
                int tutar=keyb.nextInt();
                keyb.nextLine();  
                hesap.paraYatırma(tutar);
            }
        
            else if(islem.equals("3")){
                System.out.println("hesabınızdaki bakiye :"+hesap.getBakiye());
            }else{
                System.out.println("geçersiz islem...");
                
            }
            }
        
        
        
        
        
        
        
        
        
}
    }
    
    

