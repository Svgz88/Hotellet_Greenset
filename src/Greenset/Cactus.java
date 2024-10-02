package Greenset;

public class Cactus extends Växter{
    private double dailyLiquid;


    public Cactus(String name,double height, TiposDeAgua liquid){
        super(name,height,liquid);
    }

    public double getDailyLiquid() {
        return dailyLiquid;
    }

    public void setDailyLiquid(double dailyLiquid) {
        this.dailyLiquid = dailyLiquid;
    }

    @Override
    public void CalcularVätska() {
        setDailyLiquid(0.2);
        System.out.println(getName()+" behöver "+getDailyLiquid()+" liter "+getTiposDeAgua().getTipodeagua()+" per dag.");
        //System.out.println("\n"+"Skriv stop för att avsluta programmet.");
    }
}
