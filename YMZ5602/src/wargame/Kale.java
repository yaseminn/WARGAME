package wargame;

public class Kale extends Savasci {
	public static final int MIN_CAN = 1000;
	public static final int MAX_CAN= 2000;
	
	public Kale(int deneyim){
		this.deneyim = deneyim;
		can = randInt( MIN_CAN, MAX_CAN);
	}
	
	public double getDeneyim() {
		return deneyim;
	}
	

	
	
	@Override
	public void deneyimArtir() {
		getDeneyim() + 1.2;
	}

	@Override
	public int saldiri() {
		
		return 0;
	}
}
