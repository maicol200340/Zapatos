import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        String[] zapatos = { "Zapatos deportivos", "Zapatos casuales", "Zapatos formales", "Sandalias", "Botas" };
        int[] precio = { 10000, 20000, 30000, 40000, 50000 };
        String[] marca = { "Nike", "Adidas", "Puma", "Crocs", "Timberland" };
        int[] stock = { 10, 20, 30, 40, 50 };
        int bucle = 0;
        int total = 0;
        while (bucle == 0) {
            System.out.println("  N  Zapatos   Marca   Stock   Precio");
            for (int i = 0; i < zapatos.length; i++) {
                System.out.println("  " + i + "   " + zapatos[i] + "   " + marca[i] + "   " + stock[i] + "   $" + precio[i]);
            }
            System.out.println("Ingrese el número de los zapatos que desea comprar:");
            int numZapatos = sc.nextInt();
            System.out.println("Ingrese la cantidad de pares que desea comprar:");
            int cantZapatos = sc.nextInt();
            if (cantZapatos > stock[numZapatos]) {
                System.out.println("No hay suficiente stock, realice una nueva compra");
                continue;
            } else if (cantZapatos <= 0) {
                System.out.println("No se puede comprar 0 o menos pares de zapatos");
                continue;
            } else if (numZapatos < 0 || numZapatos > 4) {
                System.out.println("No existe ese par de zapatos");
                continue;
            } else {
                stock[numZapatos] = stock[numZapatos] - cantZapatos;
                System.out.println("Compra realizada con éxito");
            }
            System.out.println("¿Desea comprar otro par de zapatos? 1 = Sí, 2 = No");
            int respuesta = sc.nextInt();
            if (respuesta == 1) {
                total = total + (precio[numZapatos] * cantZapatos);
            } else if (respuesta == 2) {
                total = total + (precio[numZapatos] * cantZapatos);
                bucle = 1;
            } else {
                System.out.println("Respuesta inválida");
                continue;
            }
        }
        System.out.println("Nombre: " + nombre);
        System.out.println("El total a pagar es: $" + total);
    }
}
