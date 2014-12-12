package com.example.store;

import android.R.integer;

import com.example.exception.InvalidTypeException;
import com.example.exception.NotExistingKeyException;

public class Store {
		public native int getInteger(String pKey)
							throws NotExistingKeyException, InvalidTypeException;
		public native void setInteger(String pKey, int pInt);
		public native String getString(String pKey)
							throws NotExistingKeyException, InvalidTypeException;
		public native void setString(String pKey, String pString);
		public native Color GetColor(String pKey)
							throws NotExistingKeyException, InvalidTypeException;
		public native void setColor(String pKey, Color pColor);
		
		public native int[] getIntegerArray(String pKey) throws NotExistingKeyException;
		public native void setIntegerArray(String pKey,int[] pIntArray);
		
		
		public native Color[] getColorArray(String pKey) throws NotExistingKeyException;
		public native void setColorArray(String pKey, Color[] pColorArr);
		
		
		static {
			System.loadLibrary("store");
			}
}
