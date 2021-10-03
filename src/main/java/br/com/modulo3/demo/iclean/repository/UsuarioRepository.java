package br.com.modulo3.demo.iclean.repository;

import br.com.modulo3.demo.iclean.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
