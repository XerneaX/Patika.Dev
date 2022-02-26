package FlightPriceCalculater;

import java.util.Scanner;

public class Main {
    /*
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age, distance, travelType;
        double unitPrice = 0.10;
        double newPrice = 0;

        System.out.println("Mesafeyi giriniz");
        distance = scanner.nextInt();

        System.out.println("Yaşınızı giriniz");
        age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        travelType = scanner.nextInt();

        if(age > 0 && distance >0){
            double distancePrice = distance * 0.10;
            switch (travelType){
                case 1:{
                    if(age < 12){
                        newPrice = distancePrice - (distancePrice*0.5);
                    }
                    else if(age >= 12 && age <= 24){
                        newPrice = distancePrice - (distancePrice*0.1);

                    }
                    else if(age > 64){
                        newPrice = distancePrice - (distancePrice*0.3);
                    }
                    else{
                        newPrice = distancePrice;
                    }

                    break;
                }
                case 2:{
                    if(age < 12){
                        newPrice = distancePrice - (distancePrice*0.5);
                    }
                    else if(age >= 12 && age <= 24){
                        newPrice = distancePrice - (distancePrice*0.1);
                    }
                    else if(age > 64){
                        newPrice = distancePrice - (distancePrice*0.3);
                    }
                    else{
                        newPrice = distancePrice;
                    }
                    newPrice = (newPrice - newPrice*0.2)*2;

                    break;
                }
                default:{
                    System.out.println("Hatalı Veri Girdiniz!");
                }

            }

        }
        else{
            System.out.println("Hatalı Veri Girdiniz!");
        }

        System.out.println("Toplam Tutar: " + newPrice);
    }
}
