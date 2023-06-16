package com.Gomes.Comentario.Model.Message;

import com.Gomes.Comentario.Model.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "message")

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Message {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String text;

    public Message(DadosCadastroMessage dados) {
        this.user = dados.user();
        this.text =dados.text();
    }
}
