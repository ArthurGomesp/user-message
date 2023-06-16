package com.Gomes.Comentario.Controllers;

import com.Gomes.Comentario.Model.Message.DadosCadastroMessage;
import com.Gomes.Comentario.Model.Message.DadosListagemMessage;
import com.Gomes.Comentario.Model.Message.Message;
import com.Gomes.Comentario.Repository.MessageRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroMessage dados){
        repository.save(new Message(dados));
    }
    @GetMapping
    public Page<DadosListagemMessage> listar(@PageableDefault(size = 10) Pageable pageable){
        return repository.findAll(pageable).map(DadosListagemMessage::new);
    }
}
