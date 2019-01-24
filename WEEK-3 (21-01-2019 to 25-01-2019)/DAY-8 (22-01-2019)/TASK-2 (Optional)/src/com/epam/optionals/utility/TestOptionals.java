package com.epam.optionals.utility;

import java.util.Optional;
import java.util.function.Supplier;

import com.epam.optionals.exceptions.CustomException;

/**
 * The Class TestOptionals.
 *
 * @author Somesh_Thakur
 */
public class TestOptionals {

	/**
	 * Test or else.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String testOrElse(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.orElse("No Name");
	}

	/**
	 * Test or else get.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String testOrElseGet(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		Supplier<String> supplier = () -> {
			return new String("No Name Object");
		};
		return optional.orElseGet(supplier);
	}

	/**
	 * Test or else throw.
	 *
	 * @param name the name
	 * @return the string
	 * @throws CustomException the custom exception
	 */
	public String testOrElseThrow(String name) throws CustomException {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.orElseThrow(() -> new CustomException());
	}

	/**
	 * Test filter.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String testFilter(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.filter(s -> s.contains("a")).get();
	}

	/**
	 * Test map.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String testMap(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.map(s -> s.toUpperCase()).get();
	}
}
