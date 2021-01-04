package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor() {
		Point p = new Point();
		Assert.assertEquals(Double.NaN,  p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN,  p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testConstructor() {
		Coordinate c = new Coordinate(5, 1);
		Point p = new Point(c);
		Assert.assertEquals(5, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(1, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testType() {
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	@Test
	public void testIsEmpty() {
		Coordinate c = new Coordinate(2, 1);
		Point p_empty = new Point();
		Point p = new Point(c);
		Assert.assertTrue(p_empty.isEmpty());
		Assert.assertFalse(p.isEmpty());
	}
}