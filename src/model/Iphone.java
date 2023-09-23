package model;

public class Iphone implements Ipod, Telefone, Internet{

    private String usuario;
    private String senha;

    public Iphone(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void acessarSite(String url) {
        System.out.println("Acessando site " + url);
    }

    @Override
    public void listarSitesFavoritos() {
        System.out.println("AMAZON");
        System.out.println("GOOGLE");
        System.out.println("NETFLIX");
    }

    @Override
    public void enviarEmail(String destino) {
        System.out.println("Enviando Email para " +  destino);
    }

    @Override
    public void listarEmails() {
        System.out.println("teste@gmail.com");
        System.out.println("google@gmail.com");
        System.out.println("steve@yahoo.com");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void listarArtistas() {
        System.out.println("Metallica");
        System.out.println("The Beatles");
        System.out.println("ACDC");
    }

    @Override
    public void listarAlbuns() {
        System.out.println("Master of puppets");
        System.out.println("Sgt Pepper Lonely Hearts Club Band");
        System.out.println("Back in Black");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo Vídeo");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo Chamada");
    }

    @Override
    public void realizarChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void listarContatos() {
        System.out.println("Eduardo");
        System.out.println("Steve");
        System.out.println("Bob");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Colocando em espera");
    }

    @Override
    public void criarConferencia() {
        System.out.println("Criando Conferência");
    }
}
