package org.example;

public class Document implements Printable, Scannable, Savable {
    @Override
    public void print() {
        System.out.println("Document is printed");
    }

    @Override
    public void scan() {
        System.out.println("Document is scanned");
    }

    @Override
    public void save() {
        System.out.println("Document is saved");
    }
}
