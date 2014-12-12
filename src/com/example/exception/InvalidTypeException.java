package com.example.exception;

public class InvalidTypeException extends Exception{
	public InvalidTypeException(String pDetailMessage){
		super(pDetailMessage);
	}
}