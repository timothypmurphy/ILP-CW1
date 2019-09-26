package uk.ac.ed.inf.powergrab;

public class Position {
	public double latitude;
	public double longitude;
	public final double r = 0.0003;
	
	public Position(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Position nextPosition(Direction direction) {
		return new Position(latitude + r*direction.latitude, longitude + r*direction.longitude);
	}
	
	public boolean inPlayArea() {
		if (latitude > 55.942617 && latitude < 55.946233 && longitude > -3.192473 && longitude < -3.184319) {
			return true;
		}
		return false;
	}
}
