
public class MainAula67 {

    public static void main(String[] args) {
        // Switch Expression (Java 12+)
        int day = 2;
        switch (day) {
            case 1 -> // expressão
                System.out.println("Segunda");
            case 2 -> { // bloco
                System.out.println("Terça");
            }
            case 3 -> // expressão
                System.out.println("Quarta");
            // ... 
            default -> // expressão
                System.out.println("Desconhecido");
        }

        String dia = "Ter.";
        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." ->
                "Dia util";
            case "Sábado", "Domingo" ->
                "Fim de semana";
            default ->
                "Desconhecido";
        };
        System.out.println(tipoDeDia); // Dia util

    }
}
