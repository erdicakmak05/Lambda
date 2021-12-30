package proje;

public class Ogrenci {
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //listeyi yazdırırken içinde veri var mı diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.
	
	private String ad;
	private String soyad;
	private String cinsiyet;
	private int yas;
	private double diplomaNotu;
	
	
	
	
	
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", cinsiyet=" + cinsiyet + ", yas=" + yas + ", diplomaNotu="
				+ diplomaNotu + "]";
	}
	public Ogrenci(String ad, String soyad, String cinsiyet, int yas, double diplomaNotu) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.yas = yas;
		this.diplomaNotu = diplomaNotu;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public int getYas() {
		return yas;
	}
	public double getDiplomaNotu() {
		return diplomaNotu;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public void setDiplomaNotu(double diplomaNotu) {
		this.diplomaNotu = diplomaNotu;
	}
	
	
	
}
