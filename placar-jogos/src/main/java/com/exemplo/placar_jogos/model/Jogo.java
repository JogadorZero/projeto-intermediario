package com.exemplo.placar_jogos.model;

public class Jogo {
    private String timeCasa;
    private String timeVisitante;
    private String campeonato;
    private String data;

    // Getters e Setters

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Jogo [timeCasa=" + timeCasa + ", timeVisitante=" + timeVisitante + ", campeonato=" + campeonato + ", data=" + data + "]";
    }
}
