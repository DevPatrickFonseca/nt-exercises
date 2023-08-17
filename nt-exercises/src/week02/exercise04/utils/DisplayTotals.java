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
        System.out.println("\nValor Produto:       + R$ " + productValue);
        System.out.println("Desconto Produto:    - R$ " + discountValue);
        System.out.println("Valor Total Produto: + R$ " + subtotalProduct);
        System.out.println("\nValor Frete:         + R$ " + shippingCost);
        System.out.println("Desconto Frete:      - R$ " + discountShipping);
        System.out.println("Valor Total Frete:   + R$ " + subtotalShipping);
        System.out.println("\n======> Valor FINAL:   R$ " + totalFinal);
        System.out.println("-----------------------------------");
    }
}
