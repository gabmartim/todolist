package br.com.gabrielmartim.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
