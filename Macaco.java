import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<String> bucho;
    
    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = new ArrayList<>();
    }
    
    public void comer(String alimento) {
        bucho.add(alimento);
    }
    
    public void verBucho() {
        if (bucho.isEmpty()) {
            System.out.println("O bucho está vazio.");
        } else {
            System.out.println("Conteúdo do bucho:");
            for (String alimento : bucho) {
                System.out.println("- " + alimento);
            }
        }
    }
    
    public void digerir() {
        if (bucho.isEmpty()) {
            System.out.println("O macaco não tem nada no bucho para digerir.");
        } else {
            System.out.println("Digerindo...");
            bucho.clear();
            System.out.println("Digerido com sucesso. O bucho está vazio.");
        }
    }
    
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaco1");
        Macaco macaco2 = new Macaco("Macaco2");
        
        macaco1.comer("Banana");
        macaco1.comer("Maçã");
        macaco2.comer("Pêssego");
        
        System.out.println("Bucho do Macaco 1:");
        macaco1.verBucho();
        
        System.out.println("\nBucho do Macaco 2:");
        macaco2.verBucho();
        
        macaco1.digerir();
        macaco2.comer("Uva");
        macaco2.comer("Laranja");
        
        System.out.println("\nBucho do Macaco 1 após a digestão:");
        macaco1.verBucho();
        
        System.out.println("\nBucho do Macaco 2 após mais refeições:");
        macaco2.verBucho();
        
        System.out.println("\nMacaco 1 come o Macaco 2...");
        macaco1.comer(macaco2.nome);
        
        System.out.println("\nBucho do Macaco 1 com Macaco 2 dentro:");
        macaco1.verBucho();
    }
}
