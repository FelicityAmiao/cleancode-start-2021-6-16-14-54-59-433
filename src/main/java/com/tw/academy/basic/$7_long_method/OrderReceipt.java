package com.tw.academy.basic.$7_long_method;

import static com.tw.academy.basic.$7_long_method.LineItem.LINE_ITEM_SEPARATOR;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {

    public static final String RECEIPT_HEADER = "======Printing Orders======\n";
    public static final String RECEIPT_SALES_TAX = "Sales Tax";
    public static final String RECEIPT_TOTAL_AMOUNT = "Total Amount";
    public static final double TAX_RATE = .10;
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String buildReceipt() {
        StringBuilder receipt = new StringBuilder();
        buildHeader(receipt);
        buildCustomerInfo(receipt);
        buildItemsInfo(receipt);
        buildTotalSalesTax(receipt, order.calculateTotalSalesTax());
        buildTotalAmount(receipt, order.calculateTotalAmount());
        return receipt.toString();
    }

    private void buildItemsInfo(StringBuilder receipt) {
        receipt.append(order.getOrderItemsInfo());
    }

    private StringBuilder buildTotalAmount(StringBuilder receipt, double totalAmount) {
        return receipt.append(RECEIPT_TOTAL_AMOUNT).append(LINE_ITEM_SEPARATOR).append(totalAmount);
    }

    private StringBuilder buildTotalSalesTax(StringBuilder receipt, double totalSalesTax) {
        return receipt.append(RECEIPT_SALES_TAX).append(LINE_ITEM_SEPARATOR).append(totalSalesTax);
    }

    private void buildCustomerInfo(StringBuilder receipt) {
        receipt.append(order.getCustomerInfo());
    }

    private StringBuilder buildHeader(StringBuilder receipt) {
        return receipt.append(RECEIPT_HEADER);
    }
}
