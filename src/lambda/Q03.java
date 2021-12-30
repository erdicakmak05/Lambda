package lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q03 {

	public static void main(String[] args) {
	    // String isimlerden olusan bir list olusturun
	    // Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
		// Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
		// Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
		// Konsoldaki farklı öğeleri ters sırada yazdırın.
		// Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
		List<String> list = new ArrayList<>(Arrays.asList("Emine", "Uğur", "Hakan", "Emine", "Ahmet"));

		list.stream().distinct().sorted().forEach(t -> System.out.println(t + " " + t.length()));

		System.out.println("*******************************************");

		list.stream().distinct().sorted(Comparator.comparing(t -> t.toString().length() - 1))
				.forEach(System.out::println);
		System.out.println("*******************************************");
		// Konsoldaki farklı öğeleri yazdırın, son karakterine göre sıralayın.
		list.stream().distinct().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)))
				.forEach(System.out::println);
		System.out.println("*******************************************");
		
		// Konsoldaki farklı öğeleri ters sıralı yazdırın.
		list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
		
		// Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
		System.out.println("*********************************************");
		list.stream().filter(t->t.toString().length()<7).map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
		
	}

}
