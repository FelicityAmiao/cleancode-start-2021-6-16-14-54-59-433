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

    public String printReceipt() {
        StringBuilder receipt = new StringBuilder();
        printHeader(receipt);
        printCustomerInfo(receipt);
        printItemsInfo(receipt);
        printTotalSalesTax(receipt, order.calculateTotalSalesTax());
        printTotalAmount(receipt, order.calculateTotalAmount());
        return receipt.toString();
    }

    private void printItemsInfo(StringBuilder receipt) {
        receipt.append(order.getOrderItemsInfo());
    }

    private StringBuilder printTotalAmount(StringBuilder receipt, double totalAmount) {
        return receipt.append(RECEIPT_TOTAL_AMOUNT).append(LINE_ITEM_SEPARATOR).append(totalAmount);
    }

    private StringBuilder printTotalSalesTax(StringBuilder receipt, double totalSalesTax) {
        return receipt.append(RECEIPT_SALES_TAX).append(LINE_ITEM_SEPARATOR).append(totalSalesTax);
    }

    private void printCustomerInfo(StringBuilder receipt) {
        receipt.append(order.getCustomerInfo());
    }

    private StringBuilder printHeader(StringBuilder receipt) {
        return receipt.append(RECEIPT_HEADER);
    }
}
