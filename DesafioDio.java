public class DesafioDio {
    public static void main(String[] args) {
        int[] numero = { 2, 3, 5, 7, 11, 13, 18, 34 };

        for (int e = 0; e < numero.length; e++) {
            if (numero[e] % 2 == 0) {

                System.out.println("Os numeros pares dentro do array são " + numero[e]);

            }
        }
    }
}
