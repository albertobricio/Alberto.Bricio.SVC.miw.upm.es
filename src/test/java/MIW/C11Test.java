package MIW;

import static org.junit.Assert.*;

import org.junit.Test;

public class C11Test {

	C11 c = new C11();
	
	@Test
	public void testm1() {
		assertEquals("m1",c.m1());
	}
	
	@Test
	public void testm2() {
		assertEquals("m2",c.m2());
	}

}
