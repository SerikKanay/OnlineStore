package org.example.service;

import org.example.dto.UserDTO;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public String addUser(UserDTO dto) {
        if (!(dto.getPassword().length() > 4)) {
            User user = new User();
            user.setUserName(dto.getUserName());
            user.setUserPassword(dto.getPassword());
            userRepository.save(user);
        }
        return "successful";
    }

    public String register(UserDTO dto, Model model) {
        if (!dto.getUserName().isEmpty() &&
                !dto.getUserEmail().isBlank() &&
                dto.getPassword().length() > 5) {
            User user = new User();
            user.setUserName(dto.getUserName());
            user.setUserEmail(dto.getUserEmail());
            user.setUserPassword(dto.getPassword());
            userRepository.save(user);
            return "success";
        }
        return "Register";

    }
    public String Login(String email, String password ,Model model) {
        User user = userRepository.findByUserEmailAndUserPassword(email, password);
        if ( user!= null && user.getUserEmail().equals(email) && user.getUserPassword().equals(password)) {
            return "index";
        }
        else{
            model.addAttribute("error","Login error");
            return "login";
        }
    }

}
