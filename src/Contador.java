import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados digitados no terminal
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro número ao usuário
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        // Solicita o segundo número ao usuário
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        // Tenta executar a contagem, mas se der erro, pega a exceção
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Mostra a mensagem de erro caso o primeiro número seja maior que o segundo
            System.out.println(e.getMessage());
        }

    }

    // Método responsável por contar e imprimir os números
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro número é maior que o segundo
        if (parametroUm > parametroDois) {
            // Se for, lança a exceção com a mensagem
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula quantas vezes o laço deve rodar
        int quantidade = parametroDois - parametroUm;

        // Executa o laço de repetição 'for' a quantidade de vezes necessária
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
