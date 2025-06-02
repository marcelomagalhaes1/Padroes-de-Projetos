public class Pagamento {
    public static double calcularTotal(double valor, String forma, int parcelas) {
        return switch (forma.toLowerCase()) {
            case "pix" -> valor * 0.9;
            case "boleto" -> valor * 0.95;
            case "crédito" -> {
                if (parcelas <= 1) yield valor;
                double total = valor;
                for (int i = 2; i <= parcelas; i++) {
                    total *= 1.0399;
                }
                yield total;
            }
            default -> valor;
        };
    }
}