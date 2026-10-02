public class Ejercicio_28 {

    public static void main(String[] args) {

        double Compra;
        double FondosEmpresa;
        double PrestamoBanco;
        double CreditoFabricante;
        double Intereses;

        System.out.println("Digite el monto total de la compra:");
        Compra = Double.parseDouble(System.console().readLine());

        if (Compra > 500000) {

            FondosEmpresa = Compra * 0.55;
            PrestamoBanco = Compra * 0.30;
            CreditoFabricante = Compra * 0.15;

        } else {

            FondosEmpresa = Compra * 0.70;
            PrestamoBanco = 0;
            CreditoFabricante = Compra * 0.30;
        }

        Intereses = CreditoFabricante * 0.20;

        System.out.println("Cantidad a invertir de los fondos de la empresa: " + FondosEmpresa);
        System.out.println("Cantidad prestada al banco: " + PrestamoBanco);
        System.out.println("Cantidad a pagar a crédito: " + CreditoFabricante);
        System.out.println("Monto a pagar por intereses: " + Intereses);
    }
}