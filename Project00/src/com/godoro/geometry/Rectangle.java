package com.godoro.geometry;

public class Rectangle {

	private int width; //field
	private int height;
	
	public Rectangle(int width,int height){ //constructor
		this.width=width;
		this.height=height;
	}
	public Rectangle(){
		this(1,1);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width<0) this.width = -width;
		else this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height<0) 
			throw new IllegalArgumentException("Height must be positive!: "+height);
		this.height = height;
	}

	public int getArea() {  //method
		return width*height;
	}

	public int getPerimeter() {
		return 2*(width+height);
	}
	

}
