/*
ELizabeth Price
Assignment #4
02/18/18
*/

import java.util.Random;     
import java.util.Scanner;    

public class HiLo {


    public static void main(String[] args){

        final int MAX_RAND = 100;

        int guess = 0;
        int answer, numberOfTries = 0;
        

        String again = "";
        String done = "";
       
       
        Random rand = new Random();

        Scanner scan = new Scanner(System.in);

             do{

                    System.out.println("I am thinking of a number between 1 and " + MAX_RAND + ", can you guess what it is? (enter -1 to exit)");
            
                     answer = rand.nextInt(MAX_RAND) +1;

                    do{
                        
                            guess = scan.nextInt();

                        

                            if (guess > MAX_RAND){
                                
                                System.out.println("Out of range, Try again");
                            }else if(guess < 0){

                                System.out.println("Out of range, Try again");
                            }
                                
                            else if(guess > answer)
                            {
                                System.out.println("Too High, sorry guess again ");

                            }
                            
                            else  if (guess < answer)
                            {
                                System.out.println("Too Low, sorry guess again");
                                
                            } 

                             if(guess == -1){

                                System.out.println("Would you like to exit(y/n)");
                                done = scan.next();

                                if(done.equalsIgnoreCase ("Y")){

                                    System.out.println("Thank you for playing");
                                    break;
                                    
                            }
                        }

                            numberOfTries++;

                    }while (guess != answer);

                    if (done.equalsIgnoreCase ("Y")){

                            System.out.println();    
                            System.out.println("play again?(y/n)");
                            done = scan.next();

                    }

                    if (guess == answer)
                        {
                        
                            System.out.println("YOU WIN!!!");
                            System.out.println("It took you "+ numberOfTries + " tries to guess the number");

                            System.out.println();    
                            System.out.println("play again?(y/n)");
                            again = scan.next();
                    
                    
                        }

                    numberOfTries = 0;


                        
                    
                        
              }while(again.equalsIgnoreCase ("Y") || (done.equalsIgnoreCase("y")));

          

    }
    
    
}