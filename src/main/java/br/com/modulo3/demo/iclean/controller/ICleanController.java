package br.com.modulo3.demo.iclean.controller;

import br.com.modulo3.demo.iclean.dto.LavanderiaDTO;
import br.com.modulo3.demo.iclean.dto.UsuarioDTO;

import br.com.modulo3.demo.iclean.service.ICleanService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.PushBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("lavanderias")
public class ICleanController {

    private ICleanService service;

    public ICleanController(ICleanService service){
        this.service = service;
    }

    @GetMapping
    public List<LavanderiaDTO> getLavanderiaByBairro(
            @RequestParam(required = false, value = "bairroLavanderia") String bairroLavanderia){

        return service.buscaByBairro(bairroLavanderia);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LavanderiaDTO criar(@RequestBody LavanderiaDTO nova){
        return service.criarLavanderia(nova);
    }

    @PostMapping(value = "/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO create(@RequestBody UsuarioDTO novo){

        return service.criarusuario(novo);
    }

}
