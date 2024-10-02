package Greenset;

public class Gäster {
    private String name;
    private double height;
    private int room;


    public Gäster(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public Gäster(String name, int room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    //metodo de bienvenida! Polymorfism.
    public void welcome(){
        System.out.println("Mr/Miss "+getName()+"\n"+"Welcome to Hotellet Greenset.");
    }
    public void roomNr(){
        System.out.println("Mr/Miss "+getName()+" your hotel room is "+ getRoom());
    }
}
