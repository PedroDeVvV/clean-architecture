package br.com.alura.codechella.donotuse.service;

import br.com.alura.codechella.donotuse.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
