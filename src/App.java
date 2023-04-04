import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int number_1 = 0;
        int number_2 = 0;
        double number_3 = 0;
        boolean validInput = false;

        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "1º número - número inteiro");
            String input_2 = JOptionPane.showInputDialog(null, "2º número - número inteiro");
            String input_3 = JOptionPane.showInputDialog(null, "3º número - número real");
            try {
                number_1 = Integer.parseInt(input_1);
                number_2 = Integer.parseInt(input_2);
                number_3 = Double.parseDouble(input_3);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double question_1 = (number_1 * 2) * (number_2 / 2);
        double question_2 = (number_1 * 3) + number_3;
        double question_3 = Math.pow(number_3, 3);
        JOptionPane.showMessageDialog(null, "Resultados"
        + "\n1ª número: " + number_1
        + "\n2ª número: " + number_2
        + "\n3ª número: " + number_3
        + "\n————————"
        + "\n(2 x " + number_1 + ") * (" + number_2 + " / 2) = " + question_1
        + "\n3 x " + number_1 + " + " + number_3 + " = " + question_2
        + "\n" + number_3 + "³ = " + question_3);
    }
}