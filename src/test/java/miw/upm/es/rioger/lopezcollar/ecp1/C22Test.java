package miw.upm.es.rioger.lopezcollar.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class C22Test {

	private C22 c22;

	@Before
	public void before() {
		c22 = new C22();
	}

	@Test
	public void testMA() {
		assertEquals("mA", c22.mA());
	}

}