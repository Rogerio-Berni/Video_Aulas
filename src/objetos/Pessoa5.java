package objetos;

public class Pessoa5 {
    public String nome = "Carlos";
    // privarte restringe que qq classe acesse o atributo, apenas a classe pessoa5 tem acesso, isto e a propria classe que a criou
    private int senhaDoBanco = 123;

    // vantagem [e usar uma logica para testar a senha no metodo antes de retornar um atributo protegido.
    public int pegarSenhaDoBanco() {

        return senhaDoBanco;
    }


}
