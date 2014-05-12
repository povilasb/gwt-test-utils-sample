package com.example.gwtTestUtils.client;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.GwtModule;

import com.example.test.MyGwtRunner;


@GwtModule("com.example.gwtTestUtils.Main")
//@RunWith(MyGwtRunner.class)
public class PersonTest extends GwtTest {

	@Test
	public void simpleTest() {
		Person p = new Person("Povilas", 21);
		assertEquals("Povilas", p.getName());
		assertEquals(21, p.getAge());
	}

}
