package com.hz;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Console();

        // Different kind of cards
        PostCard greeting = new GreetingCard(printer);
        PostCard graduation = new GraduationCard(printer);
        PostCard christmas = new ChristmasCard(printer);

        // Call which card you want here
        christmas.print();



    }
}
