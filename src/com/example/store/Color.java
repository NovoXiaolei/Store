package com.example.store;

public class Color{
	private int mColor;
	
	public Color(String pColor){
		super();
		mColor = android.graphics.Color.parseColor(pColor);
	}
	
	public String toString(){
		return String.format("#%06X", mColor);
	}
}