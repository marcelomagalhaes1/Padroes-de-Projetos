//Código Correto (Respeitando SRP)
public class PedidoCorreto {
    public void calcularTotal() {
        // Lógica para calcular o total do pedido
    }
}

class PedidoRepository {
    public void salvarPedido(PedidoCorreto pedido) {
        // Lógica para salvar o pedido no banco de dados
    }
}

class EmailService {
    public void enviarEmailConfirmacao(PedidoCorreto pedido) {
        // Lógica para enviar email de confirmação
    }
}
