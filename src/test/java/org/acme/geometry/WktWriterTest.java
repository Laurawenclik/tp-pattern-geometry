package org.acme.geometry;
import org.junit.Assert;
import org.junit.Test;
public class WktWriterTest {

	@Test
	public void testWrite() {
		Geometry g = new Point(new Coordinate(3.0,4.0));
		WktWriter w = new WktWriter();

		Assert.assertEquals("POINT(3.0 4.0)", w.write(g));
		
		
		LineString l = SampleFactory.createLineString();
		//Assert.assertEquals("LINESTRING(2 2,1 3)", w.write(l));

		}
}
