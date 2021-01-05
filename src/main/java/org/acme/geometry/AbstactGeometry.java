package org.acme.geometry;

public abstract class AbstactGeometry implements Geometry{
	public String asText() {
		WktVisitor visitor = new WktVisitor();
		accept(visitor);
		return visitor.getResult();
	
	}
	
	
	public Envelope getEnvelope() {
		EnvelopeBuilder b = new EnvelopeBuilder();
		accept(b);
		return b.build();
	}
	public abstract Geometry clone();
}
