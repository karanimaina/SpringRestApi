//package com.example.Alex.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "api/vi/user")
//public class UserContoller {
//    private final UserService userService;
//      @Autowired
//    public UserContoller(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping
//    public List<Users> hello(){
//          return userService.getUsers();
//    }
//   @PostMapping
//    public void registerNewUser(@RequestBody Users users){
//          userService.addNewUser(users);
//    }
//
//}
