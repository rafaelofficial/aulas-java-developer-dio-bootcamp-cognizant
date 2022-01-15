package com.dio.br.gatos.ex;

public class Temperatura {

    private String meses;
    private Integer temperatura;

    public Temperatura(String meses, Integer temperatura) {
        this.meses = meses;
        this.temperatura = temperatura;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return meses + ", " + temperatura + "°C";
    }
}
