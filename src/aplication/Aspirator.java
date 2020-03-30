package aplication;

public class Aspirator {
	private int currentRoom;
	private int clear;
	
	public Aspirator() {
		// Initializing room A
		currentRoom = 0;
		clear = 0;
	}
	public void setCurrentRoom(int currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public int getClear() {
		return clear;
	}
	
	public int getCurrentRoom() {
		return currentRoom;
	}
	
	public void aspirar(Environment environment) {
		if(environment.getStatus()[this.currentRoom] == 1) {
			environment.setStatus(0, this.currentRoom);
			clear++;
			System.out.println("Limpou: " + clear);
		}
	}
	
	public void changeRoom() {
		if(this.currentRoom == 0) {
			setCurrentRoom(1);
		} else {
			setCurrentRoom(0);
		}
	}
}
