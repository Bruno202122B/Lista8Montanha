import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FazendaDeBichinhos {
    private List<Bichinho> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(Bichinho bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.comer();
        }
        System.out.println("Todos os bichinhos foram alimentados!");
    }

    public void brincarComTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.brincar();
        }
        System.out.println("Todos os bichinhos brincaram!");
    }

    public void ouvirTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.emitirSom();
        }
        System.out.println("Todos os bichinhos foram ouvidos!");
    }

    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();

        
        fazenda.adicionarBichinho(new Bichinho("Bichinho 1", new Random().nextInt(10), new Random().nextInt(10)));
        fazenda.adicionarBichinho(new Bichinho("Bichinho 2", new Random().nextInt(10), new Random().nextInt(10)));
        fazenda.adicionarBichinho(new Bichinho("Bichinho 3", new Random().nextInt(10), new Random().nextInt(10)));

        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Alimentar todos os bichinhos");
            System.out.println("2. Brincar com todos os bichinhos");
            System.out.println("3. Ouvir todos os bichinhos");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    fazenda.alimentarTodos();
                    break;
                case 2:
                    fazenda.brincarComTodos();
                    break;
                case 3:
                    fazenda.ouvirTodos();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

class Bichinho {
    private String nome;
    private int nivelFome;
    private int nivelTedio;

    public Bichinho(String nome, int nivelFome, int nivelTedio) {
        this.nome = nome;
        this.nivelFome = nivelFome;
        this.nivelTedio = nivelTedio;
   
