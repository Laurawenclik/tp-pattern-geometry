package org.acme.geometry;


import java.util.ArrayList;
import java.util.List;

public class SampleFactory {
	public static Point createPoint1() {
		return new Point(new Coordinate(2,2));
	}

	public static Point createPoint2() {
		return new Point(new Coordinate(1,3));
	}

	public static LineString createLineString() {
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(createPoint1());
		listPoint.add(createPoint2());
		return new LineString(listPoint);
	}

	public static Envelope createEnveloppe() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(new Coordinate(2, 2));
		builder.insert(new Coordinate(1, 3));
		builder.insert(new Coordinate(2, 5));
		return builder.build();
	}
}