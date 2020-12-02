package com.hz;

public class ChristmasCard extends PostCard{

    public ChristmasCard(Printer printer) {
        super(printer);

    }

    @Override
    void print(){
        this.printMessage();
        this.printHeader();
        this.printImage();
        this.printFooter();
    }

    @Override
    void printHeader() {

        this.printer.printLine("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
    }
    @Override
    void printMessage() {

        this.printer.printLine("Merry Christmas!");
    }

    @Override
    void printImage(){
//        this.printer.printLine("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        this.printer.printLine("WW         ___ __     ____      ___    ___   _   _          WW");
        this.printer.printLine("WW        |   V  \\   / _  )    / __|  / __| | | | |         WW");
        this.printer.printLine("WW        | /\\ /\\ | ( (/ /_   | /    | /    \\ \\_| |         WW");
        this.printer.printLine("WW        |_||_||_|  \\_____|  |_|    |_|     \\__  |         WW");
        this.printer.printLine("WW                                              | |         WW");
        this.printer.printLine("WW                                             _/ /         WW");
        this.printer.printLine("WW                                            |__/          WW");
        this.printer.printLine("WW        _                                                 WW");
        this.printer.printLine("WW       | |                                                WW");
        this.printer.printLine("WW       | |                                                WW");
        this.printer.printLine("WW  ___  | |__    ___  _   ___  | |_  ___  _    ____   ___  WW");
        this.printer.printLine("WW /  _| |  _ \\  / __|| | / __| |  _||   V  \\  / _  |/ __|  WW");
        this.printer.printLine("WW(  (_  | | \\ || /   | | \\__ \\ | |  | /\\ /\\ |( (_| | \\__ \\ WW");
        this.printer.printLine("WW \\___| |_| |_||_|   |_| |___/ |_|  |_||_||_| \\____||___/  WW");
        this.printer.printLine("WW                                                          WW");
//        this.printer.printLine("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

    }
    @Override
    void printFooter() {

        this.printer.printLine("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
    }
}
