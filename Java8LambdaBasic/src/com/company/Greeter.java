package com.company;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
	// write your code here
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }
}
