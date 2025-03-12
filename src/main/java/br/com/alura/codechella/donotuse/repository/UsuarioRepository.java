package br.com.alura.codechella.donotuse.repository;

import br.com.alura.codechella.donotuse.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
