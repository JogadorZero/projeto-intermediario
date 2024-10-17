package com.exemplo.placar_jogos.service;

import org.springframework.stereotype.Service;
import com.exemplo.placar_jogos.model.Jogo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Service
public class PlacarService {

    private static final String API_SEARCH_URL = "https://sofascore.p.rapidapi.com/search?q=";
    private static final String API_HOST = "sofascore.p.rapidapi.com";
    private static final String API_KEY = "660cb15b8emsh2dc778c7a8ebab1p13a0e0jsna2d62aab87c6";

    public String getJogosBrasileiros() {
        return makeApiRequest("https://sofascore.p.rapidapi.com/tournaments/get-live-events?sport=football");
    }

    public String getJogosPorCampeonato(String campeonato) {
        String apiUrlComCampeonato = API_SEARCH_URL + campeonato + "&type=all&page=0";
        return makeApiRequest(apiUrlComCampeonato);
    }

    // Método para adicionar um jogo, que será chamado no controller
    public String adicionarJogo(Jogo jogo) {
        // Aqui, você pode adicionar a lógica de como processar o jogo.
        // Isso pode ser uma lógica de salvar o jogo em um banco de dados ou qualquer outra coisa.
        return "Jogo adicionado: " + jogo.toString();
    }

    private String makeApiRequest(String url) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", API_KEY);
            headers.set("X-RapidAPI-Host", API_HOST);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

            return response.getBody();
        } catch (Exception e) {
            return "Erro ao obter os jogos: " + e.getMessage();
        }
    }
}
