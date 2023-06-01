package com.br.alura.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroTopico(
        @NotBlank(message = "{titulo.not.blank}" )
        String titulo,
        @NotBlank(message = "{mensagem.not.blank}" )
        String mensagem,
        @NotBlank(message = "{autor.not.blank}" )
        String autor,
        @NotNull(message = "{curso.not.blank}" )
        String curso) {
}
