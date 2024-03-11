package br.unipar.programacaointernet.servicecep.servicecep.dao;

import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;

import java.util.List;

public interface UsuarioDao {

    void save(Usuario usuario);
    void update(Usuario usuario);
    void delete(Usuario usuario);

    Usuario findById(Long id);
    List<Usuario> findAll();
}
