/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejo
 */

@RestController
@RequestMapping("calc")
public class CalculadoraController {
     
       
 @GetMapping("/suma")
 public int suma(
      @RequestParam("numero1") int numero1,
      @RequestParam("numero2") int numero2){
      int resultado=numero1+numero2;
        return resultado;
    } 
 @GetMapping("/resta")
 public int resta(
      @RequestParam("numero1") int numero1,
      @RequestParam("numero2") int numero2){
      int resultado=numero1-numero2;
        return resultado;
    } 
  
  @GetMapping("/multiplicacion")
  public int multiplicacion(
      @RequestParam("numero1") int numero1,
      @RequestParam("numero2") int numero2){
      int resultado=numero1*numero2;
        return resultado;
    } 
  @GetMapping("/division")
  public int division(
      @RequestParam("numero1") int numero1,
      @RequestParam("numero2") int numero2){
      int resultado=numero1/numero2;
        return resultado;
    } 
}
