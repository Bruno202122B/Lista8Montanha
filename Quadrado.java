public class Quadrado {
    public double lado;
    
    public void mudarLado(double novoLado) {
        lado = novoLado;
    }
    
    public double retornarLado() {
        return lado;
    }
    
    public double calcularArea() {
        return lado * lado;
    }
    
    public static void main(String[] args) {
        Quadrado meuQuadrado = new Quadrado();
        
        meuQuadrado.mudarLado(5.0);
        
        double ladoQuadrado = meuQuadrado.retornarLado();
        System.out.println("O lado do quadrado é: " + ladoQuadrado);
        
        double areaQuadrado = meuQuadrado.calcularArea();
        System.out.println("A área do quadrado é: " + areaQuadrado);
    }
}
