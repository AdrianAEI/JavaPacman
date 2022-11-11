/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.Adrian.Pirog.Pacman.controller;

import javax.swing.JFrame;
import pl.polsl.Adrian.Pirog.Pacman.model.GameModel;
import pl.polsl.Adrian.Pirog.Pacman.view.GameView;

/**
 *
 * @author adria
 */
public class GameController extends JFrame {
    private GameModel model;
    private GameView view;
    public GameController(GameModel model,GameView view)
    {
        this.model=model;
        this.view=view;
    }
    public GameController()
    {
        add(new GameModel());
    }
}
