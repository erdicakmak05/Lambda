package proje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static List<Ogrenci> ogrListesi = new ArrayList<>();
	public static void main(String[] args) {
		Ogrenci ogr1 = new Ogrenci("Ahmet","Çelik","Erkek",24,80);
		ogrListesi.add(ogr1);
		Ogrenci ogr2 = new Ogrenci("Ayşe","Yılmaz","Kadın",27,90);
		ogrListesi.add(ogr2);
		Ogrenci ogr3 = new Ogrenci("Selim","Deniz","Erkek",22,60);
		ogrListesi.add(ogr3);
		Ogrenci ogr4 = new Ogrenci("Fatma","Doğan","Kadın",25,75);
		ogrListesi.add(ogr4);
		

	    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
		diplomaNotuArasinda(70,100);
		System.out.println("***");
	    //Öğrencileri yaşlarına göre sıralayark yazdırin
		//yasaGoreSirali();
		//System.out.println("***");
	    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
		//yasaCinsiyeteGoreSirala(25, "erkek");
		
		System.out.println("***");
	    //Öğrencileri isimlerine göre yazdırın
		isimlereGoreYazdir();
		
		System.out.println("***");
		soyIsimeGoreSirala("Deniz");
		
		 //reduce metoduyla ortalama hesaplayin
		System.out.println("***");
		
	}

	private static void soyIsimeGoreSirala(String soyad) {
		ogrListesi.stream().filter(t->t.getSoyad().equalsIgnoreCase(soyad)).forEach(t->System.out.println(t.toString()));
		
	}

	private static void isimlereGoreYazdir() {
		ogrListesi.stream().sorted(Comparator.comparing(Ogrenci::getAd)).forEach(t->System.out.println(t.toString()));
		
	}

	//Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
	public static void yasaCinsiyeteGoreSirala(int yas,String cinsiyet) {
		ogrListesi.stream().filter(t->t.equals(cinsiyet) & t.getYas()<yas).sorted(Comparator.comparing(Ogrenci::getYas)).forEach(t->System.out.println(t));
	}
	
    //Öğrencileri yaşlarına göre sıralayark yazdırin
	public static void yasaGoreSirali() {
		
	}
	
  
	//Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
	public static void diplomaNotuArasinda(double a,double b) {
		ogrListesi.stream().filter(t->t.getDiplomaNotu()>a && t.getDiplomaNotu()<b).forEach(t->System.out.println(t.toString()));
	}
}
