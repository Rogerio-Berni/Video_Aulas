package objetos;

import Teste.Animal;

public class PrincipalImport {
    public static void main(String[] args) {
        
        Pessoa4 objeto = new Pessoa4();
        System.out.println(objeto.nome);

        Animal obj = new Animal();
        System.out.println(obj.tipo);

        obj.fazerBarulho();

     
    }

}
