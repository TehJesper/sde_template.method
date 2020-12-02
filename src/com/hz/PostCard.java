package com.hz;

abstract public class PostCard {

    public Printer printer;

    public PostCard(Printer printer) {
        this.printer = printer;
    }

    abstract void print();

    abstract void printHeader();

    abstract void printMessage();

    abstract void printImage();

    abstract void printFooter();


}

