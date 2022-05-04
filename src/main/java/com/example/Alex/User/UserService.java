//package com.example.Alex.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    private final  UserRepository userRepository;
//@Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    public List<Users> getUsers(){
////        return List.of(new User(1,"karani@gmail.com","1234"));
//   return userRepository.findAll();
//    }
//
//    public void addNewUser(Users users) {
//  Optional<Users> usersByEmail=userRepository.findUsersByEmail(users.getEmail());
//if (usersByEmail.isPresent()){
//    throw new IllegalStateException("email taken");
//}// can add more validations
//
//userRepository.save(users);
//    }
//}
