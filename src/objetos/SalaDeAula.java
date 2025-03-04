package objetos;

public class SalaDeAula {

    String aluno;
    // o static demostra que vai ser um so para a classe para qq instancia de objeto
    static String Professor;

    static void ensinar() {

        System.out.println(Professor + " Ensinando");
    }
}
