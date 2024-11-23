
import java.util.Scanner;

public class Hesap {

    Scanner scan = new Scanner(System.in);

    private String kullanıcıAdı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcıAdı, String parola, int bakiye) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void hesapSorgulama() {
        System.out.println("hesabınızda bulunan bakiye : " + bakiye);
    }

    public void paraYatırma(int tutar) {
        bakiye += tutar;
        System.out.println("yeni bakiyeniz :" + bakiye);

    }

    public void paraCekme(int tutar) {
        if (tutar <= bakiye) {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz :" + bakiye);
        } else {
            System.out.println("yetersiz bakiye!!! Hesabınızda güncel bakiyeniz =" + bakiye);
        }

    }

    public void faturaYatirma() {

        String ödemeler = "1.Su faturasi\n"
                + "2.Elektrik faturasi\n"
                + "3.Doğal gaz faturasi\n"
                + "4.vergi ödemeleri\n"
                + "5.telefon faturasi";

        System.out.println("yapmak istediğiniz islemi seciniz");
        System.out.print(ödemeler);
        switch (ödemeler) {
            case "1" -> {
                System.out.print("ödemek istediğiniz su faturasi tutarini giriniz :");
                double suFaturasi = scan.nextDouble();
                scan.nextLine();
                System.out.println("ödenen su faturasi tutari :" + suFaturasi);
            }
            case "2" -> {
                System.out.print("ödemek istediğiniz elektrik faturasi tutarini giriniz :");
                double elektrikFaturasi = scan.nextDouble();
                scan.nextLine();
                System.out.println("ödenen su faturasi tutari :" + elektrikFaturasi);
            }
            case "3" -> {
                System.out.print("ödemek istediğiniz doğal gaz faturasi tutarini giriniz :");
                double dogalGazFaturasi = scan.nextDouble();
                scan.nextLine();
                System.out.println("ödenen su faturasi tutari :" + dogalGazFaturasi);
            }
            case "4" -> {
                System.out.print("ödemek istediğiniz vergi tutarini giriniz :");
                double vergiOdemeleri = scan.nextDouble();
                scan.nextLine();
                System.out.println("ödenen su faturasi tutari :" + vergiOdemeleri);
            }
            case "5" -> {
                System.out.print("ödemek istediğiniz telefon faturasi tutarini giriniz :");
                double telefonFaturasi = scan.nextDouble();
                scan.nextLine();
                System.out.println("ödenen su faturasi tutari :" + telefonFaturasi);
            }
        }
        
    }
    public void calis(Hesap hesap){
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
