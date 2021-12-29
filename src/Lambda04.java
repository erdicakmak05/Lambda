import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda04 {

	public static void main(String[] args) {

		TechPro trGunduz = new TechPro("yaz", "TR gunduz", 97, 124);

		TechPro engGunduz = new TechPro("kis", "ENG gunduz", 95, 131);

		TechPro trGece = new TechPro("bahar", "TR gece", 98, 143);

		TechPro engGece = new TechPro("sonbahar", "ENG gece", 93, 151);

		List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz, engGunduz, trGece, engGece));

		System.out.println(batchOrt92Buyuk(list));
		
		System.out.println(batchOrt110danAzMi(list));
		
		System.out.println(baharVarMi(list));
		
		ogrSayisiSiralaBK(list);
		
		System.out.println(ortalamaSiralamasi(list));
		
		System.out.println(ogrSayisiEnAz2Batch(list));
		
		System.out.println(buyuk95OgrSayilariToplami(list));
		
		System.out.println(ogrcSayisi130BykBatchOrt(list));

	}

	// task 01-> batch ort'larinin 92 den büyük oldugunu kontrol eden method create
	// ediniz.
	public static boolean batchOrt92Buyuk(List<TechPro> list) {

		return list.stream().allMatch(t -> t.getBatchOrtalama() > 92);
		// allMatch tüm elemanlari kontrol ediyor, şarta uymayan varsa false döner
	}
	//task 02-->ogrc sayilarinin hic birinin  110 den az olmadigini  kontrol eden pr create ediniz.
	
	public static boolean batchOrt110danAzMi(List<TechPro> list) {
		
		return list.stream().noneMatch(t->t.getBatchOrtalama()<110);
		//noneMatch hepsinin şartı sağlamasını ister.
	}
	
	//task 03-->batch'lerde herhangi birinde "bahar" olup olmadigini  kontrol eden pr create ediniz.
	
	public static boolean baharVarMi(List<TechPro> list) {
		
		return list.stream().anyMatch(t->t.getBatch().equals("bahar"));
		
		//anyMatch herhangi birinde var mi yok mu kontrol eder.
	}
	//task 04-->batch'leri ogr sayilarina gore b->k siralayiniz.
	
	public static List<Integer>  ogrSayisiSiralaBK(List<TechPro> list) {
		
		 List<Integer> sayilar = list.stream().map(t->t.getOgrcSayisi()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 return sayilar;
	}
	
	// task 05 --> Batch'leri batch ortalamasina göre b->k siralayip ilk 3 ünü yazdırınız.
	
	public static List<TechPro>  ortalamaSiralamasi(List<TechPro> list) {
		
		 return  list.stream().sorted(Comparator.comparing(TechPro::getBatchOrtalama).reversed()).limit(3).collect(Collectors.toList());
		 
	}
	
	//task 06--> ogrc sayisi en az olan 2. batch'i  yazdiriniz.
	
	public static List<TechPro>  ogrSayisiEnAz2Batch(List<TechPro> list) {
		
		 return  list.stream().sorted(Comparator.comparing(TechPro::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList());
		 
	}
	
	//task 07 --> batch ort 95 'den buyuk olan batch'lerin ogrc sayilarini toplamini yazdiriniz
	
	public static Integer  buyuk95OgrSayilariToplami(List<TechPro> list) {
		
		 return  list.stream().filter(t->t.getBatchOrtalama()>95).map(t->t.getOgrcSayisi()).reduce(0,Integer::sum);
		 
	}
	
	//task 08--> ogrc sayilari 130 dan buyuk olan batch'lerin batch ort bulunuz.
	
	public static OptionalDouble ogrcSayisi130BykBatchOrt(List<TechPro> list){
	  return   list.
	          stream().
	          filter(t->t.getOgrcSayisi()>130).
	          mapToDouble(t->t.getBatchOrtalama()).
	          average();

	}
	
}
