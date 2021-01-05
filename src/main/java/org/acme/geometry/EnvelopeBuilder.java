package org.acme.geometry;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EnvelopeBuilder implements GeometryVisitor{
	
	private List<Coordinate> coordinates;

	public EnvelopeBuilder() {
		this.coordinates = new ArrayList<Coordinate>();
	}

	public void insert(Coordinate coordinate) {
		this.coordinates.add(coordinate);
	}

	public Envelope build() {
		List<Double> envelope = Arrays.asList(new Double[4]);
		envelope.set(0, this.coordinates.get(0).getX());
		envelope.set(1, this.coordinates.get(0).getY());
		envelope.set(2, this.coordinates.get(0).getX());
		envelope.set(3, this.coordinates.get(0).getY());
		for(Iterator<Coordinate> i = this.coordinates.iterator(); i.hasNext();) {
			Coordinate c = (Coordinate) i.next();
			envelope.set(0, Math.min(envelope.get(0), c.getX()));
			envelope.set(1, Math.min(envelope.get(1), c.getY()));
			envelope.set(2, Math.max(envelope.get(2), c.getX()));
			envelope.set(3, Math.max(envelope.get(3), c.getY()));
		}

		return new Envelope(new Coordinate(envelope.get(0), envelope.get(1)), new Coordinate(envelope.get(2), envelope.get(3)));
	}

	public List<Coordinate> getCoordinates() {
		return coordinates;
	}
	
	@Override
	public void visit(LineString l) {
		for(Iterator<Point> iterator = l.getPoints().iterator(); iterator.hasNext();) {
			Point p = (Point) iterator.next();
			this.insert(p.getCoordinate());
		}
				
	}
	@Override
	public void visit(Point p) {
		this.insert(p.getCoordinate());

				
	}
}