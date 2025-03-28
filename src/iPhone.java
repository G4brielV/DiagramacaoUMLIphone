public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("Tocando uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }


    @Override
    public void ligar() {
        System.out.println("Ligando o aparelho");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo aparelho");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciado correio de voz");
    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adiconada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
