package br.com.gabrielmartim.todolist.task;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;
/**
 * ID
 * Usuário (ID_USUARIO)
 * Descrição
 * Título
 * Data de ínicio
 * Data de término
 * Prioridade
 *
 */
@Data
@Entity(name="tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime EndAt;
    private String priority;
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
