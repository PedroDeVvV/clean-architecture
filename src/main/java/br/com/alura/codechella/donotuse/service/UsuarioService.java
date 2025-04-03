package br.com.alura.codechella.donotuse.service;

import br.com.alura.codechella.infra.persistence.UsuarioEntity;

import java.util.List;

public interface UsuarioService {
    UsuarioEntity cadastrarUsuario(UsuarioEntity usuario);

    List<UsuarioEntity> listarTodos();
}
