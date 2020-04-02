/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.service;

import co.edu.utp.isc.gia.restuser.web.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Alejo
 */
@Service
public class UserService {
 private List<UserDto>users=new ArrayList<>();   
 
 public UserDto save(UserDto user){
     
      user.setId(users.size()+1L);
      for(int i=0;i<users.size();i++){
        if(user.getId()==users.size()){
           user.setUserName(user.getUserName().toLowerCase());
           users.add(user);
            return user;
        }
      }
       user.setId(users.size()+1L);
      user.setUserName(user.getUserName().toLowerCase());
      users.add(user);
      return user;
 }
 
 public List<UserDto> listAll(){
     
     return users;
 }
 
  public UserDto buscar(@PathVariable("id") Long id){
     return users.get(id.intValue()-1);
  }
  
  public List<UserDto> eliminar(
      @RequestParam("numero1") Long id){
   
      int indice=0;
      
      while(users.get(indice).getId()!=id){
          indice++;
          
      }
      users.remove(indice);
  
     return users;
}
}