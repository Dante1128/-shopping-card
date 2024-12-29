import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra>listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.listaDeCompras = new ArrayList<>();
        this.saldo = limite;
    }

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -=compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
