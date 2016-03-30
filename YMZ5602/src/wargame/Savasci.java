package wargame;

import java.util.Random;

public abstract class Savasci implements Saldirgan{

public int can;
public double deneyim;

public void savunma(){
	
}

public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}

abstract public void deneyimArtir();
	

}
