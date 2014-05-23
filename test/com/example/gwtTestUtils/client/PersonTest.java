package com.example.gwtTestUtils.client;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;

import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.GwtModule;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONValue;


@GwtModule("com.example.gwtTestUtils.Main")
public class PersonTest extends GwtTest {

	@Test
	public void testCreate() {
		Person person = new Person("Povilas", 23);
		assertTrue(person.getName() == "Povilas");
		assertTrue(person.getAge() == 23);
	}

	@Test
	public void testToJson() {
		Person person = new Person("Povilas", 23);
		JSONObject jsonPerson = person.toJson();
		assertTrue(jsonPerson != null);

		JSONValue jsonValue = jsonPerson.get("name");
		assertTrue(jsonValue != null);
		JSONString jsonName = jsonValue.isString();
		assertTrue(jsonName != null);
		assertTrue(jsonName.stringValue() == "Povilas");

		jsonValue = jsonPerson.get("age");
		assertTrue(jsonValue != null);
		JSONNumber jsonAge = jsonValue.isNumber();
		assertTrue(jsonAge != null);
		assertTrue(jsonAge.doubleValue() == 23);
	}
}
