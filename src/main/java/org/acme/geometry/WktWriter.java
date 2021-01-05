package org.acme.geometry;

import java.util.Iterator;

public class WktWriter {
	
	public WktWriter(){}
	
	public String write(Geometry geom) {
		if (geom instanceof Point) {
			Point p = (Point) geom;
			String ret = "POINT(" + p.getCoordinate().getX() + " " + p.getCoordinate().getY() + ")";
			return ret;
		}else if (geom instanceof LineString) {
			LineString l = (LineString) geom;
			String ret2 = "LINESTRING(";
			for(Iterator<Point> iterator = l.getPoints().iterator(); iterator.hasNext();) {
				Point p = (Point) iterator.next();
				ret2 += p.getCoordinate().getX() + " " + p.getCoordinate().getY()+"," ;
			}
			ret2 = ret2.substring(0, ret2.length()-1) + ")";
			return ret2;
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
		
	}
	

}
