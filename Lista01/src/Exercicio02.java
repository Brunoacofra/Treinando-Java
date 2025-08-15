import java.util.Scanner;
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        int somadosnumerospares = 0;
        int i;
        int pares = 0;
        int impares = 0;
        for(i = 0;i<10;i++){
            System.out.print("Digite o numero de posição "+(i+1)+"○: ");
            numeros[i] = scanner.nextInt();
        }
        for(i= 0;i<10;i++){
            if(numeros[i]%2 == 0){
                pares++;
                somadosnumerospares +=numeros[i];
                
            }else{
                impares++;
            }
        }
        System.out.println("_______________________________________________");
        System.out.printf("Quantidade de numeros Pares :%d %n",pares);
        System.out.printf("Quantidade de numeros Impares :%d %n",impares);
        System.out.printf("Soma dos numeros pares :%d",somadosnumerospares);
        scanner.close();
    }
}