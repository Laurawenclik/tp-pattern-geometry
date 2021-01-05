package org.acme.geometry;

public class Envelope {
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		super();
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}

	public Envelope() {
		this.bottomLeft =new Coordinate();
		this.topRight = new Coordinate();
	}
	
	
	public Boolean isEmpty() {
		if(this.bottomLeft.isEmpty() || this.topRight.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getXmin() {
		return Math.min(this.bottomLeft.getX(), this.topRight.getX());
	}

	public double getYmin() {
		return Math.min(this.bottomLeft.getY(), this.topRight.getY());
	}

	public double getXmax() {
		return Math.max(this.bottomLeft.getX(), this.topRight.getX());
	}

	public double getYmax() {
		return Math.max(this.bottomLeft.getY(), this.topRight.getY());
	}

	public Coordinate getBottomLeft() {
		return bottomLeft;
	}

	public Coordinate getTopRight() {
		return topRight;
	}
	
	
}
