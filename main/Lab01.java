/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Adrian.Pirog.Pacman.main;

/**
 *
 * @author adria
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import pl.polsl.Adrian.Pirog.Pacman.model.UserModel;

import java.util.Scanner;

import java.util.Scanner;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import pl.polsl.Adrian.Pirog.Pacman.controller.GameController;
import pl.polsl.Adrian.Pirog.Pacman.model.GameModel;
import pl.polsl.Adrian.Pirog.Pacman.model.UserModel;
import pl.polsl.Adrian.Pirog.Pacman.view.GameView;


/**
 *
 * @author SuperStudent
 */
public class Lab01 {

    public static void main(String[] args) {
        GameView view= new GameView();
        GameModel model= new GameModel();
       // GameController controller=new GameController(model,view);
              GameController controller = new GameController();
		controller.setVisible(true);
		controller.setTitle("Pacman");
		controller.setSize(380,420);
		controller.setDefaultCloseOperation(EXIT_ON_CLOSE);
		controller.setLocationRelativeTo(null);
        
    }

    private static UserModel retriveUser() {
        System.out.println("Enter your name:");
        UserModel user = new UserModel();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        user.setName(name);
        System.out.println("Enter your age:");
        Scanner input2 = new Scanner(System.in);
        int age = input2.nextInt();
        user.setAge(age);
        return user;
    }
}
