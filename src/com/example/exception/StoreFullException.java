package com.example.exception;

public class StoreFullException extends RuntimeException{
	public StoreFullException(String pDetailMessage){
		super(pDetailMessage);
	}
}