package com.exemplo.placar_jogos.controller;

import com.exemplo.placar_jogos.service.PlacarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placar")
public class PlacarController {

    private final PlacarService placarService;

    public PlacarController(PlacarService placarService) {
        this.placarService = placarService;
    }

    @GetMapping("/jogos")
    public String getJogosBrasileiros(@RequestParam(required = false) String campeonato) {
        if (campeonato != null && !campeonato.isEmpty()) {
            return placarService.getJogosPorCampeonato(campeonato);
        }
        return placarService.getJogosBrasileiros();
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "{\n" +
                "  \"estudante\": \"Lucas Cardoso Rodrigues\",\n" +
                "  \"projeto\": \"Placar de Jogos\"\n" +
                "}";
    }
}
