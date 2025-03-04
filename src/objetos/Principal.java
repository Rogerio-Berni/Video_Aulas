package objetos;

public class Principal {

    // chamada de metodo com passagem de parametro idefinido
    int somarNumeros (int ... numeros){
        int soma = 0;
        for(int n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static void main(String[] args) {

        // chamada de metodo com passagem de parametro idefinido
        Principal teste = new Principal();
        int soma = teste.somarNumeros(12,34,67,89);
        System.out.println(soma);

        // chamando o metodo sem retorno
        Pessoa eu = new Pessoa();
        eu.durmir();
        
        // chamando o metodo com retorno
        Pessoa voce = new Pessoa();
        // pega o retorno
        String apresentacao = voce.apresentar();
        System.out.println(apresentacao);

        // Chmada de metodo com passagem de parametro
        Pessoa tu = new Pessoa();
        tu.mostraNome("Carlos");

        // chamada de metodo com passagem de parametro e retorno ao mesmo tempo
        Pessoa ele = new Pessoa();
        int idade = ele.calcularIdade(1969, 2025);
        System.out.println("Idade é " + idade);

        

}
}

