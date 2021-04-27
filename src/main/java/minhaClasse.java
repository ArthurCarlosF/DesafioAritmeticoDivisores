import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minhaClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
        int  divisor = Integer.parseInt(st.nextToken());
        int  naoDivisor = Integer.parseInt(st.nextToken());
        int  multiplo = Integer.parseInt(st.nextToken());
        int  naoMultiplo = Integer.parseInt(st.nextToken());
        br.close();

        //declare suas variaveis com o valor correto

     //   System.out.printf("%d %d %d %d",divisor,naoDivisor,multiplo,naoMultiplo);

        boolean numeroEncontrado = false;
        int n=0;
        int resultado=-1;
        while((!numeroEncontrado)&&(n<=109)){

            if(testeDivisor(n,divisor)&&(!testeDivisor(n,naoDivisor))&&(testeDivisor(multiplo,n))&&(!testeDivisor(naoMultiplo,n))){
                resultado=n;
                numeroEncontrado=true;
            }


            n++;
        }
        System.out.println(resultado);
    }


    static boolean testeDivisor(int numero, int divisorTeste){
        if(divisorTeste!=0) {
            int resto = numero % divisorTeste;

            //System.out.printf("%d %d\n", numero, resto);
            if(resto==0){
            //    System.out.println("Passou no teste");
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
