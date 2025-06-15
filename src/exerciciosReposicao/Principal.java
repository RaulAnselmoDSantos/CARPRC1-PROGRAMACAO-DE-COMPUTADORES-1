package exerciciosReposicao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Principal - Exemplos de uso
 * 
 * Esta classe demonstra o uso de todas as funcionalidades implementadas nos exercícios,
 * servindo como um guia prático e didático para entender os conceitos de classes abstratas,
 * interfaces, polimorfismo, exceções e outras características da orientação a objetos em Java.
 */
public class Principal {
    
    public static void main(String[] args) {
        System.out.println("===== EXEMPLOS DE CLASSES ABSTRATAS E INTERFACES EM JAVA =====\n");
        
        try {
            // Bloco 1 - Fundamentos com Herança e Classe Abstrata
            exemploBloco1();
            
            // Bloco 2 - Interfaces, Polimorfismo e Testes
            exemploBloco2();
            
            // Bloco 3 - Desafios Avançados e Refatoração
            exemploBloco3();
            
            // Bloco 4 - Extensões, Validações e Boas Práticas
            exemploBloco4();
            
        } catch (Exception e) {
            System.out.println("Erro na execução dos exemplos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Exemplos do Bloco 1 - Fundamentos com Herança e Classe Abstrata
     */
    private static void exemploBloco1() {
        System.out.println("\n===== BLOCO 1: FUNDAMENTOS COM HERANÇA E CLASSE ABSTRATA =====\n");
        
        try {
            // Criando instâncias das subclasses de ContaBancaria
            ContaCorrente contaCorrente = new ContaCorrente("12345", "001", 1000.0);
            ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "001", 2000.0);
            ContaUniversitaria contaUniversitaria = new ContaUniversitaria("54321", "001", 500.0);
            
            // Testando método depositar
            System.out.println("--- Testando método depositar ---");
            contaCorrente.depositar(500.0);
            contaPoupanca.depositar(300.0);
            
            // Testando limite da ContaUniversitaria
            System.out.println("\n--- Testando limite da ContaUniversitaria ---");
            contaUniversitaria.depositar(4000.0); // Dentro do limite
            contaUniversitaria.depositar(1000.0); // Deve falhar (ultrapassaria o limite)
            
            // Testando método aplicarTarifa
            System.out.println("\n--- Testando método aplicarTarifa ---");
            System.out.println("Conta Corrente:");
            contaCorrente.aplicarTarifa();
            
            System.out.println("\nConta Poupança:");
            contaPoupanca.aplicarTarifa();
            
            System.out.println("\nConta Universitária:");
            contaUniversitaria.aplicarTarifa();
            
        } catch (Exception e) {
            System.out.println("Erro no Bloco 1: " + e.getMessage());
        }
    }
    
    /**
     * Exemplos do Bloco 2 - Interfaces, Polimorfismo e Testes
     */
    private static void exemploBloco2() {
        System.out.println("\n===== BLOCO 2: INTERFACES, POLIMORFISMO E TESTES =====\n");
        
        try {
            // Criando instâncias das contas
            ContaCorrente contaCorrente = new ContaCorrente("12345", "001", 1000.0);
            ContaUniversitaria contaUniversitaria = new ContaUniversitaria("54321", "001", 500.0);
            ContaEmpresarial contaEmpresarial = new ContaEmpresarial("98765", "001", 5000.0);
            ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "001", 2000.0);
            
            // Testando interface Transferencia
            System.out.println("--- Testando interface Transferencia ---");
            System.out.println("Transferência de Conta Corrente para Conta Poupança:");
            contaCorrente.transferir(contaPoupanca, 200.0);
            
            System.out.println("\nTransferência de Conta Universitária para Conta Empresarial:");
            contaUniversitaria.transferir(contaEmpresarial, 100.0);
            
            // Testando interface Pagamento
            System.out.println("\n--- Testando interface Pagamento ---");
            System.out.println("Pagamento de boleto com Conta Corrente:");
            contaCorrente.pagarBoleto("12345678", 150.0);
            
            System.out.println("\nPagamento de boleto com Conta Empresarial:");
            contaEmpresarial.pagarBoleto("87654321", 300.0);
            
            // Testando saque mínimo da ContaEmpresarial
            System.out.println("\n--- Testando saque mínimo da ContaEmpresarial ---");
            contaEmpresarial.sacar(50.0);  // Deve falhar (abaixo do mínimo)
            contaEmpresarial.sacar(200.0); // Deve funcionar
            
            // Testando RelatorioDeContas
            System.out.println("\n--- Testando RelatorioDeContas ---");
            List<ContaBancaria> contas = new ArrayList<>();
            contas.add(contaCorrente);
            contas.add(contaPoupanca);
            contas.add(contaUniversitaria);
            contas.add(contaEmpresarial);
            
            RelatorioDeContas relatorio = new RelatorioDeContas();
            relatorio.gerarRelatorio(contas);
            
        } catch (Exception e) {
            System.out.println("Erro no Bloco 2: " + e.getMessage());
        }
    }
    
    /**
     * Exemplos do Bloco 3 - Desafios Avançados e Refatoração
     */
    private static void exemploBloco3() {
        System.out.println("\n===== BLOCO 3: DESAFIOS AVANÇADOS E REFATORAÇÃO =====\n");
        
        try {
            // Criando instâncias das contas
            ContaCorrente contaCorrente = new ContaCorrente("12345", "001", 1000.0);
            ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "001", 2000.0);
            
            // Testando classe utilitária Banco
            System.out.println("--- Testando classe utilitária Banco ---");
            System.out.println("Transferência via Banco:");
            Banco.realizarTransferencia(contaCorrente, contaPoupanca, 300.0);
            
            System.out.println("\nPagamento via Banco:");
            Banco.realizarPagamento(contaCorrente, "123456789", 100.0);
            
            // Demonstrando o uso de getters e setters
            System.out.println("\n--- Demonstrando encapsulamento com getters e setters ---");
            System.out.println("Saldo atual da Conta Corrente: R$ " + contaCorrente.getSaldo());
            
            // Demonstrando o método temSaldoSuficiente
            System.out.println("\n--- Demonstrando método temSaldoSuficiente ---");
            double valorTeste = 800.0;
            System.out.println("Verificando se há saldo suficiente para R$ " + valorTeste + ": " + 
                              (contaCorrente.temSaldoSuficiente(valorTeste) ? "Sim" : "Não"));
            
            valorTeste = 2000.0;
            System.out.println("Verificando se há saldo suficiente para R$ " + valorTeste + ": " + 
                              (contaCorrente.temSaldoSuficiente(valorTeste) ? "Sim" : "Não"));
            
        } catch (Exception e) {
            System.out.println("Erro no Bloco 3: " + e.getMessage());
        }
    }
    
