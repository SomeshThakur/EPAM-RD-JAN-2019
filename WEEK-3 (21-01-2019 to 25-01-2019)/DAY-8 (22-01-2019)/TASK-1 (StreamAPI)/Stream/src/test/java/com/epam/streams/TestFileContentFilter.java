package com.epam.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class TestFileContentFilter.
 *
 * @author Somesh_Thakur
 */
class TestFileContentFilter {

	/** The contents filter. */
	static FileContentsFilter contentsFilter;

	/**
	 * Inits the.
	 */
	@BeforeAll
	public static void init() {
		contentsFilter = new FileContentsFilter();
	}

	/**
	 * Test file filter.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	@DisplayName("Test File content filter")
	public void testFileFilter() throws IOException {
		List<String> filteredStrings = contentsFilter.printFilteredStrings("stringTestFile", "java");
		assertEquals(3, filteredStrings.size());
	}
}
