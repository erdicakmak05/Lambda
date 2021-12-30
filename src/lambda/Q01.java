package lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

	public static void main(String[] args) {
		
//      2) "Q01" olarak adlandırılan bir class oluşturun
//      3) 5 String öğesi içeren bir String list oluşturun.
//      4) 3 tanesi "A" harfi ile başlayacak
//      5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
//      5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.
		
		List<String> list = new ArrayList<>(Arrays.asList("Angel","Andy","Ali","Emrah","Kerem"));
		
		list.stream().filter(t->t.startsWith("A")).filter(t->t.length()<5).map(String::toUpperCase).forEach(System.out::println);

	}

}
