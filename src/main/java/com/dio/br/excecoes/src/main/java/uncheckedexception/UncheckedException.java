package uncheckedexception;

import javax.swing.*;

// faz a divisão de dois números inteiros
public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro." + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Não é possível dividir um número por 0." + e.getMessage());
            }
            finally {
                JOptionPane.showMessageDialog(null, "Fim do programa!");
            }
        } while (continueLooping);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
