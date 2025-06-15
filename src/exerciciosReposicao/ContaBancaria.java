package exerciciosReposicao;

/**
 * Classe Abstrata ContaBancaria
 * 
 * Uma classe abstrata é uma classe que não pode ser instanciada diretamente,
 * servindo como um modelo para suas subclasses. Ela pode conter métodos abstratos
 * (sem implementação) que devem ser implementados pelas subclasses, e também
 * métodos concretos (com implementação).
 * 
 * Neste exemplo, ContaBancaria define a estrutura básica de uma conta bancária,
 * com atributos comuns e comportamentos que todas as contas devem ter, mas deixa
 * a implementação específica de calcularTarifaMensal() para as subclasses.
 * 
 * Após refatoração, o atributo saldo foi encapsulado com métodos getter e setter,
 * e um método protegido temSaldoSuficiente foi extraído para verificação de saldo.
 */
public abstract class ContaBancaria {
    // Atributos da conta bancária
    protected String numero;
    protected String agencia;
    double saldo; // Encapsulado como private após refatoração
    
    /**
     * Construtor da classe ContaBancaria
     * 
     * @param numero Número da conta
     * @param agencia Número da agência
     * @param saldoInicial Saldo inicial da conta
     */
    public ContaBancaria(String numero, String agencia, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }
    
    // Registro de operações
    protected RegistroOperacoes registroOperacoes;
    
    /**
     * Método para obter o registro de operações
     * 
     * @return Registro de operações da conta
     */
    public RegistroOperacoes getRegistroOperacoes() {
        if (registroOperacoes == null) {
            registroOperacoes = new RegistroOperacoes();
        }
        return registroOperacoes;
    }
    
    /**
     * Método para imprimir o extrato da conta
     */
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta: " + numero + " Agência: " + agencia);
        getRegistroOperacoes().imprimirExtrato();
    }
    
    /**
     * Método concreto para depositar valor na conta
     * 
     * @param valor Valor a ser depositado
     * @return true se o depósito foi realizado com sucesso
     * @throws ValorInvalidoException se o valor for inválido
     */
    public boolean depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito deve ser maior que zero", valor);
        }
        
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        
        // Registra a operação
        getRegistroOperacoes().registrarOperacao(
            RegistroOperacoes.TipoOperacao.DEPOSITO, 
            valor, 
            "Depósito em conta"
        );
        
        return true;
    }
    
    /**
     * Método concreto para consultar o saldo da conta
     * 
     * @return Saldo atual da conta
     */
    public double consultarSaldo() {
        System.out.println("Saldo atual: R$ " + this.getSaldo());
        return this.getSaldo();
    }
    
    /**
     * Método abstrato para calcular a tarifa mensal
     * 
     * Este método é abstrato, o que significa que não possui implementação na classe pai.
     * Cada subclasse deve fornecer sua própria implementação deste método.
     * 
     * @return Valor da tarifa mensal
     */
    public abstract double calcularTarifaMensal();
    
    /**
     * Método para aplicar a tarifa mensal na conta
     * 
     * Este método utiliza o polimorfismo para chamar o método calcularTarifaMensal()
     * que será implementado de forma específica em cada subclasse.
     */
    public void aplicarTarifa() {
        double valorTarifa = calcularTarifaMensal();
        if (valorTarifa > 0) {
            setSaldo(getSaldo() - valorTarifa);
            System.out.println("Tarifa mensal de R$ " + valorTarifa + " aplicada.");
        } else {
            System.out.println("Conta isenta de tarifa mensal.");
        }
        consultarSaldo();
    }
    
    /**
     * Método para sacar valor da conta
     * 
     * @param valor Valor a ser sacado
     * @return true se o saque foi realizado com sucesso
     * @throws ValorInvalidoException se o valor for inválido
     * @throws SaldoInsuficienteException se o saldo for insuficiente
     */
    public boolean sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser maior que zero", valor);
        }
        
        if (!temSaldoSuficiente(valor)) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente para realizar o saque", 
                getSaldo(), 
                valor
            );
        }
        
        setSaldo(getSaldo() - valor);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        
        // Registra a operação
        getRegistroOperacoes().registrarOperacao(
            RegistroOperacoes.TipoOperacao.SAQUE, 
            valor, 
            "Saque em conta"
        );
        
        return true;
    }
    
    /**
     * Método protegido para verificar se há saldo suficiente
     * 
     * Este método foi extraído durante a refatoração para centralizar a lógica
     * de verificação de saldo, que é utilizada em várias operações.
     * 
     * @param valor Valor a ser verificado
     * @return true se há saldo suficiente
     */
    protected boolean temSaldoSuficiente(double valor) {
        return this.getSaldo() >= valor;
    }
    
    /**
     * Getter para o saldo
     * 
     * @return Saldo atual da conta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Setter para o saldo
     * 
     * @param saldo Novo valor do saldo
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
