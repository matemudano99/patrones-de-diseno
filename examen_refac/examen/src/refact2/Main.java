package refact2;

public class Main {
	public static void main(String[] args) {
		PedidoOnline pedido = new PedidoOnline("Carlos", -1);
		PedidoOnline pedido2 = new PedidoOnline("Jose", 150);
		System.out.println("Carlos:");
		pedido.procesarPedido();
		System.out.println("Jose:");
		pedido2.procesarPedido();
	}
}
