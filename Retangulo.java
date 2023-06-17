import java.util.Scanner;

public class Retangulo {
    private double ladoA;
    private double ladoB;
    
    public void mudarLados(double novoLadoA, double novoLadoB) {
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }
    
    public double[] retornarLados() {
        double[] lados = {ladoA, ladoB};
        return lados;
    }
    
    public double calcularArea() {
        return ladoA * ladoB;
    }
    
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado A: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Digite o valor do lado B: ");
        double ladoB = scanner.nextDouble();
        
        Retangulo retangulo = new Retangulo();
        retangulo.mudarLados(ladoA, ladoB);
        
        double[] ladosRetangulo = retangulo.retornarLados();
        System.out.println("Lados do retângulo: A = " + ladosRetangulo[0] + ", B = " + ladosRetangulo[1]);
        
        double areaRetangulo = retangulo.calcularArea();
        System.out.println("Área do retângulo: " + areaRetangulo);
        
        double perimetroRetangulo = retangulo.calcularPerimetro();
        System.out.println("Perímetro do retângulo: " + perimetroRetangulo);
        
        
        double areaPiso = 1.0;  
        double comprimentoRodape = 0.2;  
        
        int quantidadePisos = (int) Math.ceil(areaRetangulo / areaPiso);
        int quantidadeRodapes = (int) Math.ceil(perimetroRetangulo / comprimentoRodape);
        
        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);
        
        scanner.close();
    }
}
