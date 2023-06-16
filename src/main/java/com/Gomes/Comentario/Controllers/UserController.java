package com.Gomes.Comentario.Controllers;


import com.Gomes.Comentario.Model.User.DadosCadastroUser;
import com.Gomes.Comentario.Model.User.DadosListagemUser;
import com.Gomes.Comentario.Model.User.User;
import com.Gomes.Comentario.Repository.UserRepoitory;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepoitory repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroUser dados){
        repository.save(new User(dados));
    }

    @GetMapping
    public Page<DadosListagemUser> listar(@PageableDefault(size = 10)Pageable pageable){
        return repository.findAll(pageable).map(DadosListagemUser::new);
    }
}
