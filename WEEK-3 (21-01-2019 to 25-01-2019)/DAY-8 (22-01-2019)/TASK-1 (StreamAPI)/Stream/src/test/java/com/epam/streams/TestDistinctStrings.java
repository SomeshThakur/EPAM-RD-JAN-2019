package com.epam.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class TestDistinctStrings.
 *
 * @author Somesh_Thakur
 */
class TestDistinctStrings {

	/** The distinct string stream. */
	private static DistinctStringStream distinctStringStream;

	/**
	 * Inits the.
	 */
	@BeforeAll
	public static void init() {
		distinctStringStream = new DistinctStringStream();
	}

	/**
	 * Test distinct strings list.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	@DisplayName("Test Distinct String list")
	public void testDistinctStringsList() throws IOException {
		List<String> files = distinctStringStream.getDistinctStrings("studentNames");
		assertEquals(5, files.size());
	}
}
