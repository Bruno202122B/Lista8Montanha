import java.util.Scanner;

public class Televisor {
    private int canal;
    private int volume;
    
    public Televisor() {
        canal = 1;
        volume = 50;
    }
    
    public void alterarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }
    
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Volume máximo alcançado.");
        }
    }
    
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("Volume mínimo alcançado.");
        }
    }
    
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Scanner scanner = new Scanner(System.in);
        
        boolean ligado = true;
        
        while (ligado) {
            System.out.println("=== Menu ===");
            System.out.println("1. Alterar canal");
            System.out.println("2. Aumentar volume");
            System.out.println("3. Diminuir volume");
            System.out.println("4. Desligar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do canal: ");
                    int novoCanal = scanner.nextInt();
                    televisor.alterarCanal(novoCanal);
                    break;
                case 2:
                    televisor.aumentarVolume();
                    break;
                case 3:
                    televisor.diminuirVolume();
                    break;
                case 4:
                    ligado = false;
                    System.out.println("Televisor desligado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        scanner.close();
    }
}
