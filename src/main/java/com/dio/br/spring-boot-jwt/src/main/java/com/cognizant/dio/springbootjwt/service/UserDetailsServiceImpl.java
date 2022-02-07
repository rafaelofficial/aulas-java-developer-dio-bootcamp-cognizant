package com.cognizant.dio.springbootjwt.service;

import com.cognizant.dio.springbootjwt.data.UserData;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDetailsServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserData userData = findUser(userName);
        if (userData == null) throw new UsernameNotFoundException(userName);

        return new User(userData.getUserName(), userData.getPassword(), Collections.emptyList());
    }
    // o Spring localiza o usuario pelo nome. retorna o nome, a senha e uma lista de usuários

    private UserData findUser(String userName) {

        UserData userData = new UserData();
        userData.setUserName("admin");
        userData.setPassword(bCryptPasswordEncoder.encode("nimda"));

        return userData;
    }
    // método responsável por encriptar a senha do usuário

    public List<UserData> listUsers() {

        ArrayList<UserData> list = new ArrayList<>();
        list.add(findUser("admin"));

        return list;
    }
    // criar uma lista de usuários
}
