package robot_homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotHomeworkTest {

	@Test
	public void testChangeOrientation() {
		Robot o = new Robot("Bill", 0, 0, 2, 1);
		assertTrue(o.getOrientation() == 1);
		o.changeOrientation(4);
		assertTrue(o.getOrientation() == 4);
	}
	@Test
	public void testChangePositionx() {
		Robot o = new Robot("Bill", 0, 0, 2, 1);
		assertTrue(o.getPositionx() == 0);
		o.changePositionx(6);
		assertTrue(o.getPositionx() == 6);
	}
	@Test
	public void testChangePositiony() {
		Robot o = new Robot("Bill", 0, 0, 2, 1);
		assertTrue(o.getPositiony() == 0);
		o.changePositiony(5);
		assertTrue(o.getPositiony() == 5);	
		}
}
