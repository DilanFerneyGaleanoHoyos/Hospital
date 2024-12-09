package com.edu.uptc.hospital.services;

import com.edu.uptc.hospital.entities.UsuarioModel;
import com.edu.uptc.hospital.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<String> findAll() {
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        List<String> lista = new ArrayList<>();
        for (UsuarioModel usuario : usuarios) {
            lista.add(usuario.getNombreUsuario());
        }
        return lista;
    }

    public String findById(Long id) {
        UsuarioModel usuario = usuarioRepository.findById(id).orElse(null);
        return usuario.getNombreUsuario();
    }

    public String save(UsuarioModel usuario) {
        usuarioRepository.save(usuario);
        return usuario.getNombreUsuario();
    }

    public String delete(long id) {
        UsuarioModel usuario = usuarioRepository.findById(id).orElse(null);
        usuarioRepository.delete(usuario);
        return usuario.getNombreUsuario();
    }

    public String update(UsuarioModel usuario) {
        usuarioRepository.save(usuario);
        return usuario.getNombreUsuario();
    }

    public boolean access(String nombreUsuario, String password) {
        UsuarioModel usuario = usuarioRepository.findByNombreUsuario(nombreUsuario);
        if (usuario == null || !usuario.getContrasena().equals(password)) {
            return false;
        }
        return true;
    }

}
