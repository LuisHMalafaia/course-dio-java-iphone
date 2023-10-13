public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina na Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina da Internet...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica...");
    }
}
