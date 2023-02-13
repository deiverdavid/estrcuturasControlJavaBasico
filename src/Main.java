import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();

        if (numero < 0){
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es positivo");
        }

        numero = 0;
        while (numero < 3){
            numero++;
            System.out.println(numero);
        }

        do {
            numero++;
            System.out.println(numero);
        }while (numero < 0);

        for (int i =0; i <= 3; i++){
            System.out.println(i);
        }

        String estacion = "invierno";
        switch (estacion){
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default: System.out.println("Ese estación no la conozco");
        }

    }
}