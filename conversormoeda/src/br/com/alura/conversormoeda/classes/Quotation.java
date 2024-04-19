package br.com.alura.conversormoeda.classes;

public class Quotation {
    String baseCoin;

    String targetCoin;

    double conversion;

    public double getConversion() {
        return conversion;
    }

    public String getTargetCoin() {
        return targetCoin;
    }

    public String getBaseCoin() {
        return baseCoin;
    }

    public Quotation(ConvertJson json) {
        this.baseCoin = json.base_code();
        this.targetCoin = json.target_code();
        this.conversion = json.conversion_rate();
    }
}
