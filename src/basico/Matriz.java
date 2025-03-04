package basico;
public class Matriz {
            public static void main(String[] args) {
                // primeira forma de inicializar uma matriz
                /*
                 * String[][] nomes = new String[3][4];
                 * nomes[0][0] = "Carlos";
                 * nomes[0][1] = "Marcelo";
                 * nomes[0][2] = "Gabriela";
                 * nomes[0][3] = "Ana";
                 * nomes[1][0] = "Pedro";
                 * nomes[1][1] = "Antonio";
                 * nomes[2][2] = "Marco";
                 * nomes[3][3] = "Eunici";
                 */
                // segunda forma de inicializar um array
                String[][] nomes = {{"Carlos","Marcelo","Gabriela","Ana"},{"Pedro","Antonio","Marco","Eunici"}};
    
                System.out.println(nomes[0][1]);
    
                // sobrepondo uma posição
    
                nomes[0][1] = "Rogério";
    
                System.out.println(nomes[0][1]);
                                          
    }
    
}
