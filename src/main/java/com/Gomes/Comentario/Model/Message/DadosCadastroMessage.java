package com.Gomes.Comentario.Model.Message;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroMessage(@NotBlank String user, @NotBlank String text) {
}
