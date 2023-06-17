import java.util.Scanner;

class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void imprimir() {
        System.out.println("Ponto: (" + x + ", " + y + ")");
    }
}

class Retangulo {
    private Ponto pontoInicial;
    private double largura;
    private double altura;
    
    public Retangulo(Ponto pontoInicial, double largura, double altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }
    
    public Ponto encontrarCentro() {
        double centroX = pontoInicial.getX() + largura / 2;
        double centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
    
    public void imprimirCentro() {
        Ponto centro = encontrarCentro();
        System.out.println("Centro do Retângulo: (" + centro.getX() + ", " + centro.getY() + ")");
    }
    
    public void alterarValores(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Ponto pontoInicial = new Ponto(0, 0);
        pontoInicial.imprimir();
        
        Retangulo retangulo1 = new Retangulo(pontoInicial, 5, 3);
        Retangulo retangulo2 = new Retangulo(pontoInicial, 8, 6);
        
        retangulo1.imprimirCentro();
        retangulo2.imprimirCentro();
        
        int opcao;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Alterar valores do retângulo 1");
            System.out.println("2. Alterar valores do retângulo 2");
            System.out.println("3. Imprimir centro do retângulo 1");
            System.out.println("4. Imprimir centro do retângulo 2");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova largura do retângulo 1: ");
                    double novaLargura1 = scanner.nextDouble();
                    System.out.print("Digite a nova altura do retângulo 1: ");
                    double novaAltura1 = scanner.nextDouble();
                    retangulo1.alterarValores(novaLargura1, novaAltura1);
                    break;
                case 2:
                    System.out.print("Digite a nova largura do retângulo 2: ");
                    double novaLargura2 = scanner.nextDouble();
                    System.out.print("Digite a nova altura do retângulo 2: ");
                    double novaAltura2 = scanner.nextDouble();
                    retangulo2.alterarValores(novaLargura2, novaAltura2);
                    break;
                case 3:
                    retangulo1.imprimirCentro();
                    break;
                case 4:
                    retangulo2.imprimirCentro();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);
        
        scanner.close();
    }
}
