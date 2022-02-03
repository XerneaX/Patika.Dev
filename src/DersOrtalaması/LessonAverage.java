package DersOrtalaması;

import java.util.Scanner;

public class LessonAverage {

    /*
    * Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
*  ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
*

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
* küçük ise "Sınıfta Kaldı" yazsın.*/
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int math,fzk, kimya, tr, tarih,music;
        System.out.println("Matematik notunu giriniz");
        math = scanner.nextInt();
        System.out.println("Fizik notunu giriniz");
        fzk = scanner.nextInt();
        System.out.println("Kimya notunu giriniz");
        kimya = scanner.nextInt();
        System.out.println("Türkçe notunu giriniz");
        tr = scanner.nextInt();
        System.out.println("Tarih notunu giriniz");
        tarih =scanner.nextInt();
        System.out.println("Müzik notunu giriniz");
        music=scanner.nextInt();

        int average = (math+fzk+kimya+tr+tarih+music)/6;
        System.out.println("Ortalamanız:.."+ average);
        if (average >= 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }

    }
}
