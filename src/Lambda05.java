import java.util.stream.IntStream;

public class Lambda05 {

	public static void main(String[] args) {

		System.out.println(topla(10));

		System.out.println(topla1(10));
		
		System.out.println(ciftTopla(15));
		
		System.out.println(toplaTek(15));
		
        ikiIlkXkuvvet(7);//2 4 8 16 32 64 128
        System.out.println("   ***   ");
        istenenSayIlkXkuvvet(2,3);//2 nin ilk 3 kuvveti : 2 4 8
        System.out.println("   ***   ");
        istenenSayIlkXkuvvet(3,4);//3 un ilk 4 kuvveti :3 9 27 81
        System.out.println("   ***   ");
        System.out.println(istenenSayiniXincikuvvet(2, 4));
        System.out.println("   ***   ");
        System.out.println(istenenSayiniFaktoriyeli(5));
	}

	// TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e
	// kadar tamsayilari toplayan bir program yaziniz.

	public static int topla(int x) {
		int toplam = 0;
		for (int i = 0; i <= x; i++) {
			toplam += i;
		}

		return toplam;

	}

	// Function Programing

	public static int topla1(int x) {

		return IntStream.rangeClosed(1, x).sum();

		// range 2. eleman dahil değil
		// rangeClosed ikiside dahil

	}

	// TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz

	public static int ciftTopla(int x) {

		return IntStream.rangeClosed(1, x).filter(t -> t % 2 == 0).sum();

	}
	
	public static int ciftTopla1(int x) {

		return IntStream.iterate(2,t->t+2).limit(x).sum();

	}

	// TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
	
	public static int toplaTek(int x) {
	    return IntStream.
	            iterate(1,t->t+2).
	            limit(x).
	            sum();
	}

	// TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz

	public static int toplaIlkTek(int x) {

	    return IntStream.iterate(1, t -> t + 2).//1 3 5 ... x elemanarinin akısı
	            limit(x).//akısdaki ilk x elamanı verir
	            sum();//akısdaki ilk x elamanı toplar
	}
	
	//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz--> 2 4 8 16
	public static void ikiIlkXkuvvet(int x) {

	     IntStream.iterate(2, t -> t * 2).//2 4 8 16 32 x elemanarinin akısı
	            limit(x).//akısdaki ilk x elamanı verir
	            forEach(Lambda01::printEl);
	}

	// TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi
	// yaziniz
	
    public static void istenenSayIlkXkuvvet(int a, int x) {
        IntStream.iterate(a, t -> t * a).limit(x).forEach(Lambda01::printEl);
    }

    
  //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
    public static int istenenSayiniFaktoriyeli(int x) {
        return IntStream.rangeClosed(1,x).//a a^2 a^3 a^4... x elemanarinin akısı
                // reduce(Math::multiplyExact);
                 reduce(1,(t,u)->t*u);
    }
	
	//TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi yaziniz
	public static int istenenSayiniXincikuvvet(int a, int x) {

	   return IntStream.iterate(a, t -> t * a).//a a^2 a^3 a^4... x elemanarinin akısı
	            limit(x).//akısdaki ilk x elamanı verir
	            reduce(0,(t,u)->u);
	           //skip(x-1);//skip den sonra cıkan elemanları toList ile yazdirilmali
	}

}
