package com.epam.shapes.models;

import com.epam.shapes.abstracts.Shape;
import com.epam.shapes.interfaces.Rotatable;

/**
 * The Class Square.
 */
/**
 * @author Somesh_Thakur
 *
 */
public class Square extends Shape implements Rotatable {

	/*
	 * Draw the Square
	 */
	@Override
	public void draw() {
		System.out.println("Square Drawn to console!");
	}

	/*
	 * Rotate the Square
	 */
	@Override
	public void rotate(double degree) {
		System.out.println("Square rotated " + degree + " degrees");

	}
}
