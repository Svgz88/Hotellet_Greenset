package Greenset;

public class PlantasCarnivoras extends Växter {
    private double dailyLiquid = 0.1+(getHeight()*0.2);

    public PlantasCarnivoras(String name, double height, TiposDeAgua tiposDeAgua) {
        super(name, height, tiposDeAgua);
    }

    public double getDailyLiquid() {
        return dailyLiquid;
    }

    public void setDailyLiquid(double dailyLiquid) {
        this.dailyLiquid = dailyLiquid;
    }

    @Override
    public void CalcularVätska() {
        System.out.println(getName()+" behöver "+getDailyLiquid()+" liter "+getTiposDeAgua().getTipodeagua()+" per dag.");
        //System.out.println("\n"+"Skriv stop för att avsluta programmet.");
    }
}
