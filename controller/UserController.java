/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pl.polsl.Adrian.Pirog.Pacman.controller;

import pl.polsl.Adrian.Pirog.Pacman.model.UserModel;
import pl.polsl.Adrian.Pirog.Pacman.view.UserView;

/**
 *
 * @author SuperStudent
 */
public class UserController {
    private UserModel model;
    private UserView view;
  
    public UserController(UserModel model, UserView view)
    {
        this.model = model;
        this.view = view;
    }
  
    public void setUserName(String name)
    {
        model.setName(name);        
    }
  
    public String getUserName()
    {
        return model.getName();        
    }
  
    public void setUserAge(int age)
    {
        model.setAge(age);
    }
  
    public int getUserAge()
    {
        return model.getAge();        
    }
  
    public void updateView()
    {                
        view.printUser(model.getName(), model.getAge());
    }    
}
