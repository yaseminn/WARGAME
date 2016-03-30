package wargame;

public class Kale extends Topcu {
	public static final int MIN_CAN = 1000;
	public static final int MAX_CAN= 2000;
	public static final double SAVUNMA_PUAN = 1.2;
	
	public Kale(int deneyim){
		super(0, deneyim);
		this.deneyim = deneyim;
		can = randInt( MIN_CAN, MAX_CAN);
	}
	
	public double getDeneyim() {
		return deneyim;
	}
	
	public void setDeneyim(double deneyim) {
		this.deneyim = deneyim;
	}
	
	@Override
	public void deneyimArtir(double puan) {
		setDeneyim(getDeneyim() + puan);
	}

}
