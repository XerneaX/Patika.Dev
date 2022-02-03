package VATCalculate;

import java.util.Scanner;

public class Main {
    /*
    * KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
* KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fiyat giriniz");
        double price = scanner.nextDouble();
        double newPrice =0, priceDiff=0;
        if(price>= 0 && price<= 1000 ){
            newPrice = (price*(100+18)/100);
        }
        else{
            newPrice = (price*(100+8)/100);
        }
        priceDiff = newPrice-price;
        System.out.println("KDV'siz Fiyat: " + price);
        System.out.println("KDV'li Fiyat: " + newPrice);
        System.out.println("KDV Tutarı: " + priceDiff);
    }

}
