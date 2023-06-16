package com.Gomes.Comentario.Model.User;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUser (@NotBlank String nome, @NotBlank String email){
}
