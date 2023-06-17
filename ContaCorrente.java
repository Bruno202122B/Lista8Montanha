public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }
    
    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    
    public void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }
    
    public void deposito(double valor) {
        saldo += valor;
    }
    
    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(123, "João");
        conta1.deposito(100.0);
        conta1.saque(50.0);
        
        System.out.println("Conta 1:");
        System.out.println("Número da Conta: " + conta1.numeroConta);
        System.out.println("Nome do Correntista: " + conta1.nomeCorrentista);
        System.out.println("Saldo: " + conta1.saldo);
        
        ContaCorrente conta2 = new ContaCorrente(456, "Maria", 500.0);
        conta2.saque(200.0);
        conta2.alterarNome("Maria Silva");
        
        System.out.println("\nConta 2:");
        System.out.println("Número da Conta: " + conta2.numeroConta);
        System.out.println("Nome do Correntista: " + conta2.nomeCorrentista);
        System.out.println("Saldo: " + conta2.saldo);
    }
}
