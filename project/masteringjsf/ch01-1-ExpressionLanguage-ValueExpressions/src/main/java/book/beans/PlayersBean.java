/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.beans;

import java.util.logging.Logger;
import javax.inject.Named;

/**
 *
 * @author barcvilla
 */
@Named
public class PlayersBean 
{
    private static final Logger logger = Logger.getLogger(PlayersBean.class.getName());
    
    public enum Plays{Left, Right};
    
    private boolean show_prize = false;
    private boolean show_racquet = false;
    private String facebook = null;    
    private String playerName = "Rafael";
    private String playerSurname = "Nadal";
    
    
    //
}
