package objetos;

public class classes {
public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        System.out.println(eu.nome);
        eu.nome = "Henrique";
        System.out.println(eu.nome);
        
        Pessoa outra = new Pessoa();
        System.out.println(outra.nome);
    }
}


