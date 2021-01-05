package org.acme.geometry;

public class Point extends AbstactGeometry{
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
		return "Point";
	}
	@Override
	public Boolean isEmpty() {
		if(coordinate.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	@Override
	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(this.coordinate.getX() + dx, this.coordinate.getY() + dy);
	}
	
	@Override
	public Geometry clone() {
		return new Point(this.coordinate);
	}
	
	@Override
	public Envelope getEnvelope() {
		EnvelopeBuilder build = new EnvelopeBuilder();

		build.insert(this.coordinate);
		
		return build.build();
	}
	
	@Override 
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}
	

}
