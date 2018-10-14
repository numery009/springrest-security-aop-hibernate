package com.springdemo.rest;

public class CustomerNoFoundException extends RuntimeException {

	public CustomerNoFoundException() {

	}

	public CustomerNoFoundException(String message) {
		super(message);

	}

	public CustomerNoFoundException(Throwable cause) {
		super(cause);

	}

	public CustomerNoFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public CustomerNoFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
