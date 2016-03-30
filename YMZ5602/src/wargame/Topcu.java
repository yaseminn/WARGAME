package wargame;

public class Topcu extends Savasci {
	public static final int MIN_CAN = 300;
	public static final int MAX_CAN = 400;
	public static final int MIN_VURUSGUCU = 60;
	public static final int MAX_VURUSGUCU = 80;
	public static final double SALDIRI_PUAN = 3.2;
	public static final double SAVUNMA_PUAN = 0.9;

	private int vurusGucu;
	private boolean topHazir;

	public Topcu(int vurusGucu, int deneyim) {
		topuYukle();
		setVurusGucu(vurusGucu);
		this.deneyim = deneyim;
		can = randInt(MIN_CAN, MAX_CAN);
	}

	public void setVurusGucu(int vurusGucu) {
		if (vurusGucu > MAX_VURUSGUCU && vurusGucu < MIN_VURUSGUCU) {
			System.out.println("Ok sayısı 60-80 arasında olmalıdır.");
		} else {
			this.vurusGucu = vurusGucu;
		}
	}

	public double getDeneyim() {
		return deneyim;
	}

	public void setDeneyim(double deneyim) {
		this.deneyim = deneyim;
	}

	public void topuYukle() {
		this.topHazir = true;
	}

	@Override
	public void deneyimArtir(double puan) {
		setDeneyim(getDeneyim() + puan);
	}

	@Override
	public int saldiri() {
		deneyimArtir(SALDIRI_PUAN);

		return (int) (vurusGucu + getDeneyim());
	}
}
