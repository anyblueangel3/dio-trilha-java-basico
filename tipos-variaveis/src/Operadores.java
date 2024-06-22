public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero = numero + 2;
        System.out.println(numero);
        numero++;
        System.out.println(numero++);
        System.out.println(numero--);
        System.out.println(numero);

        System.out.println("-------------------Boleanos-------------------------");

        boolean variavel = true;
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("----------Operador ternário---------------------");

        int a = 6, b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

    }
}