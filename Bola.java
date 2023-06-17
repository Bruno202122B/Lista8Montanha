public class Bola {
    public String cor;
    public double circunferencia;
    public String material;
    
    public void trocaCor(String novaCor) {
        cor = novaCor;
    }
    
    public void mostraCor() {
        System.out.println("A cor da bola é " + cor);
    }
    
    
    
    public static void main(String[] args) {
        Bola minhaBola = new Bola();
        
        minhaBola.cor = "Vermelha";
        minhaBola.circunferencia = 10.0;
        minhaBola.material = "Borracha";
        
        minhaBola.mostraCor(); // Deve exibir "A cor da bola é Vermelha"
        
        minhaBola.trocaCor("Azul");
        
        minhaBola.mostraCor(); // Deve exibir "A cor da bola é Azul"
    }
}
