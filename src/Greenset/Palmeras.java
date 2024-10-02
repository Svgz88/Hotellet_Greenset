package Greenset;

public class Palmeras extends Växter{
    private double dailyLiquid = 0.5*getHeight();


    public Palmeras(String name, double height, TiposDeAgua liquid) {
        super(name, height, liquid);
    }

    public double getDailyLiquid() {
        return dailyLiquid;
    }

    public void setDailyLiquid(double dailyLiquid) {
        this.dailyLiquid = dailyLiquid;
    }

    @Override
    public void CalcularVätska(){
        System.out.println(getName()+" behöver "+getDailyLiquid()+" liter "+getTiposDeAgua().getTipodeagua()+" per dag.");
        //System.out.println("\n"+"Skriv stop för att avsluta programmet.");
    }

}
