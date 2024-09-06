package obj;

public class PedidoCafe {
    private String cliente;
    private TipoCafe tipo;
    private Tamanho tamanho;

    public PedidoCafe(String cliente, TipoCafe tipo, Tamanho tamanho) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "PedidoCafe{" +
                "cliente='" + cliente + '\'' +
                ", tipo=" + tipo +
                ", tamanho=" + tamanho +
                '}';
    }

    public void calcularPreco(){
        double precoCafe = 0;
        if(this.tipo.equals(tipo.EXPRESSO)){
            precoCafe = 3;
        }

        if(this.tipo.equals(tipo.LATTE)){
            precoCafe = 4;
        }

        if(this.tipo.equals(tipo.CAPUCCINO)){
            precoCafe = 5;
        }

        if(this.tamanho.equals(tamanho.PEQUENO)){
            precoCafe += 0;
        }

        if(this.tamanho.equals(tamanho.MEDIO)){
            precoCafe += 2;
        }

        if(this.tamanho.equals(tamanho.GRANDE)){
            precoCafe += 4;
        }

        System.out.println(precoCafe);


    }













    //---------------------------------------------
    public TipoCafe getTipo() {
        return tipo;
    }

    public void setTipo(TipoCafe tipo) {
        this.tipo = tipo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
