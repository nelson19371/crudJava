package com.example.primer_crud.dao;

import com.example.primer_crud.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaolmp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario"; // Corregir el nombre de la entidad aquí
        List<Usuario> resultado = entityManager.createQuery(query, Usuario.class).getResultList();
        return resultado;
    }
}