package com.prashant.graphql.exception;

public class ExceptionHandler {

	public static RuntimeException throwResourceNotFoundException() {
		return new RuntimeException("User Not Found");
	}
}
