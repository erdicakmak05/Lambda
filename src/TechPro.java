
public class TechPro {
	
	private String batch;
	private String batchName;
	private int batchOrtalama;
	private int ogrcSayisi;
	

	public TechPro(String batch, String batchName, int batchOrtalama, int ogrcSayisi) {
		super();
		this.batch = batch;
		this.batchName = batchName;
		this.batchOrtalama = batchOrtalama;
		this.ogrcSayisi = ogrcSayisi;
	}
	
	
	
	@Override
	public String toString() {
		return "TechPro [batch=" + batch + ", batchName=" + batchName + ", batchOrtalama=" + batchOrtalama
				+ ", ogrcSayisi=" + ogrcSayisi + "]";
	}



	public TechPro() {
		
	}
	
	public String getBatch() {
		return batch;
	}
	public String getBatchName() {
		return batchName;
	}
	public int getBatchOrtalama() {
		return batchOrtalama;
	}
	public int getOgrcSayisi() {
		return ogrcSayisi;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public void setBatchOrtalama(int batchOrtalama) {
		this.batchOrtalama = batchOrtalama;
	}
	public void setOgrcSayisi(int ogrcSayisi) {
		this.ogrcSayisi = ogrcSayisi;
	}
	
	

}
