package com.example.primer_crud.controllers;

import com.example.primer_crud.dao.UsuarioDao;
import com.example.primer_crud.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("Lucasmoy@hotmail.com");
        usuario.setTelefono("21432423");
        return usuario ;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        return usuarioDao.getUsuarios() ;
    }

    @RequestMapping(value = "usuario21")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("Lucasmoy@hotmail.com");
        usuario.setTelefono("21432423");
        return usuario ;
    }

}
