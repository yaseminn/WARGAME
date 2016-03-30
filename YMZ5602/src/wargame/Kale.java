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
	public int saldiri() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deneyimArtir() {
		// TODO Auto-generated method stub
		
	}
}
