package wargame;
import java.util.Random;

public class Okcu extends Savasci implements Saldirgan {

private  int okSayisi,vurusGucu;
public static final int MIN_OK_SAYISI = 20;
public static final int MIN_CAN = 150;
public static final int MAX_CAN= 250;
public static final int MIN_VURUSGUCU = 10;
public static final int MAX_VURUSGUCU = 30;

public Okcu(int okSayisi, int vurusGucu,int deneyim){
	setOkSayisi(okSayisi);
	setVurusGucu(vurusGucu);
	this.deneyim = deneyim;
	can = randInt(MIN_CAN, MAX_CAN);
}

public int getOkSayisi(){
	return okSayisi;
}
	
public void setOkSayisi(int okSayisi){
	if(okSayisi < MIN_OK_SAYISI){
		throw new IllegalArgumentException("Ok sayısı 20 den fazla olmalıdır.");
	}else{
		this.okSayisi = okSayisi;
	}
}

public void setVurusGucu(int vurusGucu){
	if(vurusGucu > MAX_VURUSGUCU && vurusGucu < MIN_VURUSGUCU){
		System.out.println("Vurus gucu 10-30 aralığında olmalıdır.");
	}else{
		this.vurusGucu = vurusGucu;
	}
}

public boolean isAlive(){
	return (getOkSayisi() < 0) ; 
}

public double getDeneyim(){
	return deneyim;
}

public void savunma(){
	
} 

/*
 * savunma + 0.8
 * saldırı + 4.5
 */
@Override
public void deneyimArtir() {
	if(saldiri){
		getDeneyim() + 4.5;
	}else{
		getDeneyim() + 0.8;
	}
	
}

@Override
public int saldiri() {
	// TODO Auto-generated method stub
	return 0;
}


}
