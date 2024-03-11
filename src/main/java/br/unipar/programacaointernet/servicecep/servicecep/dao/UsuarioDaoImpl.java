package br.unipar.programacaointernet.servicecep.servicecep.dao;

import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.servicecep.util.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {

    private EntityManager em = EntityManagerUtil.getEntityManager();

    public UsuarioDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Usuario usuario) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(usuario);
        transaction.commit();
        System.out.println("Usuário " + usuario.getNome() + "salvo com sucesso!");
    }

        @Override
        public void update (Usuario usuario){

        }

        @Override
        public void delete (Usuario usuario){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(usuario);
            transaction.commit();
            System.out.println("Usuario " + usuario.getNome() + "removido com sucesso!");
        }

        @Override
        public Usuario findById (Long id){

        return em.find(Usuario.class, id);
        }

        @Override
        public List<Usuario> findAll () {


        return em.createQuery("select u from Usuario u", Usuario.class).getResultList();
        }
    }

