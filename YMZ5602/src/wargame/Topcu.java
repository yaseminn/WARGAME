package wargame;

public class Topcu extends Savasci {
	public static final int MIN_CAN = 300;
	public static final int MAX_CAN= 400;
	public static final int MIN_VURUSGUCU = 60;
	public static final int MAX_VURUSGUCU = 80;
	
	private int vurusGucu;
	private boolean topHazir;

	public Topcu(int vurusGucu,int deneyim){
		topuYukle();
		setVurusGucu(vurusGucu);
		this.deneyim = deneyim;
		can = randInt(MIN_CAN, MAX_CAN);
	}
	
	public void setVurusGucu(int vurusGucu) {
		if (vurusGucu >  MAX_VURUSGUCU  && vurusGucu < MIN_VURUSGUCU ) {
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
