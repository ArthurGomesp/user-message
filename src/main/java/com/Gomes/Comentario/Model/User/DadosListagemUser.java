package com.Gomes.Comentario.Model.User;

public record  DadosListagemUser(String nome, String email) {
    public DadosListagemUser(User user){
        this(user.getName(), user.getEmail());
    }
}
