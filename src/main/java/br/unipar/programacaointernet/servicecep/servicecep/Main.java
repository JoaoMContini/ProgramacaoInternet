package br.unipar.programacaointernet.servicecep.servicecep;

import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDao;
import br.unipar.programacaointernet.servicecep.servicecep.dao.UsuarioDaoImpl;
import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.servicecep.util.EntityManagerUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{

        }catch(Exception e){
            System.out.println(e);
        }
    }


    private static void buscarTodosUsuarios(){
        UsuarioDao usuarioDao = new UsuarioDaoImpl(
        EntityManagerUtil.getEntityManager());
        List<Usuario> usuarios = usuarioDao.findAll();
        for(Usuario usuario : usuarios){
            System.out.println("Usuario " + usuario.getNome() + "encontrado com sucesso");
        }
    }
}
