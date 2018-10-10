package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
private int getal = 4;
    private final String message = "Hello World!";
	
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
     String fout = message + getal;


}

    private final String getMessage() {
        return message;
    }

}
