package Assingment2;

 class Piano extends Instrument {
	 
	 Piano(String instrument) {
		 super(instrument);
		 this.instrument = instrument;
	 }
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing  tan tan tan tan");
	}

}

class Guitar extends Instrument{
	 Guitar(String instrument) {
		 super(instrument);
		 this.instrument = instrument;
	 }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing  tin  tin  tin ");
	}
}


class Flute extends Instrument{
	Flute(String instrument) {
		 super(instrument);
		 this.instrument = instrument;
	 }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
