import java.util.*;

public class Lambda02 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-3, 12, 13, -65, 3, 8, 7, 17,22, 60, 42));
        ciftlerinKareMax(list);
        toplaEl1(list);
        toplaEl2(list);
        ciftCarpim(list);
        ciftCarpimEx(list);
        enKucuk1(list);
        onBesdenKucukTek(list);
        buyuktenKucugeSirali(list);
    }

    // Listdeki çift olan int değerlerin karelerini aliniz.

    public static void ciftlerinKareMax(List<Integer> list) {
        Optional<Integer> maxEleman = list.stream().filter(t -> t % 2 == 0).map(t -> t * t).reduce(Integer::max);
        // reduce() return edilen eleman null yada int'den büyük olur ihtimali için Java güvenlik olarak
        // handle ederek Optional class'i şart koşuyor.

        System.out.println(maxEleman);
    }

    //Listdeki tum elemanlarin toplamini yazdiriniz.
    //Lambda expression
    public static void toplaEl1(List<Integer> list) {
        int toplam = list.stream().reduce(0, (x, y) -> x + y);
        // x her zaman ilk degerini atanan degerden (0) alır
        // u her zaman degerini list.stream()'den alır.(akis)
        // x ilk degerden sonraki degerlerini islemden alir.
        System.out.println(toplam);
    }

    //Listdeki tum elemanlarin toplamini yazdiriniz.
    //Method Reference...

    public static void toplaEl2(List<Integer> list) {
        int toplam1 = list.stream().reduce(0, Integer::sum);
        int toplam2 = list.stream().reduce(0, Math::addExact);
        // x her zaman ilk degerini atanan degerden (0) alır
        // u her zaman degerini list.stream()'den alır.(akis)
        // x ilk degerden sonraki degerlerini islemden alir.
        System.out.println(toplam1);
    }

    //Listdeki çift elemanlarin çarpımını yazdiriniz.
    //Method Reference...
    public static void ciftCarpim(List<Integer> list) {
        Optional<Integer> ciftlerinCarpimi = list.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact);

        System.out.println(ciftlerinCarpimi);
    }

    //Listdeki çift elemanlarin çarpımını yazdiriniz.
    //Lambda Expression...
    public static void ciftCarpimEx(List<Integer> list) {
        int ciftlerinCarpimi2 = list.stream().filter(t -> t % 2 == 0).reduce(1, (x, y) -> (x * y));

        // pozitif değer bulunuz
        int ciftlerinCarpimiPoz = list.stream().filter(t -> t % 2 == 0 && t > 0).reduce(-1, (x, y) -> (x * y));

        System.out.println(ciftlerinCarpimiPoz);
    }
    // Listdeki elemanlardan en küçüğünü 4 farkl yöntem ile yazdırınız.

    public static void enKucuk1(List<Integer> list) {
        Optional<Integer> enKucukSayi = list.stream().reduce(Math::min);
        System.out.println(enKucukSayi);
    }

    //2. yontem
    public static void enKucuk2(List<Integer> list) {
        Optional<Integer> enKucukSayi2 = list.stream().reduce(Integer::min);
        System.out.println(enKucukSayi2);
    }

    public static int minBul(int x, int y){
        return x<y ? x:y;
    }

    //3. yontem
    public static void enKucuk3(List<Integer> list) {
        Optional<Integer> enKucukSayi3 = list.stream().reduce(Lambda02::minBul);
        System.out.println(enKucukSayi3);
    }
    //4. yontem Lamda Expression

    public static void enKucuk4(List<Integer> list) {
        int enKucukSayi4 = list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println(enKucukSayi4);
    }

    // Listdeki 15 ten büyük en kücük tek sayiyi yazdiriniz.

    public static void onBesdenKucukTek(List<Integer> list){
         System.out.println(list.stream().filter(t -> t > 15 && t % 2 == 1).reduce(Integer::min));
    }
    // list'in tek  elemanlarinin kareleri ni buykten kucuge  yazdiriniz
    public static void buyuktenKucugeSirali(List<Integer> list){
        list.stream().filter(t->t%2==1).distinct().map(t->t*t).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }



}
