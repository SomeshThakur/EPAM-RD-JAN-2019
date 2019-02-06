package com.epam.optionals.util;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.epam.optionals.exceptions.InvalidStringException;

/**
 * The Class Optionals.
 *
 * @author Somesh_Thakur
 */
public class Optionals {

	/**
	 * or else.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String orElse(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.orElse("No Name");
	}

	/**
	 * or else get.
	 *
	 * @param name the name
	 * @return the string
	 */
	public String orElseGet(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		Supplier<String> supplier = () -> {
			return new String("No Name Object");
		};
		return optional.orElseGet(supplier);
	}

	/**
	 * or else throw.
	 *
	 * @param name the name
	 * @return the string
	 * @throws InvalidStringException the custom exception
	 */
	public String orElseThrow(String name) throws InvalidStringException {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.orElseThrow(() -> new InvalidStringException("Empty String"));
	}

	/**
	 * filter.
	 *
	 * @param name the name
	 * @return the string
	 * @throws InvalidStringException 
	 */
	public String filter(Predicate<String> predicate, String name) throws InvalidStringException {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.filter(predicate).orElseThrow(()->new InvalidStringException("Nothing Found"));
	}

	/**
	 * map.
	 *
	 * @param name the name
	 * @return the string
	 * @throws InvalidStringException 
	 */
	public String map(String name) throws InvalidStringException {
		Optional<String> optional = Optional.ofNullable(name);
		return optional.map(s -> s.toUpperCase()).orElseThrow(()->new InvalidStringException("Empty String"));
	}
}
