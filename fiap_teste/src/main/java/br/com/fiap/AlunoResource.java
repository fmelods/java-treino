package br.com.fiap;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;

@Path("alunos")
public class AlunoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response recuperaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Felipe Melo");
        aluno.setRm(556099);
        aluno.setDataAdmissao(LocalDate.of(2024, 02, 01));
        aluno.setEmail("rm556099@fiap.com.br");
        return Response.ok(aluno).build();
    }

}
