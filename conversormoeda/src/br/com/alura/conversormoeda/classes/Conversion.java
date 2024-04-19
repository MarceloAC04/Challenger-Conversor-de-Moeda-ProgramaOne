package br.com.alura.conversormoeda.classes;

import java.io.IOException;
import java.util.Scanner;

public class Conversion {

    public static void getConvertValue(String coinToConvert, String convertedCoin, double readValue) throws IOException, InterruptedException {
        Quotation quotation = new Quotation(ExchangeApi.getExchange(coinToConvert, convertedCoin));
        double currentValue = (readValue * quotation.conversion);
        System.out.println(readValue + " " + quotation.baseCoin + " equivale a "
                + String.format("%.2f", currentValue) + " " + quotation.targetCoin + " na cotação atual");
        System.out.println("Aperte enter para continuar");
        System.in.read();
    }
}
