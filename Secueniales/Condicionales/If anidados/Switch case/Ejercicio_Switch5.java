import java.util.Scanner;

public class Ejercicio_Switch5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Compra = 0;
        double FondosEmpresa = 0;
        double PrestamoBanco = 0;
        double CreditoFabricante = 0;
        double Intereses = 0;

        System.out.println("Digite el monto total de la compra:");
        Compra = Double.parseDouble(teclado.nextLine());

        int categoria;
        if (Compra > 500000) {
            categoria = 1;
        } else if (Compra <= 500000 && Compra > 100000) {
            categoria = 2;
        } else {
            categoria = 3;
        }

        switch (categoria) {
            case 1:
                FondosEmpresa = (Compra * 55 / 100);
                PrestamoBanco = (Compra * 30 / 100);
                CreditoFabricante = (Compra * 15 / 100);
                break;

            case 2:
                FondosEmpresa = (Compra * 70 / 100);
                PrestamoBanco = 0;
                CreditoFabricante = (Compra * 30 / 100);
                Intereses = (CreditoFabricante * 20 / 100);
                break;

            case 3:
                System.out.println("no necesita prestamos ella misma responde por los gastos");
                break;

            default:
                System.out.println("Valor no válido");
                break;
        }

        System.out.println("Cantidad a invertir de los fondos de la empresa: " + FondosEmpresa);
        System.out.println("Cantidad prestada al banco: " + PrestamoBanco);
        System.out.println("Cantidad a pagar a crédito: " + CreditoFabricante);
        System.out.println("Monto a pagar por intereses: " + Intereses);
    }
}