package br.com.gabrielmartim.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080 ------------
//Sempre que colocar o localhost/8080/primeiraRota, ele vai entrar nessa controller e acessar o metodo definido.
public class PrimeiraController {
    /**
     * Métodos de acesso do HTTP (De requisição)
     * - GET: Buscar uma informação
     * - Post: adicionar um dado/informação
     * - Put: Alterar um dado/informação
     * - Delete: Remover um dado/informação
     * - Patch: Alterar somente uma parte do dado/informação
     *
     */
    // Metodo (funcioonalidade)de uma classe
    @GetMapping("/primeirometodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
