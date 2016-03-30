package wargame;

import java.util.Random;

public class Okcu extends Savasci implements Saldirgan {

	private int okSayisi, vurusGucu;
	public static final int MIN_OK_SAYISI = 20;
	public static final int MIN_CAN = 150;
	public static final int MAX_CAN = 250;
	public static final int MIN_VURUSGUCU = 10;
	public static final int MAX_VURUSGUCU = 30;
	public static final double SALDIRI_PUAN = 4.5;
	public static final double SAVUNMA_PUAN = 0.8;

	public Okcu(int okSayisi, int vurusGucu, int deneyim) {
		setOkSayisi(okSayisi);
		setVurusGucu(vurusGucu);
		this.deneyim = deneyim;
		can = randInt(MIN_CAN, MAX_CAN);
	}

	public int getOkSayisi() {
		return okSayisi;
	}

	public void setOkSayisi(int okSayisi) {
		if (okSayisi < MIN_OK_SAYISI) {
			throw new IllegalArgumentException("Ok sayısı 20 den fazla olmalıdır.");
		} else {
			this.okSayisi = okSayisi;
		}
	}

	public void setVurusGucu(int vurusGucu) {
		if (vurusGucu > MAX_VURUSGUCU && vurusGucu < MIN_VURUSGUCU) {
			System.out.println("Vurus gucu 10-30 aralığında olmalıdır.");
		} else {
			this.vurusGucu = vurusGucu;
		}
	}

	public boolean isAlive() {
		return (getOkSayisi() < 0);
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

	@Override
	public int saldiri() {
		deneyimArtir(SALDIRI_PUAN);

		return (int) (vurusGucu + getDeneyim());
	}

}
