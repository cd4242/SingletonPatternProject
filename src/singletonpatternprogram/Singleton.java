/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpatternprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Family
 */
public class Singleton {
    //Access point for Singleton
    private static Singleton firstInstance = null;
    
    //Creates an array for the all the lanes for the runners 
    String[] laneNames = {"lane#1","lane#2","lane#3","lane#4","lane#5","lane#6","lane#7","lane#8",};
    private LinkedList<String> laneList = new LinkedList<String> (Arrays.asList(laneNames));
    
    static boolean firstThread = true;
    private Singleton(){}
    //Looking to see if an object was created for Singleton or not 
    public static Singleton getInstance(){
       if(firstInstance == null){
           if(firstThread){
               firstThread = false;
               Thread.currentThread();
               //Slows down thread
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               
               
           }
           
           
           firstInstance = new Singleton();
           
           //Shuffles the lanes so that they around given out randomly
           Collections.shuffle(firstInstance.laneList);
       } 
       return firstInstance;
    } 
    
    //Returns list of all avaialable lanes
    public LinkedList<String> getLaneList(){
        
    return firstInstance.laneList;
    
    }
    //This will get the lanes for the runners
    public LinkedList<String> getLanes(int howManyLanes){
        LinkedList<String> lanesToSend = new LinkedList<String>();
        
        for(int i = 0; i <= howManyLanes; i++){
            //Gets rid of used lanes
            lanesToSend.add(firstInstance.laneList.remove(0));
        }
        return lanesToSend;
    }
}
