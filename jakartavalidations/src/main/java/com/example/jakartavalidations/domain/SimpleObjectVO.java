package com.example.jakartavalidations.domain;


public class SimpleObjectVO {
    private final Integer valueGreatThan;

    private SimpleObjectVO(Integer valueGreatThan) {
        this.valueGreatThan = valueGreatThan;
    }

    public static SimpleObjectVO fromValue(int value) {
        return new SimpleObjectVO(value);
    }

    public boolean isNegative() {
        return valueGreatThan < 0;
    }

    public boolean isPositive() {
        return valueGreatThan > 0;
    }

    @Override
    public String toString() {
        return String.valueOf(valueGreatThan);
    }
}
