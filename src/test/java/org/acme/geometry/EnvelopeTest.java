package org.acme.geometry;


import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {
	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor() {
		Envelope e = new Envelope();

		Assert.assertEquals(Double.NaN, e.getBottomLeft().getX(),EPSILON);
		Assert.assertEquals(Double.NaN, e.getTopRight().getY(),EPSILON);
	}

	@Test
	public void testConstructor() {
		Envelope e = new Envelope(new Coordinate(1, 1), new Coordinate(2, 3));

		Assert.assertEquals(1, e.getBottomLeft().getX(), EPSILON);
		Assert.assertEquals(3, e.getTopRight().getY(), EPSILON);
	}

	@Test
	public void testIsEmpty() {
		Envelope e_empty = new Envelope();
		Envelope e = SampleFactory.createEnveloppe();

		Assert.assertTrue(e_empty.isEmpty());
		Assert.assertFalse(e.isEmpty());
	}
}