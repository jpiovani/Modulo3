package br.com.modulo3.demo.iclean.dto;

import br.com.modulo3.demo.iclean.entity.Usuario;

public class UsuarioDTO {

    private String login;
    private String senha;

    public UsuarioDTO(){

    }

    public UsuarioDTO(Usuario savedUsuario) {
        setLogin(savedUsuario.getNomeUsuario());
        setSenha(savedUsuario.getSenhaUsuario());
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
