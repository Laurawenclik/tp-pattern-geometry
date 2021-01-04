package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestLineString {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testConstructor() {
		Coordinate c = new Coordinate(1, 2);
		Point p1 = new Point();
		Point p2 = new Point(c);
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(p1);
		listPoint.add(p2);		
		LineString line = new LineString(listPoint);
		
		Assert.assertEquals(p1, line.getPoints().get(0));
		Assert.assertEquals(p2, line.getPoints().get(1));
	}
	
	@Test
	public void testGetNumPoints() {
		Coordinate c = new Coordinate(1, 2);
		Point p1 = new Point();
		Point p2 = new Point(c);
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(p1);
		listPoint.add(p2);		
		LineString line = new LineString(listPoint);
		
		Assert.assertEquals(2, line.getNumPoint(), EPSILON);
	}
	
	@Test
	public void testGetPointN() {
		Coordinate c = new Coordinate(1, 2);
		Point p1 = new Point();
		Point p2 = new Point(c);
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(p1);
		listPoint.add(p2);		
		LineString line = new LineString(listPoint);
		
		Assert.assertEquals(p2, line.getPointN(1));
	}
	
	@Test
	public void testType() {
		LineString line = new LineString();
		Assert.assertEquals("LineString", line.getType());
	}

	
	public void testIsEmpty() {
		Coordinate c = new Coordinate(1, 2);
		Point p1 = new Point();
		Point p2 = new Point(c);
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(p1);
		listPoint.add(p2);
		LineString line = new LineString(listPoint);
		
		List<Point> listPoint2 = new ArrayList<Point>();
		listPoint.add(p2);
		listPoint.add(p2);
		LineString line2 = new LineString(listPoint2);
		
		Assert.assertTrue(line.isEmpty());
		Assert.assertFalse(line2.isEmpty());
	}
	
	
	@Test
	public void testTranslate() {
		Coordinate c1 = new Coordinate(1, 2);
		Coordinate c2 = new Coordinate(3, 4);
		Point p1 = new Point(c1);
		Point p2 = new Point(c2);
		List<Point> listPoint = new ArrayList<Point>();
		listPoint.add(p1);
		listPoint.add(p2);
		LineString line = new LineString(listPoint);
		
		line.translate(1, 1);
		
		Assert.assertEquals(2, line.getPoints().get(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4, line.getPoints().get(1).getCoordinate().getX(), EPSILON);
	}
	
}