package Greenset;

public class Växter extends Gäster implements CantidadDeAgua {
    private TiposDeAgua tiposDeAgua;

    public Växter(String name, double height, TiposDeAgua tiposDeAgua) {
        super(name,height);
        this.tiposDeAgua = tiposDeAgua;
    }

    public TiposDeAgua getTiposDeAgua() {
        return tiposDeAgua;
    }

    public void setTiposDeAgua(TiposDeAgua tiposDeAgua) {
        this.tiposDeAgua = tiposDeAgua;
    }
    @Override
    public void CalcularVätska() {
    }
}
