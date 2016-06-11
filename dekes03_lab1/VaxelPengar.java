package dekes03_lab1;

import java.util.Scanner;

public class VaxelPengar {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Ange kostnaden: ");
		double kostnad = scan.nextDouble();

		System.out.println("Ange erhållet belopp: ");
		double belopp = scan.nextDouble();

		double oavrundSumma = belopp - kostnad;
		int avrundadSumma = (int) Math.round(oavrundSumma);
		System.out.println("Summa tillbaka:" + avrundadSumma);

		int talTusen = avrundadSumma / 1000;
		int tusenLapp = talTusen % 1000;
		int tillFemhundra = avrundadSumma - (talTusen * 1000);

		int talFemhundra = tillFemhundra / 500;
		int femHundraLapp = talFemhundra % 500;
		int tillHundra = tillFemhundra - (talFemhundra * 500);

		int talHundra = tillHundra / 100;
		int hundraLapp = talHundra % 100;
		int tillFemtio = tillHundra - (talHundra * 100);

		int talFemtio = tillFemtio / 50;
		int femtioLapp = talFemtio % 50;
		int tillTjugo = tillFemtio - (talFemtio * 50);

		int talTjugo = tillTjugo / 20;
		int tjugoLapp = talTjugo % 20;
		int tillTio = tillTjugo - (talTjugo * 20);

		int talTio = tillTio / 10;
		int tior = talTio % 10;
		int tillFem = tillTio - (talTio * 10);

		int talFem = tillFem / 5;
		int femmor = talFem % 5;
		int enKronor = tillFem - (talFem * 5);


		System.out.println("\n1000-lappar: " + tusenLapp + "\n500-lappar: " + femHundraLapp + "\n100-lappar: "
				+ hundraLapp + "\n50-lappar: " + femtioLapp + "\n20-lappar: " + tjugoLapp + "\n10-kronor: " + tior
				+ "\n5-kronor: " + femmor + "\n1-kronor: " + enKronor);
		
		scan.close();

	}

}

