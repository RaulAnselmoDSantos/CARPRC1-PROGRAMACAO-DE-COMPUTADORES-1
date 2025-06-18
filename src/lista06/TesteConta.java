package lista06;

public class TesteConta {
    public static void main(String[] args) throws SaldoException {
        Conta conta = new Conta();
        conta.deposita(500.0);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // 1) Saque válido
        try {
            conta.saca(200.0);
            System.out.println("Após saque de R$ 200: saldo = R$ " + conta.getSaldo());
        } catch (SaldoException e) {
            System.err.println("Erro no saque: " + e.getMessage());
        }

        // 2) Saque que ultrapassa saldo
        try {
            conta.saca(400.0);
            System.out.println("Após saque de R$ 400: saldo = R$ " + conta.getSaldo());
        } catch (SaldoException e) {
            System.err.println("Erro no saque: " + e.getMessage());
        }

        // 3) Saque de valor inválido (negativo)
        try {
            conta.saca(-50.0);
        } catch (IllegalArgumentException | SaldoException e) {
            System.err.println("Erro no saque: " + e.getMessage());
        }
    }
}
