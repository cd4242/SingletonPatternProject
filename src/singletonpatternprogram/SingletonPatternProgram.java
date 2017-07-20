/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpatternprogram;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Family
 */
public class SingletonPatternProgram{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);   
     
      
      //Gets the Singleton instance 
      Singleton newInstance = Singleton.getInstance();
      
      //Creates a new instance for getting a lane for runner one
      LinkedList<String> runnerOnesLane = newInstance.getLanes(0);
      
      //Allows user to enter runner one's name
      System.out.println("Enter runner one's name:");
      String runnerOne = scan.nextLine();
      
      Singleton instanceTwo = Singleton.getInstance();
    
      LinkedList<String> runnerTwosLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner two's name:");
      String runnerTwo = scan.nextLine();
      
      Singleton instanceThree = Singleton.getInstance();
      
      LinkedList<String> runnerThreesLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner three's name:");
      String runnerThree = scan.nextLine();
      
      Singleton instanceFour = Singleton.getInstance();
      
      LinkedList<String> runnerFoursLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner four's name:");
      String runnerFour = scan.nextLine();
      
      Singleton instanceFive = Singleton.getInstance();
      
      LinkedList<String> runnerFivesLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner five's name:");
      String runnerFive = scan.nextLine();
      
      Singleton instanceSix = Singleton.getInstance();
      
      LinkedList<String> runnerSixsLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner six's name:");
      String runnerSix = scan.nextLine();
      
      Singleton instanceSeven = Singleton.getInstance();
      
      LinkedList<String> runnerSevensLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner seven's name:");
      String runnerSeven = scan.nextLine();
      
      Singleton instanceEight = Singleton.getInstance();
      
      LinkedList<String> runnerEightsLane = newInstance.getLanes(0);
      
      System.out.println("Enter runner eight's name:");
      String runnerEight = scan.nextLine();
      
      System.out.println("");
      
      //Prints out list of runners and their lanes 
      System.out.println("Runners and Lanes");
      System.out.println(runnerOne +" - "+ runnerOnesLane);
      System.out.println(runnerTwo +" - "+ runnerTwosLane);
      System.out.println(runnerThree +" - "+ runnerThreesLane);
      System.out.println(runnerFour +" - "+ runnerFoursLane);
      System.out.println(runnerFive +" - "+ runnerFivesLane);
      System.out.println(runnerSix +" - "+ runnerSixsLane);
      System.out.println(runnerSeven +" - "+ runnerSevensLane);
      System.out.println(runnerEight +" - "+ runnerEightsLane);
      
     
    
    
    
    }
    
 }




//References
//Banas, D. (2012). Singleton Design Pattern Tutorial . Retrieved from 
//https://www.youtube.com/watch?v=NZaXM67fxbs 