package objetos;

public class Estaticos {

    public static void main(String[] args) {
        SalaDeAula.Professor = "Leo";
        SalaDeAula.ensinar();

        SalaDeAula a1 = new SalaDeAula();
        a1.aluno = "Carlos";
        System.out.println(a1.Professor);

        SalaDeAula a2 = new SalaDeAula();
        a2.aluno = "Ana";
        System.out.println(a2.Professor);
    }

}
