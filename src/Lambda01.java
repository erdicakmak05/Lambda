import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

    public static void main(String[] args) {
        /*
             1) Lambda "Functional Programming"
                "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
             2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
             3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
                 ve hatasiz code yazma acilarindan cok faydalidir.
             4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
                Lambda kullanmak hatasız code kullanmaktır.
        */

        List <Integer>  list = new ArrayList<>(Arrays.asList(12,13,65,3,7,22,60,42));

        printElStructured(list);
        System.out.println();
        printElfunctional(list);
        System.out.println();
        printElfunctional1(list);
        System.out.println();
        printCiftElStructured(list);
        System.out.println();
        printCiftElFunctional(list);
        System.out.println();
        printCiftElFunctional2(list);
        System.out.println();
        printCift60danKucuk(list);
        System.out.println();
        tek20denBuyuk(list);
        System.out.println();
        ciftlerinKareleri(list);
        System.out.println();
        kupBirFazlaTekFunction(list);
        System.out.println();
        karekokHesapla(list);


    }

    // Structured Programing ile list elemanlarini aralarına boşluk bırakarak tamamını yazdırınız

    public static void printElStructured(List<Integer> list){
        for (Integer w:list) {
            System.out.print(w+ " ");
        }

    }

    // Functional Programing ile list elemanlarini aralarına boşluk bırakarak tamamını yazdırınız.

    public static void printElfunctional(List<Integer> list){
        list.stream().forEach(t->System.out.print(t+ " ")); // Lambda Expression : Lambda ifadesi

        // stream() : Dataları yukarıdan aşağı akıs şekline getirir.
        // t-> : Lambda operatorü
        // Lambda Expression yapısı cok tavsiye edilmez daha cok METHOD REFERENCE kullanılır.
    }

    // Method Reference --> kendi create ettiğimiz veya javadan aldıgımız method ile
    // Classname::MethodName

    public static void printEl(int t){ // Refere edilecek method create edildi.
        System.out.print(t+" ");
    }

    public static void printElfunctional1(List<Integer> list){
        list.stream().forEach(Lambda01::printEl);
    }
    // Structured Programing ile list elemanlarini aralarına boşluk bırakarak tamamını yazdırınız.

    public static void printCiftElStructured(List<Integer> list){
        for (Integer w : list){
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }
    }

    // Functional Programing ile list elemanlarini aralarına boşluk bırakarak tamamını yazdırınız.

    public static void printCiftElFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);
    }

    public static boolean  ciftBul(int i){ // refere edilecek tohum method creat edildi.

        return i%2==0;
    }

    public static void printCiftElFunctional2(List<Integer> list){ // İki tane method refere ettik
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void printCift60danKucuk(List<Integer> list){
        list.stream().filter(t->t%2==0 & t<60).forEach(Lambda01::printEl);
    }

    // Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void tek20denBuyuk(List<Integer> list){
        list.stream().filter(t-> t%2==1 || t>20 ).forEach(Lambda01::printEl);
    }
    // Functional Programming ile list elemanlarinin  çift olanlarının
    // karelerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftlerinKareleri(List<Integer> list){
        list.stream().filter(Lambda01::ciftBul).map(t->t*t).forEach(Lambda01::printEl);
    }

    // Functional Programming ile list elemanlarinin  tek olanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void kupBirFazlaTekFunction(List<Integer> list){
        list.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(Lambda01::printEl);
    }

    // Functional Programming ile list elemanlarinin  çift olanlarinin
    // kareköklerini  ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void karekokHesapla(List<Integer> list){
        list.stream().filter(t->t%2==0).map(Math::sqrt).forEach(Lambda01::printEl);
    }

    private static void printEl(Double t) {
        System.out.print(t+" ");
    }

    // Listin en büyük elemanini yazdırın.

    public static void enBuyukElemaniBul(List <Integer> list){
        Optional<Integer> maxEleman = list.stream().reduce(Math::max);
        System.out.println(maxEleman);

        // reduce()--> azaltmak ... bir çok datayı tek bir dataya cevirmek için kullanılır.
    }


}
