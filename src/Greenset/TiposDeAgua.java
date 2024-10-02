package Greenset;

public enum TiposDeAgua {
    KRANVATTEN ("kranvatten"),MINERALVATTEN("mineralvatten"),PROTEINDRYCK("proteindryck");

    private final String tipodeagua;

    TiposDeAgua(String tipodeagua) {
        this.tipodeagua = tipodeagua;
    }

    public String getTipodeagua() {
        return tipodeagua;
    }
}
