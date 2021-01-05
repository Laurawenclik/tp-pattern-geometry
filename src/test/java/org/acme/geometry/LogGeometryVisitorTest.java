package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {
	
	@Test
	public void testVisitPoint() throws UnsupportedEncodingException {
		LogGeometryVisitor v = new LogGeometryVisitor();
		Geometry g = new Point(new Coordinate(3.0,4.0));
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(os);
		System.setOut(out);
		
		g.accept(v);


		
		Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0", os.toString());
	}
	@Test
	public void testVisit() throws UnsupportedEncodingException {
		LogGeometryVisitor v = new LogGeometryVisitor();
		LineString l = SampleFactory.createLineString();
		Geometry g = (Geometry) l;
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(os);
		System.setOut(out);
		
		g.accept(v);

		Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", os.toString());
	}

}
