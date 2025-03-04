package objetos;

public class Pessoa {
    String nome = "Carlos";

    void durmir() {
        System.out.println("ZZzzZZzzZZzzZZ");
    }

    String apresentar() {
        return "Prazer, meu nome é " + nome;
    }

    void mostraNome(String nome) {
        System.out.println("Nome é " + nome);

    }

    int calcularIdade(int nascimento, int atual) {
        return atual-nascimento;

    }

}
