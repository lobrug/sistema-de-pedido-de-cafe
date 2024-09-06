import obj.PedidoCafe;
import obj.Tamanho;
import obj.TipoCafe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sistema {
    public static void main(String[] args) {
        PedidoCafe pedido1 = new PedidoCafe("Lorenzo", TipoCafe.EXPRESSO, Tamanho.MEDIO);
        PedidoCafe pedido2 = new PedidoCafe("Pedro", TipoCafe.LATTE, Tamanho.PEQUENO);

        System.out.println(pedido1);
        pedido1.calcularPreco();

        System.out.println(pedido2);
        pedido2.calcularPreco();
    }
}