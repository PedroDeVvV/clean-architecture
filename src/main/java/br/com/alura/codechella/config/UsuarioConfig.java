package br.com.alura.codechella.config;


import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.application.usecases.AlterarUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ExcluirUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioJPA;
import br.com.alura.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//classe de confugiração necessária para injetar dependências, já que a ideia é ser agnóstico de frameworks
@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorio) {
        return new CriarUsuario(repositorio);
    }

    @Bean
    RepositorioDeUsuario criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        return new RepositorioDeUsuarioJPA(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper() {
        return new UsuarioEntityMapper();
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioDeUsuario repositorio) {
        return new ListarUsuarios(repositorio);
    }

    @Bean
    AlterarUsuario alteraUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new AlterarUsuario(repositorioDeUsuario);
    }

    @Bean
    ExcluirUsuario excluiUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new ExcluirUsuario(repositorioDeUsuario);
    }
}
