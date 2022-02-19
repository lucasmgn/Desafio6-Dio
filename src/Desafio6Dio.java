import java.io.IOException;
import java.util.Scanner;

public class Desafio6Dio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int i,j;
        double soma = 0;
        
        
        char O = leitor.next().toUpperCase().charAt(0);
        
        double[][] M = new double[12][12];

        
        for (i = 0; i < M.length; i++) {
        	
        	for (j = 0; j < M[i].length; j++ ) {
        		
        		M[i][j] = leitor.nextDouble();
        	}
        }
        

        
        int cont=0;
        for ( i = 1; i < M.length -1 ; i++) {
            if (i == 6) {
            } else if (i > 6) {
                cont--;
            } else {
                cont = i;
            }
            int contAux = 0;
            for (j = M.length-1; j > 6 ; j--) {
                soma = soma + M[i][j];
                contAux++;
                if (contAux == cont){
                    break;
                }
            }
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
	
}
