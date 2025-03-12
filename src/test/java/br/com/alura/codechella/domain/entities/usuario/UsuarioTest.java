package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCPFInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Usuario("123.456.789-77", "Pedro", LocalDate.parse("2004-07-19"), "pedro@gmail.com"));
    }
}
