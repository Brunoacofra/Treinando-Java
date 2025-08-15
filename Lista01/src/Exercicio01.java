import java.util.Scanner;
public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("___________________________");
        System.out.println("Digite A primeira nota: ");
        byte nota01 = scanner.nextByte();
        System.out.println("___________________________");
        System.out.println("Digite A segunda nota: ");
        byte nota02 = scanner.nextByte();
        System.out.println("___________________________");
        System.out.println("Digite A terceira nota: ");
        byte nota03 = scanner.nextByte();

        Float media = (nota01+nota02+nota03)/3.0f; 
        System.out.printf("O aluno "+nome+" Tem a Média = %.2f%n",media);
        scanner.close();
    }
}