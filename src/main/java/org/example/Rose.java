package org.example;

public class Rose extends Flower{
    public String color;
    int petals;
    private int height;

    void smell(){
        System.out.println("The rose has a sweet smell");
    }

    public void setHeight(int height){
        this.height=height;
    }

}
