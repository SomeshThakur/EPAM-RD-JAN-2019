package com.epam.customannotation.annotations;

import java.lang.annotation.*;

/**
 * The Interface Details.
 *
 * @author Somesh_Thakur
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Details {

	/**
	 * Author.
	 *
	 * @return the string
	 */
	String Author();

	/**
	 * Author id.
	 *
	 * @return the string
	 */
	String AuthorId();

	/**
	 * Date of creation.
	 *
	 * @return the string
	 */
	String DateOfCreation();

	/**
	 * Version.
	 *
	 * @return the string
	 */
	String Version();
}