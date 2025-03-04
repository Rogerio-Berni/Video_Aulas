package Teste;

public class Animal {

    // caso sua classe estive em outra pakage e queira usar em outra pakage tem que colocar public no atributo, metodo e contrutor caso for usar-los
    public String tipo = "Cachorro";

    public void fazerBarulho() {
        System.out.println("Au Au");

    }

    // Funciona para construtor tambem
    public Animal() {
        System.out.println("Iniciou");
    }

}
