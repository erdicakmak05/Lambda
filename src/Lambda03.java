import java.util.*;
import java.util.stream.Collectors;

public class Lambda03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Mehmet", "Emre", "Serkan", "Cicaldau", "Muslera", "Fegouli",
				"Kerem", "Morutan", "Djangne", "Serkan"));
		siraliTekrarsiz(list);
		System.out.println();
		karakterSayisiSirali(list);
		System.out.println();
		karakterSayisiKucuktenBuyuge(list);
		System.out.println();
		sonHarfTersSirali(list);
		System.out.println();
		ciftSayiliKareleriBuyuktenKucuge(list);
		System.out.println();
		yediDenAzMiCokMu(list);
		System.out.println();
		wIleBasliyorMu(list);
		System.out.println();
		karakteriEnBuyukEl(list);
		System.out.println("3. Gün");
		sonHarfeGoreIlkEleman(list);

	}

	// List elemanlarini alfabatik buyuk harf sırası ile ve tekrarsız yazdırınız.
	public static void siraliTekrarsiz(List<String> list) {
		list.stream().distinct().map(String::toUpperCase).sorted().forEach(t -> System.out.print(t + " "));
	}

	// List elemanlarinin karakter sayısını ters sirali yazdiralim
	public static void karakterSayisiSirali(List<String> list) {
		list.stream().map(t -> t.length()).distinct().sorted(Comparator.reverseOrder())
				.forEach(t -> System.out.print(t + " "));
	}

	// List elemanlarini karakter sayinina gore kucukten buyuge gore yazdırın
	public static void karakterSayisiKucuktenBuyuge(List<String> list) {
		list.stream().sorted(Comparator.comparing(t -> t.length())).

				forEach(t -> System.out.print(t + " "));
	}

	// List elemanlarini son harfine göre ters sirali yazdiralim
	public static void sonHarfTersSirali(List<String> list) {
		list.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed())
				.forEach(t -> System.out.print(t + " "));
	}

	// Cift sayili elemanlarin karelerini hesaplayan, tekrarsiz olanlari sadece bir
	// kere buyukten kucuge dogru
	// yazdiran bir program yaziniz.
	public static void ciftSayiliKareleriBuyuktenKucuge(List<String> list) {
		list.stream().filter(t -> t.length() % 2 == 0).map(t -> t.length() * t.length())
				.sorted(Comparator.reverseOrder()).distinct().forEach(t -> System.out.print(t + " "));

	}

	// List elemanlarinin karakter sayisinin 7 ve 7 den az olma durmunu kontrol
	// ediniz
	public static void yediDenAzMiCokMu(List<String> list) {
		String kontrol = list.stream().allMatch(t -> t.length() <= 7) ? "List elamanlari 7 harfden büyük değil"
				: "List elamanlari 7 harfden büyük";
		/*
		 * if (kontrol){ System.out.println("List elamanlari 7 harfden büyük değil");
		 * }else { System.out.println("List elamanlari 7 harfden büyük"); }
		 */
		System.out.println(kontrol);
	}

	// List elemanlarin "W" ile başlamasini control ediniz.
	public static void wIleBasliyorMu(List<String> list) {
		String sonuc = list.stream().allMatch(t -> t.startsWith("W")) ? "W ile başlayan eleman İçeriyor"
				: "W ile başlayan eleman İçermiyor";
		System.out.println(sonuc);

	}

	// Karakter sayisi en buyuk elemani yazdiriniz.
	public static void karakteriEnBuyukEl(List<String> list) {
		System.out.println(list.stream().sorted(Comparator.comparing(t -> t.toString().length()).// lenght karakter
																									// uzunluguna gore
																									// siraladi k->b
				reversed()).// ters sirlad b->k
				findFirst());// ilk elelmni aldi

	}
	// anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return
	// eder
	// allMatch() --> tum elemanlar sarti saglarsa true en az bir eleman sarti
	// saglamazsa false return eder.
	// noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA
	// false return eder.

	// List elamanlarini son harfine göre siralayip ilk elemani hariç kalan
	// elemanlari yaziniz.

	public static void sonHarfeGoreIlkEleman(List<String> list) {

		list.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1))).skip(1)
				.forEach(t -> System.out.print(t + " "));
	}

}
