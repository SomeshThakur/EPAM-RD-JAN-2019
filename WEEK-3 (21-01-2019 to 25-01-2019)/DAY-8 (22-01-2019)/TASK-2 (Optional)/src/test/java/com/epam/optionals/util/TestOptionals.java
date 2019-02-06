package com.epam.optionals.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.optionals.exceptions.InvalidStringException;

/**
 * The Class TestOptionals.
 *
 * @author Somesh_Thakur
 */
class TestOptionals {

	/** The optional util. */
	static Optionals optionalUtil;

	/** The name not null. */
	String nonEmptyString = "John";

	/** The name null. */
	String nullString = null;

	/**
	 * Inits.
	 */
	@BeforeAll
	public static void init() {
		optionalUtil = new Optionals();
	}

	/**
	 * Test or else of not null string.
	 */
	@Test
	@DisplayName("Test Optional or Else Of Not Null String")
	public void testOrElseOfNotNullString() {
		assertEquals(nonEmptyString, optionalUtil.orElse(nonEmptyString));
	}

	/**
	 * Test or else get of not null string.
	 */
	@Test
	@DisplayName("Test Optional or Else Get Of Not Null String")
	public void testOrElseGetOfNotNullString() {
		assertEquals(nonEmptyString, optionalUtil.orElse(nonEmptyString));
	}

	/**
	 * Test or else throw of not null string.
	 *
	 * @throws InvalidStringException the invalid string exception
	 */
	@Test
	@DisplayName("Test Optional or Else Throw Of Not Null String")
	public void testOrElseThrowOfNotNullString() throws InvalidStringException {
		assertEquals(nonEmptyString, optionalUtil.orElseThrow(nonEmptyString));
	}

	/**
	 * Test filter of not null string.
	 *
	 * @throws InvalidStringException the invalid string exception
	 */
	@Test
	@DisplayName("Test Optional Filter Of Not Null String")
	public void testFilterOfNotNullString() throws InvalidStringException {
		assertEquals(nonEmptyString, optionalUtil.filter(s -> s.contains("o"), nonEmptyString));
	}

	/**
	 * Test map of not null string.
	 *
	 * @throws InvalidStringException the invalid string exception
	 */
	@Test
	@DisplayName("Test Optional Of Not Null String")
	public void testMapOfNotNullString() throws InvalidStringException {
		assertEquals(nonEmptyString.toUpperCase(), optionalUtil.map(nonEmptyString));
	}

	/**
	 * Test or else of null string.
	 */
	@Test
	@DisplayName("Test Optional or Else Of Null String")
	public void testOrElseOfNullString() {
		assertEquals("No Name", optionalUtil.orElse(nullString));
	}

	/**
	 * Test or else get of null string.
	 */
	@Test
	@DisplayName("Test Optional or Else Get Of Null String")
	public void testOrElseGetOfNullString() {
		assertEquals("No Name", optionalUtil.orElse(nullString));
	}

	/**
	 * Test or else throw of null string.
	 *
	 * @throws InvalidStringException the invalid string exception
	 */
	@Test
	@DisplayName("Test Optional or Else Throw Of Null String")
	public void testOrElseThrowOfNullString() throws InvalidStringException {
		assertThrows(InvalidStringException.class, () -> optionalUtil.orElseThrow(nullString));
	}

	/**
	 * Test filter of null string.
	 */
	@Test
	@DisplayName("Test Optional Filter Of Null String")
	public void testFilterOfNullString() {
		assertThrows(InvalidStringException.class, () -> optionalUtil.filter(s -> s.contains("a"), nullString));
	}

	/**
	 * Test map of null string.
	 */
	@Test
	@DisplayName("Test Optional Of Null String")
	public void testMapOfNullString() {
		assertThrows(InvalidStringException.class, () -> optionalUtil.map(nullString));
	}

}
