public class MainAula55 {

    public static void main(String[] args) {
        // Exemplo de incremento
        int a = 10;
        //int b = a++; // Pós-incremento: b recebe o valor de a, depois a é incrementado
        int b = ++a; // Pré-incremento: a é incrementado, depois b recebe o valor de a
        //a++; // Equivalente a a = a + 1;
        System.out.println(a); // Saída: 11
        System.out.println(b); // Saída: 10 com pós-incremento // Saída: 11 com pré-incremento
    }
}
