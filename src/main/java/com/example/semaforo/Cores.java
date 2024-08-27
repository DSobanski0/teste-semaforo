package com.example.semaforo;

public enum Cores {

    VERMELHO("vermelho"),
    AMARELO("amarelo"),
    VERDE("verde");

    private final String value;

    Cores(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
