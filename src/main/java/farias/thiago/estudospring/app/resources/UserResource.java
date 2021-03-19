package farias.thiago.estudospring.app.resources;

import farias.thiago.estudospring.entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u1 = new User(null, "Thiago", "thiago@gmail.com",
                        "982733812", "0813");
        return ResponseEntity.ok().body(u1);
    }
}
