import java.util.Scanner;
public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while(x){
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            for(int i = 0;i<=10;i++){
                System.out.println(numero+"X"+i+"="+(numero*i));
            }
            System.out.println("Deseja digitar outro numero(s/n): ");
            String escolha = scanner.nextLine();
            
            if("n".equalsIgnoreCase(escolha)){
                x = false;
            }
        }
    }
}