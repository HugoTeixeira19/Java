package aplication;

public class Environment {
	private char[] rooms = new char[2];
	private int[] status = new int[2];
	
	public Environment() {
		// booting rooms
		this.rooms[0] = 'A';
		this.rooms[1] = 'B';
				
		// initializing status of the rooms
		this.status[0] = 1;
		this.status[1] = 1;
	}
	
	public char[] getRooms() {
		return rooms;
	}
	public int[] getStatus() {
		return status;
	}
	public void setStatus(int valor, int currentRoom) {
		this.status[currentRoom] = valor;
	}
	
}