    /**
     * Exemplos do Bloco 4 - Extensões, Validações e Boas Práticas
     */
    private static void exemploBloco4() {
        System.out.println("\n===== BLOCO 4: EXTENSÕES, VALIDAÇÕES E BOAS PRÁTICAS =====\n");
        
        // Testando exceções personalizadas
        System.out.println("--- Testando exceções personalizadas ---");
        ContaCorrente contaCorrente = new ContaCorrente("12345", "001", 500.0);
        
        try {
            // Tentando depositar valor inválido
            System.out.println("Tentando depositar valor inválido (-100):");
            contaCorrente.depositar(-100.0);
        } catch (ValorInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
            System.out.println("Valor inválido: R$ " + e.getValorInvalido());
        } catch (Exception e) {
            System.out.println("Outra exceção: " + e.getMessage());
        }
        
        try {
            // Tentando sacar valor maior que o saldo
            System.out.println("\nTentando sacar valor maior que o saldo (1000):");
            contaCorrente.sacar(1000.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
            System.out.println("Saldo atual: R$ " + e.getSaldoAtual());
            System.out.println("Valor solicitado: R$ " + e.getValorSolicitado());
            System.out.println("Valor faltante: R$ " + e.getValorFaltante());
        } catch (Exception e) {
            System.out.println("Outra exceção: " + e.getMessage());
        }
        
        // Testando registro de operações
        try {
            System.out.println("\n--- Testando registro de operações ---");
            contaCorrente.depositar(200.0);
            contaCorrente.sacar(100.0);
            
            // Imprimindo extrato
            contaCorrente.imprimirExtrato();
        } catch (Exception e) {
            System.out.println("Erro ao testar registro de operações: " + e.getMessage());
        }
        
        // Testando interface funcional PoliticaTarifa
        System.out.println("\n--- Testando interface funcional PoliticaTarifa ---");
        
        // Criando diferentes políticas de tarifa usando expressões lambda
        PoliticaTarifa tarifaPadrao = (conta) -> {
            if (conta instanceof ContaCorrente) return 15.0;
            if (conta instanceof ContaPoupanca) return 0.0;
            if (conta instanceof ContaUniversitaria) return 5.0;
            if (conta instanceof ContaEmpresarial) return 30.0;
            return 10.0; // Tarifa padrão para outros tipos
        };
        
        PoliticaTarifa tarifaPromocional = (conta) -> {
            if (conta instanceof ContaCorrente) return 7.5;  // 50% da tarifa normal
            if (conta instanceof ContaPoupanca) return 0.0;
            if (conta instanceof ContaUniversitaria) return 2.5; // 50% da tarifa normal
            if (conta instanceof ContaEmpresarial) return 15.0; // 50% da tarifa normal
            return 5.0; // Tarifa padrão para outros tipos
        };
        
        // Aplicando diferentes políticas de tarifa
        System.out.println("Tarifa padrão para Conta Corrente: R$ " + 
                          tarifaPadrao.calcularTarifa(contaCorrente));
        
        System.out.println("Tarifa promocional para Conta Corrente: R$ " + 
                          tarifaPromocional.calcularTarifa(contaCorrente));
        
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "001", 1000.0);
        System.out.println("Tarifa padrão para Conta Poupança: R$ " + 
                          tarifaPadrao.calcularTarifa(contaPoupanca));
        
        System.out.println("Tarifa promocional para Conta Poupança: R$ " + 
                          tarifaPromocional.calcularTarifa(contaPoupanca));
    }
}
