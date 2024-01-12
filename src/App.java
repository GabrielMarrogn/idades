import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double media = 0;
        int idade = 0;

        for(int i = 0;; i++){
            idade = Integer.parseInt(br.readLine());
            if(idade > 0){
            media += idade;
            }else if(idade < 0){
                media = media/i;
                break;
            }

        }

        System.out.printf("%.2f\n",media);
        br.close();
    }
}
