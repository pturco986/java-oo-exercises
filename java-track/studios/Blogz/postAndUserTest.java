package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class postAndUserTest {

	@Test
	public void test() {
		User u = new User("Frank", "Password");
		assertEquals("NotFrank", "Frank", u.getName());
		assertEquals("Incorrect password", "Password", u.getPassword());
	}

}
