package com.hz;

public class GraduationCard extends PostCard {


    public GraduationCard(Printer printer) {
        super(printer);

    }

    @Override
    void print(){
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    @Override
    void printHeader() {

        this.printer.printLine("--@--#--&----------------------&--#--@--");
    }
    @Override
    void printMessage() {

        this.printer.printLine("This calls for celebrating! Congratulations!");
    }

    @Override
    void printImage(){
            this.printer.printLine("     ,_");
            this.printer.printLine("| `\"\"---..._____");
            this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
            this.printer.printLine("       \\   ```` ``\"---...__  |");
            this.printer.printLine("       |`              |   ``!");
            this.printer.printLine("       |               |     A");
            this.printer.printLine("       |               /\\   /#\\");
            this.printer.printLine("       /`--..______..-'  |  ###");
            this.printer.printLine("      |   /  `\\    /`--. |  ###");
            this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
            this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
            this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
            this.printer.printLine("   \\_,                 /_/");
            this.printer.printLine("       `\\              /");
            this.printer.printLine("         '.  '.__.'  .'");
            this.printer.printLine(" jgs      `-,____,-'");
            this.printer.printLine("           /\"\"\"I\"\"\\");
            this.printer.printLine("           /`---'--'\\");
    }
    @Override
    void printFooter() {

        this.printer.printLine("--@--#--&----------------------&--#--@--");
    }
}
