package wargame;

import java.util.Random;

public abstract class Savasci implements Saldirgan{
public static final double SAVUNMA_PUAN = 0.0;
public int can;
public double deneyim;

public int savunma() {
	deneyimArtir(SAVUNMA_PUAN);
	return (int) (can / getDeneyim());
}

public double getDeneyim(){
	return deneyim;
}
public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}

abstract public void deneyimArtir(double puan);
	

}
