/*
 * f1MockSeasonApp
 * This application creates a grid of 19 other drivers + yourself. Then it will ask 
 * you to plug in your results. In the end, it will tell you where you placed on the grid at the
 * end of the season.
 * updates: realistic points for other drivers, orders the grid properly. 
 */

import java.util.Scanner;
import java.util.Random;

public class f1MockSeasonApp
{
  public static void main (String [] args)
  { 
    Scanner input = new Scanner(System.in);
    Random r = new Random ();
    int youTotal = 0, youPoints = 0, place =0, cont =0;
    int max = 0, per = 0, ham = 0, rus = 0, nor = 0, pia = 0, lec = 0, sia = 0, alo = 0;
    String yon = "";
    
    System.out.println("Welcome to the 2025 F1 season! This season is a little different. Only the 2024 Red Bull, Mercedes, McLaren, Ferrari, and Aston Martin drivers are allowed to drive!.");
    System.out.println("The season is only 5 Grand Prixs. Points are rewarded 1-10 (10 being 1st, 1 being last). You have taken Lance Stroll's seat, how did you perform this season?");
    
    do{
    System.out.println("How did you perform in the Bahrain Grand Prix?");
    youPoints = input.nextInt();
    if(youPoints > 10 || youPoints < 0)
    {
      System.out.println("Invalid placement. Please try again.");
    }
    else
    {
      System.out.println("Did you get the fastest lap in the Grand Prix?");
      yon = input.next();
      if(yon.equalsIgnoreCase("yes"))
      {
       switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
       cont = 1;
      }
      else
      {
        switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
        cont = 1;
      }
    }
    }while(cont == 0);
    cont = 0;
    do{
    System.out.println("How did you perform in the Monaco Grand Prix?");
    youPoints = input.nextInt();
    if(youPoints > 10 || youPoints < 0)
    {
      System.out.println("Invalid placement. Please try again.");
    }
    else
    {
      System.out.println("Did you get the fastest lap in the Grand Prix?");
      yon = input.next();
      if(yon.equalsIgnoreCase("yes"))
      {
       switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
       cont = 1;
      }
      else
      {
        switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
        cont = 1;
      }
    }
    }while(cont == 0);
    cont = 0;
    do{
    System.out.println("How did you perform in the Canadian Grand Prix?");
    youPoints = input.nextInt();
    if(youPoints > 10 || youPoints < 0)
    {
      System.out.println("Invalid placement. Please try again.");
    }
    else
    {
      System.out.println("Did you get the fastest lap in the Grand Prix?");
      yon = input.next();
      if(yon.equalsIgnoreCase("yes"))
      {
       switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
       cont = 1;
      }
      else
      {
        switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
        cont = 1;
      }
    }
    }while(cont == 0);
    cont = 0;
    do{
    System.out.println("How did you perform in the British Grand Prix?");
    youPoints = input.nextInt();
    if(youPoints > 10 || youPoints < 0)
    {
      System.out.println("Invalid placement. Please try again.");
    }
    else
    {
      System.out.println("Did you get the fastest lap in the Grand Prix?");
      yon = input.next();
      if(yon.equalsIgnoreCase("yes"))
      {
       switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
       cont = 1;
      }
      else
      {
        switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
        cont = 1;
      }
    }
    }while(cont == 0);
    cont = 0;
    do{
    System.out.println("How did you perform in the Abu Dhabi Grand Prix?");
    youPoints = input.nextInt();
    if(youPoints > 10 || youPoints < 0)
    {
      System.out.println("Invalid placement. Please try again.");
    }
    else
    {
      System.out.println("Did you get the fastest lap in the Grand Prix?");
      yon = input.next();
      if(yon.equalsIgnoreCase("yes"))
      {
       switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
       cont = 1;
      }
      else
      {
        switch(youPoints)
       {
         case 1: youTotal += 11; break;
         case 2: youTotal += 10; break;
         case 3: youTotal += 9; break;
         case 4: youTotal += 8; break;
         case 5: youTotal += 7; break;
         case 6: youTotal += 6; break;
         case 7: youTotal += 5; break;
         case 8: youTotal += 4; break;
         case 9: youTotal += 3; break;
         case 10: youTotal += 2; break;
       }
        cont = 1;
      }
    }
    }while(cont == 0);
    cont = 0;
    max = r.nextInt(46) + 10;
    per = r.nextInt(46) + 10;
    ham = r.nextInt(46) + 10;
    rus = r.nextInt(46) + 10;
    nor = r.nextInt(46) + 10;
    pia = r.nextInt(46) + 10;
    lec = r.nextInt(46) + 10;
    sia = r.nextInt(46) + 10;
    alo = r.nextInt(46) + 10;
    place = 10;
    //display other drivers results
    System.out.println("Max Verstappen: " + max + " points.");
    
    //compare points
    if(youTotal > max)
    {
      place--;
    }
    
    System.out.println("Sergio Perez: " + per + " points.");
    if(youTotal > per)
    {
      place--;
    }
    System.out.println("Lewis Hamilton: " + ham + " points.");
    if(youTotal > ham)
    {
      place--;
    }
    System.out.println("George Russell: " + per + " points.");
    if(youTotal > rus)
    {
      place--;
    }
    System.out.println("Lando Norris: " + nor + " points.");
    if(youTotal > per)
    {
      place--;
    }
    System.out.println("Oscar Piastri: " + pia + " points.");
    if(youTotal > per)
    {
      place--;
    }
    System.out.println("Charles Leclerc: " + lec + " points.");
    if(youTotal > per)
    {
      place--;
    }
    System.out.println("Carlos Sainz: " + per + " points.");
    if(youTotal > sia)
    {
      place--;
    }
    System.out.println("Fernando Alonso: " + per + " points.");
    if(youTotal > alo)
    {
      place--;
    }
    
    System.out.println("You had " + youTotal + " points this season!");
    System.out.println("You placed " + place + " this season!");
    
    
  }
}
         