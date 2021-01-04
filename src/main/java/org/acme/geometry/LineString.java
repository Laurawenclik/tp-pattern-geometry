package org.acme.geometry;
import java.util.List;


public class LineString implements Geometry {
	private List<Point> points;

	public LineString(List<Point> points) {
		super();
		this.points = points;
	}

	public LineString() {
		super();
	}
	
	public int getNumPoint() {
		return this.points.size();
	}
	public Point getPointN(int n) {
		return this.points.get(n);
	}
	
	public List<Point> getPoints() {
		return points;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "LineString";
	}
	

}
