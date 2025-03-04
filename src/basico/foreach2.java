package basico;
public class foreach2 {
        public static void main(String[] args) {
           int[] numero = {1,5,10,100,50,50000};
           int soma = 0;

           for(int n: numero) {

               soma += n;

           }

           System.out.println(soma);
                                      
}

}
