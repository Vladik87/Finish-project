package com.example.dipolm.service.impl;

import com.example.dipolm.model.entity.User;
import com.example.dipolm.model.repository.UserRepository;
import com.example.dipolm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @PersistenceContext
    private EntityManager em;

    private final UserRepository userRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User findUserById(Integer id) {
        Optional<User> userFromBd = userRepository.findById(id);
        return userFromBd.orElse(new User());
    }

    public List<User> allUser() {
        return userRepository.findAll();
    }

    public boolean saveUser(User user) {
        User userFromBd = userRepository.findByName(user.getName());

        if ( userFromBd != null ) {
            return false;
        }
        user.setEmail("email");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }

    public boolean deleteUser(Integer id) {
        if ( userRepository.findById(id).isPresent() ) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<User> usergtList(Integer idMin) {
        return em.createQuery("SELECT u FROM User u WHERE u.id>:paramId", User.class)
                .setParameter("paramId", idMin).getResultList();
    }


}
