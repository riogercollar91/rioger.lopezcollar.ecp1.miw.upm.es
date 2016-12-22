package miw.upm.es.rioger.lopezcollar.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class C21Test {

	private C21 c21;

	@Before
	public void before() {
		c21 = new C21();
	}

	@Test
	public void testM1() {
		assertEquals("m1", c21.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c21.m2());
	}
	
	@Test
	public void testM3() {
		assertEquals("m3", c21.m3());
	}

}