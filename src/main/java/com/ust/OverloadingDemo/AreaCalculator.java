package com.ust.OverloadingDemo;
import java.util.logging.Logger;

public class AreaCalculator {
	public static Logger Logger=Logger.getLogger(AreaCalculator.class.getName());
	//square
	int area(int side) {
		return side*side;
	}
	//rectangle
	double area(int length,int breadth) {
		//circle
		double area(double radius) {
           return 3.14* radius*radius;
			
		}
		//triangle
		double area(double base,double height) {
			return 0.5*base*height;
			
		}
		public static void main(String[args]) {
			AreaCalculator c=new AreaCalculator();
			Logger.info("Area of square"+c.area(5));
			Logger.info("Area of rectangle"+c.area(4,6));
			Logger.info("Area of circle"+c.area(1.5));
			Logger.info("Area of triangle:",+c.area(4.0,5.0));
		}
		
	}

}
