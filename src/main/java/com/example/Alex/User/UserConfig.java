//package com.example.Alex.User;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class UserConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(
//            UserRepository repository){
//       return  args -> {
//           Users james  = new Users(
//                   "james@gmail.com",
//                   "123456"
//           );
//           Users Oliver  = new Users(
//                   "olives@gmail.com",
//                   "123456"
//           );
//           Users alex  = new Users(
//                   "alex@gmail.com",
//                   "123456"
//           );
//           repository.saveAll(
//                   List.of(james, Oliver, alex)
//           );
//
//       };
//    }
//
//}
