/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.web.controller;



import co.edu.utp.isc.gia.restuser.service.UserService;
import co.edu.utp.isc.gia.restuser.web.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejo
 */
@RestController
@RequestMapping("user")
public class userController {
  UserService userService;  

    public userController(UserService userService) {
        this.userService = userService;
    }

  
 @PostMapping()
  public UserDto save(UserDto user){
      return userService.save(user);
      }

      
  
  @GetMapping
  public List<UserDto> listAll(){
      return userService.listAll();
      }

  @GetMapping("/{id}")
  public UserDto buscar(@PathVariable("id") Long id){
     return userService.buscar(id);
  }
 @GetMapping("/id")
  public List<UserDto> eliminar(@RequestParam("id") Long id){
   
     return userService.eliminar(id);
  }
  @PostMapping("/actualizar")
   public List<UserDto> actualizar( @RequestParam("id") Long id,@RequestParam("id") String userName,
   @RequestParam("password") String password,@RequestParam("name") String name,@RequestParam("email") String email){
   
     return userService.actualizar(id, userName, password, name, email);
  }
  }


        