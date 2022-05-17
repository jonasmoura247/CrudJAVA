package com.crud.restapi;

import java.util.List;

import com.crud.restapi.database.RepositoryUsers;
import com.crud.restapi.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserREST {
    @Autowired
    private RepositoryUsers repository;

    @GetMapping
    public List<Users> listar() {
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Users users) {
        repository.save(users);
    }

    @PutMapping
    public void alterar(@RequestBody Users users) {
        if (users.getId() > 0)
            repository.save(users);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
