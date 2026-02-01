package org.example;

public class Main {
    public static void main(String[] args) {
        Codec code=new Codec();
        String shortUrl=code.encode("https://github.com/Rahmi1635/algorithmProblems");

        System.out.println(shortUrl);           // fake tinyurl
        System.out.println(code.decode(shortUrl)); // github link
    }
}