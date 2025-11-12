package br.com.gabrielmartim.todolist.user;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

/* Getters e setters para todos atributos, só colocar  @Data
Se for só getter, @Getter, se for Setter @Setter
 */
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;


    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
