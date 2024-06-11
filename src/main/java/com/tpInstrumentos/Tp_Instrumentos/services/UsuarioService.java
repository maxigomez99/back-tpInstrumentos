package com.tpInstrumentos.Tp_Instrumentos.services;

import com.tpInstrumentos.Tp_Instrumentos.modelo.Usuario;
import com.tpInstrumentos.Tp_Instrumentos.repository.IRolRepository;
import com.tpInstrumentos.Tp_Instrumentos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tpInstrumentos.Tp_Instrumentos.modelo.Role;
import com.tpInstrumentos.Tp_Instrumentos.modelo.UserResponse;
import com.tpInstrumentos.Tp_Instrumentos.util.InvalidCredentialsException;
import org.mindrot.jbcrypt.BCrypt;


import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Autowired
    private IRolRepository rolRepository;

    public Usuario findUserByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public void saveUser(Usuario usuario) {
        String plainPassword = usuario.getPassword();
        String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        usuario.setPassword(hashedPassword);
        usuarioRepository.save(usuario);
    }

    public UserResponse login(String username, String password) {
        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario != null && BCrypt.checkpw(password, usuario.getPassword())) {
            UserResponse userResponse = new UserResponse();
            userResponse.setUsername(usuario.getUsername());
            userResponse.setRole(usuario.getRole().getName());
            return userResponse;
        } else {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }

    public List<Role> findAllRoles() {
        return rolRepository.findAll();
    }
}