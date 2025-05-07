import java.util.Scanner;
public class verificador {
    public static void main(String[] args){
        int senha;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
            
        }while (senha != 1234);
        System.out.println("Acesso Liberado");
    }
}