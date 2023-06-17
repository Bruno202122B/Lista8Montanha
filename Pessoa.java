public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.5;
        }
    }
    
    public void engordar(double pesoGanho) {
        peso += pesoGanho;
    }
    
    public void emagrecer(double pesoPerdido) {
        peso -= pesoPerdido;
    }
    
    public void crescer(double alturaGanha) {
        altura += alturaGanha;
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 18, 70.0, 170.0);
        pessoa.envelhecer();
        pessoa.engordar(5.0);
        pessoa.emagrecer(2.0);
        pessoa.crescer(1.0);
        
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Altura: " + pessoa.altura);
    }
}




