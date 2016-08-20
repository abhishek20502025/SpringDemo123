package org.abhishek;

public class traingle {
	int area;
	int perimeter;
	
	public traingle() {
		}

	@Override
	public String toString() {
		return "traingle [area=" + area + ", perimeter=" + perimeter + "]";
	}
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public void draw() {
		System.out.println(getArea()  + ""+   getPerimeter()   +"traingle drawn");
	}

}
