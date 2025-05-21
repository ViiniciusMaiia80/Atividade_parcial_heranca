public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, double comprimento, int patas,String cor, String ambiente, double velocidadeMedia, String caracteristica){
        super(nome, comprimento, patas, cor, ambiente, velocidadeMedia);
        this.caracteristica=caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public void dadosPeixe(){
        setPatas(0);
        dados();
        if(caracteristica!=null){
        System.out.printf("Caracteristica: %s\n", caracteristica);
        }
    }
}
