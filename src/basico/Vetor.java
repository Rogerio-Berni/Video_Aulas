package basico;
public class Vetor {
        public static void main(String[] args) {
            // primeira forma de inicializar um array
            /*
             * String[] nomes = new String[3];
             * nomes[0] = "Carlos";
             * nomes[1] = "Marcdelo";
             * nomes[2] = "Gabriela";
             * nomes[3] = "Ana";
             */
            // segunda forma de inicializar um array
            String[] nomes = {"Carlos","Marcelo","Gabriela"};

            System.out.println(nomes[2]);

            // sobrepondo uma posição

            nomes[0] = "Rogério";

            System.out.println(nomes[0]);
                                      
}
}
