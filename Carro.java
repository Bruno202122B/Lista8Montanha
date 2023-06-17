public class Carro {
    private double consumoCombustivel;
    private double nivelCombustivel;
    
    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0.0;
    }
    
    public void andar(double distancia) {
        double combustivelConsumido = distancia / consumoCombustivel;
        if (combustivelConsumido <= nivelCombustivel) {
            nivelCombustivel -= combustivelConsumido;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer a distância especificada.");
        }
    }
    
    public void adicionarGasolina(double quantidade) {
        nivelCombustivel += quantidade;
        System.out.println("Tanque abastecido com " + quantidade + " litros de combustível.");
    }
    
    public double obterGasolina() {
        return nivelCombustivel;
    }
}
