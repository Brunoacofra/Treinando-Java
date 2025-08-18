import java.util.Scanner;
public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        float saldo = 1000;
        while(x){
            System.out.println("--------------------------------------");
            System.out.println("             1 - Sacar                ");
            System.out.println("             2 - Depositar            ");
            System.out.println("             3 - Ver saldo            ");
            System.out.println("             4 - Sair                 ");
            System.out.println("--------------------------------------");
            System.out.print("Digite uma das opções acima:");
            byte escolha = scanner.nextByte();
            scanner.nextLine();
            if(escolha < 1 || escolha >=5){
                System.out.println("Opção Invalida !!!!!");
                System.out.println("Digite Enter para continuar ....");
                scanner.nextLine();
            }else{
                if (escolha == 1) {
                    
                }
                if (escolha == 2) {
                    
                }
                if (escolha == 3) {
                    
                }
                if(escolha == 4){
                    x = false;
                }            
            }
        }
    }
}