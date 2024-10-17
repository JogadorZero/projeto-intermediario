package com.exemplo.placar_jogos.controller;

import com.exemplo.placar_jogos.service.PlacarService;
import org.springframework.web.bind.annotation.*;
import com.exemplo.placar_jogos.model.Jogo;

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

    // Adicionando o método POST
    @PostMapping("/adicionar")
    public String adicionarJogo(@RequestBody Jogo jogo) {
        return placarService.adicionarJogo(jogo);
    }
}
