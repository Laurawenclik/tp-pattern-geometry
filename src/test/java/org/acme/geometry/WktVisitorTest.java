package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {
	@Test
	public void testVisitPoint() {
		WktVisitor visitor = new WktVisitor();
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		geometry.accept(visitor);
		
		Assert.assertEquals("POINT(3.0 4.0)", visitor.getResult());
	}

}
