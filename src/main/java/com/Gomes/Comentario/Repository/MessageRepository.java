package com.Gomes.Comentario.Repository;

import com.Gomes.Comentario.Model.Message.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
