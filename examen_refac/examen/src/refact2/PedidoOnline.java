package refact2;

public class PedidoOnline {
	private String cliente;
	private double total;
	private boolean pagoRealizado;
	private Pago pago;

	public PedidoOnline(String cliente, double total) {
		this.cliente = cliente;
		this.total = total;
		this.pagoRealizado = false;
		this.pago = new Pago();
	}

	private boolean validarPedido() {
		if (total <= 0) {
			System.out.println("Error: El total debe ser mayor a 0.");
			return false;
		}
		return true;
	}

	private void confirmarPedido() {
		System.out.println("Pedido confirmado.");
	}
	
	public void procesarPedido() {
		if (!validarPedido()) {
			return;
		}
		
		System.out.println("Procesando pedido de " + cliente + " por $" + total);
		
		if (pago.realizarPago(total)) {
			pagoRealizado = true;
			confirmarPedido();
		} else {
			System.out.println("Pago fallido.");
		}
	}
}