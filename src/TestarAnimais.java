public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150.0,4, "Amarela", "Terra",2.0);
        camelo.dadosMamifero();
        Peixe tubarao = new Peixe("Tubarao", 300.0, 4, "Cinza", "Mar", 1.5, "Barbatanas e cauda");
        tubarao.dadosPeixe();
        Mamifero ursocanada = new Mamifero("Urso-do-Canada", 180.0, 4, "Vermelha", "Terra", 0.5, "Mel");
        ursocanada.dadosMamifero();
    }

    } 

