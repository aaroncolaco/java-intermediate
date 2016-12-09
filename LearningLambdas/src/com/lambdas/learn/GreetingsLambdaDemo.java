package com.lambdas.learn;

public class GreetingsLambdaDemo {

	public static void main(String[] args) {
		Greetings greetings;
		
		greetings = (String name) -> { System.out.println("Good morning, " + name); return null; };
		greetings.greet("Jane");
		
		// don't have to specify type here
		greetings = (name) -> { System.out.println("Good morning, " + name); return name; };
		greetings.greet("John");
		
		greetings = (message) -> {
			System.out.println(message);
			return message;
		};
		greetings.greet("Have a good day");
	}

}
