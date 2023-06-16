package com.Gomes.Comentario.Repository;

import com.Gomes.Comentario.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoitory extends JpaRepository<User, Long> {
}
