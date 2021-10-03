package br.com.modulo3.demo.iclean.service;

import br.com.modulo3.demo.iclean.dto.LavanderiaDTO;
import br.com.modulo3.demo.iclean.dto.UsuarioDTO;

import java.util.List;

public interface ICleanService {

    List<LavanderiaDTO> buscaByBairro(String bairro);

    LavanderiaDTO criarLavanderia(LavanderiaDTO nova);

    UsuarioDTO criarusuario (UsuarioDTO novo);
}
