package wargame;
import java.util.Random;

public class Okcu extends Savasci implements Saldirgan {

private  int okSayisi,vurusGucu;

public Okcu(int okSayisi, int vurusGucu,int deneyim){
	setOkSayisi(okSayisi);
	setVurusGucu(vurusGucu);
	this.deneyim = deneyim;
	can = randInt(150, 250);
}

public int getOkSayisi(){
	return okSayisi;
}
	
public void setOkSayisi(int okSayisi){
	if(okSayisi < 20){
		System.out.println("Ok sayısı 20 den fazla olmalıdır");
	}else{
		this.okSayisi = okSayisi;
	}
}

public void setVurusGucu(int vurusGucu){
	if(vurusGucu > 30 && vurusGucu < 10){
		System.out.println("Vurus gucu 10-30 aralığında olmalıdır.");
	}else{
		this.vurusGucu = vurusGucu;
	}
}

public boolean isAlive(){
	return (getOkSayisi() < 0) ? false : true; 
}

public double getDeneyim(){
	return deneyim;
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
