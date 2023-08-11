import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public Iphone() {
        ligarIphone();
    }

    public void ligarIphone() {
        System.out.println("Ligando Iphone....");
        System.out.println("Iphone ligado. Seja bem vindo!");
        System.out.println("O que voce deseja fazer?");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        exibirPagina();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando....");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz....");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música....");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música....");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música....");
    }

    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone();

        
        

    }
    
}
