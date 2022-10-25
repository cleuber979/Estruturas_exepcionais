public class DesafioJava2 {
    public static void main(String[] args) {
        int[] numeros = { 2, 3, 5, 7, 11, 13, 18, 34 };

        // TODO: Implemente um laço de repetição que verifique APENAS seus números
        // Pares:
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Os numeros pares dentro do array são " + numeros[i]);
            }
        }
    }
}
