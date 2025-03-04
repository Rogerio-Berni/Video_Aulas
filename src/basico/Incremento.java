package basico;
public class Incremento {

    public static void main(String[] args) {

        int numero = 1;

        numero++;

        // Imprime
        System.out.println(numero);
  
        // Impprime primeiro e depois imcrementa
        System.out.println(numero++);

        // Incrementa e depois imprime
        System.out.println(++numero);

        numero = 2;

        numero--;

        // Imprime
        System.out.println(numero);
  
        // Impprime primeiro e depois imcrementa
        System.out.println(numero--);

        // Incrementa e depois imprime
        System.out.println(--numero);

}
}