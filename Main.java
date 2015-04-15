package com.company;

public class Main {

    public static void main(String[] args) {
	    // Testing YFinancier Class
        YFinancier yf = new YFinancier("AAPL", "AAPL_stock_info.csv");
        System.out.println("Stock symbol is: " + yf.getStockSymbol());
        System.out.println("URL String is: " + yf.createURLString("14", "03", "2015"));
        yf.downloadFile();
    }
}
