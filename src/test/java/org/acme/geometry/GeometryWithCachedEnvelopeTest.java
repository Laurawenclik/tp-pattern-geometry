package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;
public class GeometryWithCachedEnvelopeTest {
	
	@Test
	public void testgetEnvelope() {
		Geometry g = new Point(new Coordinate(3.0,3.0));
		g = new GeometryWithCachedEnvelope(g);
		Envelope a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
		Envelope b = g.getEnvelope() ; // renvoi de cachedEnvelope
		Assert.assertSame(a,b);
	}
	

}
