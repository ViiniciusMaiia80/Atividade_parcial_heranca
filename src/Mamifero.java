public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int patas,String cor, String ambiente, double velocidadeMedia, String alimento){
        super(nome, comprimento, patas, cor, ambiente, velocidadeMedia);
        this.alimento=alimento;
    }
    public Mamifero(String nome, double comprimento, int patas,String cor, String ambiente, double velocidadeMedia){
        super(nome, comprimento, patas, cor, ambiente, velocidadeMedia);
        
    }


    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public void dadosMamifero(){
        dados();
        if(alimento!=null){
        System.out.printf("Alimento: %s\n", alimento);
        }
    }
}
