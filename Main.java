import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        double saldo = 0;
        double deposito = 0;
        double transferir = 0;
        String resposta = "";

        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo, digite seu nome para começar.");
        String nome = leitura.nextLine();

        while (numero != 4) {

            while (numero < 1 || numero > 4) {
                System.out.println("***********************\n" +
                        "Bem-vindo(a) " + nome + ".\n" +
                        "Digite a opção desejada para\n" +
                        "1- Consultar saldos\n" +
                        "2- Depositar valor\n" +
                        "3- Transferir valor\n" +
                        "4- Sair\n");
                numero = leitura.nextInt();
            }
            if (numero == 1) {
                System.out.println("***********************\n" +
                        "Nome:" + nome + "\n" +
                        "Tipo conta: Corrente\n" +
                        "Saldo disponível em conta:" + saldo + "\n" +
                        "***********************\n" +
                        "\n" +
                        " Confirme 0 para voltar ao Inicio.\n");
                numero = leitura.nextInt();

            } else if (numero == 2) {
                while ( !resposta.equalsIgnoreCase("sim")) {
                    System.out.println("Digite o valor que irá depositar:");
                    deposito = leitura.nextDouble();
                    System.out.println("Digite SIM para confirmar o valor ou 0 para retornar: R$" + deposito);
                    resposta = leitura.next();
                    saldo += deposito;
                }
                System.out.println("***********************\n" +
                        "Nome:" + nome + "\n" +
                        "Tipo conta: Corrente\n" +
                        "Saldo disponível em conta:" + (saldo + deposito) + "\n" +
                        "***********************\n" +
                        "\n" +
                        " Confirme 0 para voltar ao INÍCIO ou 4 para SAIR.\n");
                numero = leitura.nextInt();

            } else if (numero == 3) {
                
            }


        }


    }
}
