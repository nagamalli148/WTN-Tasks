package com.wipro.classes_and_objects;

class Box{
	double height,width,depth;
	Box(double h,double w,double d){
		height = h;
		width = w;
		depth = d;
	}
	public double volume() {
		return height*width*depth;
	}
}

public class volume_of_the_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		System.out.println("volume of the box :" + b.volume());
		}
}
