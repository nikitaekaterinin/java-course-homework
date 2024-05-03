package org.example.homework8.Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint;
        if (duplex) {
            pagesToPrint = (pages + 1) / 2;
        } else {
            pagesToPrint = pages;
        }
        return pagesToPrint + pagesPrinted;
    }

    public static void main(String[] args) {
        var pr = new Printer(23, false);
        System.out.println("The toner level in printer is:" + pr.addToner(20));
        System.out.println("The amount of printed pages is:" + pr.printPages(23));
    }
}