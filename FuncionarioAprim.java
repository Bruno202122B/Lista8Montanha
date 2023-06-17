public class FuncionarioAprim {
    private String nome;
    private double salario;
    
    public FuncionarioAprim(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void aumentarSalario(double porcentualDeAumento) {
        salario += salario * (porcentualDeAumento / 100.0);
    }
}
