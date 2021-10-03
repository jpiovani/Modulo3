package br.com.modulo3.demo.iclean.repository;

import br.com.modulo3.demo.iclean.entity.Lavanderia;
import br.com.modulo3.demo.iclean.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LavanderiaRepository extends JpaRepository<Lavanderia, Integer> {

    List<Lavanderia> findAllByBairroLavanderiaLike (String bairro);

}
