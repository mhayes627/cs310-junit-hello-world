package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder reverseString = new StringBuilder(message);
        int length = message.length()-1;
        int count = 0;

        for (int i = 0; i < message.length(); i++){
            char ch = message.charAt(count);
            reverseString.setCharAt(length--, ch);

            count++;
        }

        String str = "" + reverseString;
        
        return str;
    }
    
}