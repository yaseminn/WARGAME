package wargame;

public class Topcu extends Savasci {
	private int vurusGucu;
	private boolean topHazir;

	public Topcu(int vurusGucu,int deneyim){
		topuYukle();
		setVurusGucu(vurusGucu);
		this.deneyim = deneyim;
		can = randInt(300, 400);
	}
	
	public void setVurusGucu(int vurusGucu) {
		if (vurusGucu > 80 && vurusGucu < 60) {
			System.out.println("Ok sayısı 60-80 arasında olmalıdır.");
		} else {
			this.vurusGucu = vurusGucu;
		}
	}

	public double getDeneyim() {
		return deneyim;
	}

	public void topuYukle(){
		this.topHazir = true;
	}
	
	public void savunma(){
		
	}
	
	@Override
	public void deneyimArtir() {
		// TODO Auto-generated method stub

	}

	@Override
	public int saldiri() {
		// TODO Auto-generated method stub
		return 0;
	}
}
