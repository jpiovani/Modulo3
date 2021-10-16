package br.com.modulo3.demo.iclean.controller;

import br.com.modulo3.demo.iclean.dto.LavanderiaDTO;
import br.com.modulo3.demo.iclean.dto.UsuarioDTO;

import br.com.modulo3.demo.iclean.service.ICleanService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("lavanderias/v1")
public class ICleanController {

    private ICleanService service;

    public ICleanController(ICleanService service){
        this.service = service;
    }

    @CrossOrigin
    @GetMapping
    public List<LavanderiaDTO> getLavanderiaByBairro(
            @RequestParam(required = false, value = "bairroLavanderia") String bairroLavanderia){

        return service.buscaByBairro(bairroLavanderia);

    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LavanderiaDTO criar(@RequestBody LavanderiaDTO nova){
        return service.criarLavanderia(nova);
    }

    @CrossOrigin
    @PostMapping(value = "/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO novo){

        return service.criarusuario(novo);
    }

}
