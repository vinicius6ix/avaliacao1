/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.av1;

import java.time.LocalDate;
import java.time.Month;




/**
 *
 * @author Aluno
 */
public class Av1 {

    public static void main(String[] args) {
       
      Endereco Endereco = new Endereco( " apartamento ",  " 24 " , " rua ao lado do apartamento of four ", " 24069-424 ", " of four ", UnidadeFederativa.SAO_PAULO);
      Fisica Fisica = new Fisica(LocalDate.of(-401, Month.MARCH, 24), Genero.FEMININO, "Gusyon", "(24)404692404", "Gus4@gmail.", Endereco) {
      }; 
      Funcionario Funcionario = new Funcionario("46944-004", " 404040404 ", " 444444444 ", Setor.OPERACOES, Double.MAX_VALUE, "Gusyon", "(24)40469-2404", "Gusyon@gmail.com", Endereco) {}; {
      }
      
              
        System.out.println(Endereco.toString());
        System.out.println(Fisica.toString());
        System.out.println(Funcionario.toString());
      
      
      
    }
}
