import model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Usuário", "123456");

        iphone.acessarSite("Google.com");
        iphone.tocarMusica();
        iphone.realizarChamada("9999111144");
        iphone.listarArtistas();
        iphone.enviarEmail("teste@gmail.com");
        iphone.listarContatos();
        iphone.colocarEmEspera();
        iphone.reproduzirVideo();

    }
}