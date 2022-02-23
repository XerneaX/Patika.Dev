package UserLogin;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String username, password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adını giriniz");
        username = scanner.nextLine();

        System.out.println("Kullanıcı şifresini griniz");
        password = scanner.nextLine();

        if(username.equals("patika") && password.equals("dev")){
            System.out.println("Giriş Başarılı");
        }
        else{
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1- Evet 2-Hayır");

            int secim;
            secim = scanner.nextInt();

            switch (secim){
                case 1: {
                    System.out.println("Yeni şifrenizi giriniz" + scanner.nextLine());
                    String newPassword = scanner.nextLine();
                    if(newPassword.equals("dev")){
                        System.out.println("Yeni şifre eskisi ile aynı olamaz");
                    }
                    else{
                        password = newPassword;
                        System.out.println("Yeni şifre oluşturuldu");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Şifre değiştirmekten vazgeçildi");
                    break;
                }
            }

        }
    }
}
