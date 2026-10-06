import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o seu Nome !");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o seu Saldo !");
        conta.setSaldo(scanner.nextDouble());

        String mensagem = "Olá ".concat(conta.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(conta.getAgencia())
                .concat(", conta ").concat(String.valueOf(conta.getNumero()))
                .concat(" e seu saldo ").concat(String.valueOf(conta.getSaldo()))
                .concat(" já está disponível para saque");

        System.out.println(mensagem);

        scanner.close();
    }
}
