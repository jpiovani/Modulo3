package br.com.modulo3.demo.iclean.entity;

import br.com.modulo3.demo.iclean.dto.UsuarioDTO;

import javax.persistence.*;

@Entity
@Table(name = "TB_Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login_usuario")
    private String nomeUsuario;

    @Column(name = "senha_usuario")
    private String senhaUsuario;

    public Usuario(UsuarioDTO novo){
        setNomeUsuario(novo.getLogin());
        setSenhaUsuario(novo.getSenha());
    }

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
