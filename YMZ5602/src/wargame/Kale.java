package wargame;

public class Kale extends Savasci {

	public Kale(int deneyim){
		this.deneyim = deneyim;
		can = randInt(1000,2000);
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
