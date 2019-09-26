package uk.ac.ed.inf.powergrab;

public class Direction {
//	public static final Direction N = new Direction();
//	public static final Direction S = new Direction();
//	public static final Direction E = new Direction();
//	public static final Direction W = new Direction();
//	public static final Direction NE = new Direction();
//	public static final Direction NW = new Direction();
//	public static final Direction SE = new Direction();
//	public static final Direction SW = new Direction();
//	public static final Direction NNE = new Direction();
//	public static final Direction ENE = new Direction();
//	public static final Direction ESE = new Direction();
//	public static final Direction SSE = new Direction();
//	public static final Direction SSW = new Direction();
//	public static final Direction WSW = new Direction();
//	public static final Direction WNW = new Direction();
//	public static final Direction NNW = new Direction();
	
//
	
	public double latitude;
	public double longitude;
	
	public Direction() {}
	
	public Direction(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
}
	
	public static final Direction N = new Direction (Math.cos(Math.toRadians(0)),Math.sin(Math.toRadians(0)));
	public static final Direction NNE = new Direction (Math.cos(Math.toRadians(22.5)),Math.sin(Math.toRadians(22.5)));
	public static final Direction NE = new Direction (Math.cos(Math.toRadians(45)),Math.sin(Math.toRadians(45)));
	public static final Direction ENE = new Direction (Math.cos(Math.toRadians(67.5)),Math.sin(Math.toRadians(67.5)));
	public static final Direction E = new Direction (Math.cos(Math.toRadians(90)),Math.sin(Math.toRadians(90)));
	public static final Direction ESE = new Direction (Math.cos(Math.toRadians(112.5)),Math.sin(Math.toRadians(112.5)));
	public static final Direction SE = new Direction (Math.cos(Math.toRadians(135)),Math.sin(Math.toRadians(135)));
	public static final Direction SSE = new Direction (Math.cos(Math.toRadians(157.5)),Math.sin(Math.toRadians(157.5)));
	public static final Direction S = new Direction (Math.cos(Math.toRadians(180)),Math.sin(Math.toRadians(180)));
	public static final Direction SSW = new Direction (Math.cos(Math.toRadians(202.5)),Math.sin(Math.toRadians(202.5)));
	public static final Direction SW = new Direction (Math.cos(Math.toRadians(225)),Math.sin(Math.toRadians(225)));
	public static final Direction WSW = new Direction (Math.cos(Math.toRadians(247.5)),Math.sin(Math.toRadians(247.5)));
	public static final Direction W = new Direction (Math.cos(Math.toRadians(270)),Math.sin(Math.toRadians(270)));
	public static final Direction WNW = new Direction (Math.cos(Math.toRadians(292.5)),Math.sin(Math.toRadians(292.5)));
	public static final Direction NW = new Direction (Math.cos(Math.toRadians(315)),Math.sin(Math.toRadians(315)));
	public static final Direction NNW = new Direction (Math.cos(Math.toRadians(337.5)),Math.sin(Math.toRadians(337.5)));









}
