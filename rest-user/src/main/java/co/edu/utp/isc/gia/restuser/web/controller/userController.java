/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.web.controller;

//entraga numero 3

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
@GetMapping("/eliminar")
  public void eliminar(@RequestParam("id") Long id){
   userService.eliminar(id);
  }
  
 @PostMapping()
  public UserDto save(UserDto user){
      return userService.save(user);
      
      }

      
  
  @GetMapping("/listar")
     public List<UserDto> findAll(){
       return userService.findAll();
      }

   @GetMapping("/buscar")
   public UserDto buscar(@RequestParam("id") Long id){
    return userService.buscar(id);
  }
  }


        