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
  private List <Person> perosnList = new ArrayList<Person>(); 
  
   
   
   public Authentication(){
        Person person = new Person();
        Person person2 = new Person();
        person.setName("Alex");
        person.setPassword("1234567");
        perosnList.add(person);
        person2.setName("Saman");
        person2.setPassword("1234567");
        perosnList.add(person2);
   }
   
   public boolean checkPerson(String name, String pass){
       
       for(int i = 0; i < perosnList.size(); ++i){
           if(perosnList.get(i).getName().equals(name) && perosnList.get(i).getPassword().equals(pass)){
               return true;
           }
       }
       return false;
   }
    
    
}
