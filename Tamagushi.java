public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    
    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }
    
    public void alterarNome(String novoNome) {
        nome = novoNome;
    }
    
    public void alterarFome(int novaFome) {
        fome = novaFome;
    }
    
    public void alterarSaude(int novaSaude) {
        saude = novaSaude;
    }
    
    public void alterarIdade(int novaIdade) {
        idade = novaIdade;
    }
    
    public String retornarNome() {
        return nome;
    }
    
    public int retornarFome() {
        return fome;
    }
    
    public int retornarSaude() {
        return saude;
    }
    
    public int retornarIdade() {
        return idade;
    }
    
    public int retornarHumor() {
        return fome + saude;
    }
    
    public static void main(String[] args) {
        Tamagushi tamagushi = new Tamagushi("Tammy", 5, 8, 2);
        
        tamagushi.alterarFome(3);
        tamagushi.alterarSaude(7);
        tamagushi.alterarIdade(3);
        
        System.out.println("Nome: " + tamagushi.retornarNome());
        System.out.println("Fome: " + tamagushi.retornarFome());
        System.out.println("Saúde: " + tamagushi.retornarSaude());
        System.out.println("Idade: " + tamagushi.retornarIdade());
        System.out.println("Humor: " + tamagushi.retornarHumor());
    }
}
