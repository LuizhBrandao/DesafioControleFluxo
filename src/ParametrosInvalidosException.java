// Essa classe serve para criar uma exceção personalizada
public class ParametrosInvalidosException extends Exception {

    // Construtor que recebe uma mensagem de erro
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Chama o construtor da classe Exception
    }
}
