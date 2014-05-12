package com.example.gwtTestUtils.client;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.GwtModule;


@GwtModule("com.example.gwtTestUtils.Main")
public class PersonTest extends GwtTest {

	@Test
	public void simpleTest() {
		Person p = new Person("Povilas", 21);
		assertEquals("Povilas", p.getName());
		assertEquals(21, p.getAge());
	}

}
