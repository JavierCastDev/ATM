package com.javiercast.atm;

public record TransactionSummaryDTO() {
    private static String date;
    private static String hour;
    private static String user;
    private static double quantity;
    private static double balanceAfterOperation;
}
