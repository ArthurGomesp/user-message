package com.Gomes.Comentario.Model.Message;

public record DadosListagemMessage(String user, String text) {
   public DadosListagemMessage(Message message){
       this(message.getUser(), message.getText());
   }
}
