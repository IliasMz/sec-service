package org.sid.secservice.sec;

import org.sid.secservice.sec.entities.AppRoles;
import org.sid.secservice.sec.entities.AppUser;
import org.sid.secservice.sec.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecServiceApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner start(AccountService accountService){
        return args -> {
        accountService.addNewRole(new AppRoles(null,"USER"));
        accountService.addNewRole(new AppRoles(null,"ADMIN"));
        accountService.addNewRole(new AppRoles(null,"SousAdmin"));
        accountService.addNewRole(new AppRoles(null,"SuperAdmin"));
        accountService.addNewUser(new AppUser(null,"user1","1234",new ArrayList<>()));
        accountService.addNewUser(new AppUser(null,"user2","1234",new ArrayList<>()));
        accountService.addNewUser(new AppUser(null,"user3","1234",new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"admin","1234",new ArrayList<>()));

        accountService.addRoleToUser("user1","USER");
            accountService.addRoleToUser("admin","USER");
            accountService.addRoleToUser("admin","ADMIN");
        accountService.addRoleToUser("user2","SousAdmin");
            accountService.addRoleToUser("user2","USER");
        accountService.addRoleToUser("user3","SuperAdmin");
            accountService.addRoleToUser("user3","USER");
        };

    }

}
