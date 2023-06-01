package com.br.alura.topico;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        StatusTopico status,
        String autor,
        String curso
) {
}
