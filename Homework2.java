//Kevin Singh
//CSI 310
//Homework 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Homework2{
  public static void main(String[] args){ 
    //Variables.
    Node<String> head = new Node<String>(null);
    Node<String> print = new Node<String>(null);
    String myWords[];
    
    
    //Creates a new scanner object named "scan", to take users input.
    Scanner scan = new Scanner(System.in);
    //Prompts user for a file name.
    System.out.print("Input filename: ");
    //Stores the file in string "fileName".
    String fileName= scan.nextLine();
    //Try & Catch to account for the exception being thrown.
    try{
      //Creates a scanner object "reader", to read the file passed. 
      Scanner reader = new Scanner(new File(fileName));
      //Iterates through the file and checks for the last line. 
      while(reader.hasNextLine()){
        //Stores the current line in String "line".
        String line = reader.nextLine();
        //Converts current line to all lowercase letters.
        line = line.toLowerCase();
        //Stores each indivual word in a string array.
        String[] words = line.split("\\s+");
        //create a list from String array
        List<String> list = Arrays.asList(words);
        //reverse the list using Collections.reverse method
        Collections.reverse(list);
        //convert the list back to String array
        words = (String[]) list.toArray();
        
        //Iterates though the String array "words".
        for(int i = 0;i < words.length; i++){ 
            Node<String> newHead = new Node<String>(words[i]);
            newHead.setNext(head);
            head = newHead;
            //System.out.println(word.getData());   
        }
        //System.out.println(head.getData());  
      }
      reader.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println("Would you like a 'summary' or 'delete' ?");
    String response = scan.nextLine();
    response = response.toLowerCase();
    
    if(response.equals("summary")){
      for(Node<String> n = head; n.getNext() != null; n = n.getNext()){
        
      }
      
      System.out.println("Summary:");
    }
    else if(response.equals("delete")){
      System.out.println("What word would you like to be removed from this text.");
      String word = scan.nextLine();
      response = response.toLowerCase();
      for(Node<String> n = head; n.getNext() != null; n = n.getNext()){
        if(n.getData().equals(word)){
          n.setNext(n.getNext().getNext());
        }
        print = n;
      }
      System.out.println(print.getData());
      
      
    }
    else{
      System.out.println("Not a vaild answer please try again.");
    }                   
    
   scan.close();
   
  } 
}