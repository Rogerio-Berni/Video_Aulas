package objetos;

public class Heranca {


    // Polimorfismo
    public static void Barulho (Animal animal) {
        animal.fazerBarulho();
    }    

    public static void main(String[] args) {

        Cachorro cao = new Cachorro();
        cao.durmir();
        cao.peso = 12.5;
        cao.raca = "Pitbull";

        cao.fazerBarulho();

        Galinha gal = new Galinha();
        gal.durmir();

        gal.fazerBarulho();

        Barulho(gal);
      
    }

}
