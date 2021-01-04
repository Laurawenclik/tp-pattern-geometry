package org.acme.geometry;

public class Point implements Geometry{
	private Coordinate coordinate;

	public Point(Coordinate coordinate) {
		super();
		this.coordinate = coordinate;
	}

	public Point() {
		super();
		this.coordinate = new Coordinate();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	} 
	
	@Override
	public String getType() {
		return "point";
	}
	

}
