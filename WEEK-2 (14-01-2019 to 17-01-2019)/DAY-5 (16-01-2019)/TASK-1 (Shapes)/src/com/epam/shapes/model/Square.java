package com.epam.shapes.model;

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
