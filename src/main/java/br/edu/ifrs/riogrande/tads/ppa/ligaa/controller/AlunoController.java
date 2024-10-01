package br.edu.ifrs.riogrande.tads.ppa.ligaa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// Rotear tudo "que tem a ver" com Aluno

@RestController
public class AlunoController {
   
    // rotear
    @PostMapping(path = "/api/v1/alunos", 
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void novoAluno(@RequestBody NovoAluno aluno) {

        System.out.println(aluno);
    }

    // public void novoAlunoV2(NovoAlunoV2 aluno)
}
