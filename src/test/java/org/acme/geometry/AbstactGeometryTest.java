package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class AbstactGeometryTest {
	
	@Test
	public void testAsText() {
		AbstactGeometry geometry = new Point(new Coordinate(3.0,4.0));
		
		Assert.assertEquals("POINT(3.0 4.0)", geometry.asText());
	}

}
