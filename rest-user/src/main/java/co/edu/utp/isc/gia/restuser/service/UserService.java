/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.service;

import co.edu.utp.isc.gia.restuser.data.entity.User;
import co.edu.utp.isc.gia.restuser.data.repository.UserRepository;
import co.edu.utp.isc.gia.restuser.web.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Alejo
 */
@Service
public class UserService {
 //private List<UserDto>users=new ArrayList<>();   
 private UserRepository userRepository;
 private ModelMapper modelMapper;
    public UserService(UserRepository userRepository,ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper=modelMapper;
        
    }
 
 
 
 public UserDto save(UserDto user){
    
    User myUser=modelMapper.map(user,User.class);
     myUser= userRepository.save(myUser);
     UserDto resp=modelMapper.map(myUser,UserDto.class);
     System.out.println(resp.getId());
    
      return resp;
 }

   
  
 public List<UserDto> findAll(){
     int cont=0;
     List<UserDto>listaUsuarios=new ArrayList<>();
     Iterable<User>u=this.userRepository.findAll();
     
     for(User i: u){
         
     listaUsuarios.add(modelMapper.map(i,UserDto.class));
     }
     while(cont!=2){
         System.out.println(cont++);
     }
             
     return listaUsuarios;
 }
 
  public UserDto buscar(Long id){
      int con=0;
   
   List<UserDto>listaUsuarios=new ArrayList<>();
   Iterable<User>u=this.userRepository.findAll();
    for(User i: u){
         
     listaUsuarios.add(modelMapper.map(i,UserDto.class));
     
     }
    while(listaUsuarios.get(con).getId()!=id){
        con++;
    }
    
    return listaUsuarios.get(con);
  }
  public void eliminar(Long id){
   
   userRepository.deleteById(id);
}
  public List<UserDto> actualizar(){
        
      return null;
  
}
}