public class Animal{
    private String nome, cor, ambiente;
    private double comprimento, velocidadeMedia;
    private int patas;

    public Animal(String nome, double comprimento, int patas,String cor, String ambiente, double velocidadeMedia){
       this.nome=nome; this.comprimento=comprimento;
       this.patas=patas;
       this.cor=cor;
       this.ambiente=ambiente;
       this.velocidadeMedia=velocidadeMedia; 
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getComprimento() {
        return comprimento;
    }
    
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public void dados(){
        System.out.printf("\nNome: %s\nComprimento: %.2f\nPatas: %d\nCor: %s\nAmbiente: %s\nVelocidade Media: %.1f\n"
        , getNome(),getComprimento(),getPatas(),getCor(),getAmbiente(),getVelocidadeMedia() );
    }
}