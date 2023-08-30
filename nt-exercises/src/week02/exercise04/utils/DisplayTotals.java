package week02.exercise04.utils;

import week02.exercise04.interfaces.User;

public class DisplayTotals {

    public void printDetails(User user, double shippingCost, double productValue) {
        double discountValue = user.getDiscountValue(productValue);
        double discountShipping = (shippingCost - user.getDiscountShippingCost(shippingCost, productValue));
        double subtotalShipping = user.getDiscountShippingCost(shippingCost, productValue);
        double subtotalProduct = (productValue - discountValue);
        double totalFinal = (subtotalProduct + discountShipping);

        System.out.println("-----------------------------------");
        System.out.println("Tipo de Usuário:     ( " + user.getUserType() + " )");
        System.out.println("\nValor Produto:       + R$ " + String.format("%.2f", (productValue)));
        System.out.println("Desconto Produto:    - R$ " + String.format("%.2f", (discountValue)));
        System.out.println("Valor Total Produto: + R$ " + String.format("%.2f", (subtotalProduct)));
        System.out.println("\nValor Frete:         + R$ " + String.format("%.2f", (shippingCost)));
        System.out.println("Desconto Frete:      - R$ " + String.format("%.2f", (discountShipping)));
        System.out.println("Valor Total Frete:   + R$ " + String.format("%.2f", (subtotalShipping)));
        System.out.println("\n======> Valor FINAL:   R$ " + String.format("%.2f", (totalFinal)));
        System.out.println("-----------------------------------");
    }
}
