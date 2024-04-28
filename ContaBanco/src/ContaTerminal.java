import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TO DO:Conhecer e importar a classe Scanner
    
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem final (da conta criada)

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + "; conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
       

        scanner.close();
    }

}
