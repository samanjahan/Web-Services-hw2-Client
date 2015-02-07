/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.services.hw2.client;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syst3m
 */
public class Authentication {
   List <Person> list = new ArrayList<Person>(); 
   Person person = new Person();
   
   public Authentication(){
        person.setName("Alex");
        person.setPassword("1234567");
        list.add(person);
        person.setName("Saman");
        person.setPassword("1234567");
        list.add(person);
   }
   
   public boolean checkPerson(String name, String pass){
       
       for(int i = 0; i < list.size(); ++i){
           if(list.get(i).getName().equals(name) && list.get(i).getPassword().equals(pass)){
               return true;
           }
       }
       return false;
   }
    
    
}
