package org.acme.geometry;


import org.junit.Assert;
import org.junit.Test;

public class EnvelopeBuilderTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testInsert() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(new Coordinate(12, 3));

		Assert.assertEquals(1, builder.getCoordinates().size(), EPSILON);
	}

	@Test
	public void testBuild() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(new Coordinate(5, 2));
		builder.insert(new Coordinate(4, 3));
		builder.insert(new Coordinate(2, 3));
		Envelope enveloppe = builder.build();

		Assert.assertEquals(2, enveloppe.getBottomLeft().getX(),EPSILON);
		Assert.assertEquals(2, enveloppe.getBottomLeft().getY(),EPSILON);
		Assert.assertEquals(5, enveloppe.getTopRight().getX(),EPSILON);
		Assert.assertEquals(3, enveloppe.getTopRight().getY(),EPSILON);
	}
}