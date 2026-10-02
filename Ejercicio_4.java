public class Ejercicio_4{
    public static void main(String[] args) {
        int valortotalcompra;
        Double descuento;
        Double totalpagar;
        System.out.println("Digite el valor total de la compra:");
        valortotalcompra = Integer.parseInt(System.console().readLine());
    descuento = Double.parseDouble(String.valueOf(valortotalcompra * 0.15));
        totalpagar = valortotalcompra - descuento;
        System.out.println("El total a pagar es: " + totalpagar);
    }
}