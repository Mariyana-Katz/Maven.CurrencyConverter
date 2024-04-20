package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate()/this.getCurrencyType().getRate();
        return result;
    }
    CurrencyType getCurrencyType();
}





