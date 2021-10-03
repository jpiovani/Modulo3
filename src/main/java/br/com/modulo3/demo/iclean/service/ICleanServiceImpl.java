package br.com.modulo3.demo.iclean.service;

import br.com.modulo3.demo.iclean.dto.LavanderiaDTO;
import br.com.modulo3.demo.iclean.dto.UsuarioDTO;
import br.com.modulo3.demo.iclean.entity.Lavanderia;
import br.com.modulo3.demo.iclean.entity.Usuario;
import br.com.modulo3.demo.iclean.repository.LavanderiaRepository;
import br.com.modulo3.demo.iclean.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ICleanServiceImpl implements ICleanService {

    private final LavanderiaRepository lavanderiaRepository;
    private final UsuarioRepository usuarioRepository;

    public ICleanServiceImpl(LavanderiaRepository lavanderiaRepository, UsuarioRepository usuarioRepository) {
        this.lavanderiaRepository = lavanderiaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<LavanderiaDTO> buscaByBairro(String bairro) {
        List<Lavanderia> lista;
        if(bairro != null){
            lista = lavanderiaRepository.findAllByBairroLavanderiaLike("%" + bairro + "%");
        }else{
            lista = lavanderiaRepository.findAll();
        }

        return lista.stream().map(lavanderia -> new LavanderiaDTO(lavanderia)).collect(Collectors.toList());
    }

    @Override
    public LavanderiaDTO criarLavanderia(LavanderiaDTO nova) {
        Lavanderia lavanderia = new Lavanderia(nova);
        Lavanderia savedLavanderia = lavanderiaRepository.save(lavanderia);
        return new LavanderiaDTO(savedLavanderia);
    }

    @Override
    public UsuarioDTO criarusuario(UsuarioDTO novo) {
        Usuario usuario = new Usuario(novo);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return new UsuarioDTO(savedUsuario);
    }
}
