package org.acme.geometry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LineString implements Geometry {
	private List<Point> points;

	public LineString(List<Point> points) {
		super();
		this.points = points;
	}

	public LineString() {
		super();
		this.points = new ArrayList<Point>();
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
		return "LineString";
	}
	
	@Override
	public Boolean isEmpty() {
		for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
			Point point = (Point) iterator.next();
			if(point.isEmpty()) {
				return true;
			}
		}
		return false;
	}
	

}
