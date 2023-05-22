package cola;

import java.util.ArrayList;

public class Boleteria {

    private int precioGraderia;
    private int precioPlatea;
    private int precioVIP;
    private ArrayList<Boleto> boletos;

    public Boleteria(int precioGraderia, int precioPlatea, int precioVIP) {
        this.precioGraderia = precioGraderia;
        this.precioPlatea = precioPlatea;
        this.precioVIP = precioVIP;
        this.boletos = new ArrayList<>();
    }

    public Boleteria() {
    }

    public int getPrecioGraderia() {
        return precioGraderia;
    }

    public int getPrecioPlatea() {
        return precioPlatea;
    }

    public int getPrecioVIP() {
        return precioVIP;
    }

    public ArrayList<Boleto> getBoletos() {
        return boletos;
    }

    public void setPrecioGraderia(int precioGraderia) {
        this.precioGraderia = precioGraderia;
    }

    public void setPrecioPlatea(int precioPlatea) {
        this.precioPlatea = precioPlatea;
    }

    public void setPrecioVIP(int precioVIP) {
        this.precioVIP = precioVIP;
    }

    public void setBoletos(ArrayList<Boleto> boletos) {
        this.boletos = boletos;
    }

}
