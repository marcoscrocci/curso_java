public class MainAula40 {

    public static void main(String[] args) {
        // Exemplo de declaração e inicialização de variáveis com inferência de tipo
        var idade = 25;
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de idade: " + ((Object)idade).getClass().getSimpleName());
    }
}
