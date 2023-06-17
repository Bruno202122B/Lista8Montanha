import java.util.Scanner;

public class PortaEscondidaTamagoshi {
    private String nome;
    private int nivelFome;
    private int nivelTedio;
    
    public PortaEscondidaTamagoshi(String nome) {
        this.nome = nome;
        this.nivelFome = 0;
        this.nivelTedio = 0;
    }
    
    public void alimentar(int quantidadeComida) {
        nivelFome -= quantidadeComida;
        if (nivelFome < 0) {
            nivelFome = 0;
        }
    }
    
    public void brincar(int tempoBrincadeira) {
        nivelTedio -= tempoBrincadeira;
        if (nivelTedio < 0) {
            nivelTedio = 0;
        }
    }
    
    public void passarTempo(int tempo) {
        nivelFome += tempo;
        nivelTedio += tempo;
    }
    
    public void imprimirEstado() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível de Fome: " + nivelFome);
        System.out.println("Nível de Tédio: " + nivelTedio);
    }
    
    public String toString() {
        return "Nome: " + nome +
               "\nNível de Fome: " + nivelFome +
               "\nNível de Tédio: " + nivelTedio;
    }
    
    public static void main(String[] args) {
        PortaEscondidaTamagoshi tamagoshi = new PortaEscondidaTamagoshi("Tamagoshi");
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Alimentar");
            System.out.println("2. Brincar");
            System.out.println("3. Passar Tempo");
            System.out.println("4. Exibir Estado Atual");
            System.out.println("5. Opção Secreta");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de comida: ");
                    int quantidadeComida = scanner.nextInt();
                    tamagoshi.alimentar(quantidadeComida);
                    break;
                case 2:
                    System.out.println("Informe o tempo de brincadeira: ");
                    int tempoBrincadeira = scanner.nextInt();
                    tamagoshi.brincar(tempoBrincadeira);
                    break;
                case 3:
                    System.out.println("Informe o tempo que passou: ");
                    int tempo = scanner.nextInt();
                    tamagoshi.passarTempo(tempo);
                    break;
                case 4:
                    tamagoshi.imprimirEstado();
                    break;
                case 5:
                    System.out.println(tamagoshi);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
            System.out.println();
        } while (opcao != 0);
        
        scanner.close();
    }
}
