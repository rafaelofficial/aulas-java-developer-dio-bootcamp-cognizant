package exceptioncustom;

public class ExceptionCustom_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Não foi possível fazer a divisão", numerador[i], denominador[i]);
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Não existe um ou mais índices para fazer o cálculo: " + e.getMessage());
            }
        }

    }
}
