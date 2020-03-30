package aplication;

public class Funcionamento {

	public static void main(String[] args) {
		int interations = 50;
		Aspirator asp1 = new Aspirator();
		Environment environment = new Environment();
		
		for(int i = 0; i < interations; i++) {
			raffleCleanRooms(environment);
			try {
				Thread.sleep(800);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Position: " + i + " status A: " + environment.getStatus()[0]);
			System.out.println("Position: " + i + " status B: " + environment.getStatus()[1]);
			asp1.aspirar(environment);
			asp1.changeRoom();
			asp1.aspirar(environment);
		}
		
		System.out.println("Clear: " + asp1.getClear());
	}
	
	public static void raffleCleanRooms(Environment environment) {
		int random = (int) (Math.random()*2);
		int random2 = (int) (Math.random()*2);
		
		environment.setStatus(random, 0);
		environment.setStatus(random2, 1);
	}

}
