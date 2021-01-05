package org.acme.geometry;

public class WktVisitor implements GeometryVisitor{
	public WktVisitor() {
		
	}
	private StringBuilder buffer; 
	
	public String getResult() {
		return this.buffer.toString();
	}
	
	@Override
	public void visit(Point point) {
		WktWriter w = new WktWriter();
		this.buffer = new StringBuilder(w.write(point));

	}

	@Override
	public void visit(LineString lineString) {
		WktWriter w = new WktWriter();
		this.buffer = new StringBuilder(w.write(lineString));		
	}
	
	

}
