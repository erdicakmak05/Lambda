import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) throws IOException {
		String dosyaYolu = "C:\\\\Users\\\\Erdi\\\\eclipse-workspace\\\\Lambda\\\\src\\\\gs.txt";

		// TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a yazdiriniz)
		System.out.println("\n*** gs.txt dosyasini okuyunuz -->  ");

		Files.lines(Paths.get("C:\\Users\\Erdi\\eclipse-workspace\\Lambda\\src\\gs.txt")).forEach(System.out::println);

		// TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk
		// harflerle yazdiriniz)
		System.out.println("\n*** haluk.txt dosyasini buyuk harflerle okuyunuz -->  ");

		Files.lines(Paths.get(dosyaYolu)).map(String::toUpperCase).forEach(System.out::println);

		// TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle yazdiriniz.
		System.out.println("\n*** haluk.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");

		Files.lines(Paths.get(dosyaYolu)).limit(1).map(String::toLowerCase).forEach(System.out::println);

		// TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz
		// yazdiriniz
		System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
		System.out.println(Files.lines(Paths.get(dosyaYolu)).filter(t->t.contains("basari")).count());
		
		
		
		// TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri yazdiriniz.
		System.out.println("\n*** haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
		
		Files.lines(Paths.get(dosyaYolu)).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

		
		
		
		// TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order yazdiriniz.
		System.out.println("\n*** haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
		// TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini
		// buyuk harf kucuk harf bag??ms??z yaziniz.
		System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");
		// TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini ekrana
		// yazdiran programi yaziniz
		System.out.println(
				"\n*** haluk.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
		// TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri yazdiriniz
		System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
		// TASK 10 --> haluk.txt dosyasinda kac /farkl?? harf kullanildigini yazdiriniz
		System.out.println("\n*** haluk.txt dosyasinda kac /farkl?? harf kullanildigini  yazdiriniz. -->  ");
		// TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini yazdiriniz
		System.out.println("\n*** haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

	}

}
