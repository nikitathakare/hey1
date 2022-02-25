package Assingment2;

import java.util.Scanner;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Instrument [] obj = new Instrument[10];
		obj[0]= new Piano("Piano");
		obj[1]= new Piano("PianoMin");
		obj[2]= new Piano("PianoMax");
		obj[3]= new Guitar("Guitar");
		obj[4]= new Guitar("GuitarMin");
		obj[5]= new Guitar("GuitarMax");
		obj[6]= new Flute("Flute");
		obj[7]= new Flute("FluteMin");
		obj[8]= new Piano("FluteMax");
		obj[9]= new Piano("Piano1");
		
		obj[0].play();
		obj[3].play();
		obj[9].play();
		obj[7].play();
		
		
		
		for (int i =0;i<obj.length;i++) {
			if(obj[i] instanceof Piano) {
				System.out.println("this is instance of piano "+ i);
			}
			else if(obj[i] instanceof Guitar) {
				System.out.println("this is instance of Guitar "+ i);
			}
			else if (obj[i] instanceof Flute) {
			
					System.out.println("this is instance of Guitar "+ i);
				}
			
			
		}
	}

}
