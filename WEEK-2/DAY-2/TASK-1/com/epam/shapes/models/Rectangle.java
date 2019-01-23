package com.epam.shapes.models;

import com.epam.shapes.abstracts.Shape;
import com.epam.shapes.interfaces.Rotatable;

/**
 * The Class Rectangle.
 *
 * @author Somesh_Thakur
 */
public class Rectangle extends Shape implements Rotatable {

	/*
	 * Draws the shape
	 */
	@Override
	public void draw() {
		System.out.println("Rectangle Drawn to console!");

	}

	/*
	 * Rotate the shape
	 * 
	 * @param degree for rotation
	 */
	@Override
	public void rotate(double degree) {
		System.out.println("Rectangle rotated " + degree + " degrees");

	}
}
