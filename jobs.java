


/*
 * This Program display jobs for users.
 * Written 12-11-2019
 * Written by fagier Alsadig & Mohamed Abshanab
 */
package javaapplication13;
//import java Scanner Libarary
import java.util.Scanner;
//Tokenizer :use to cut String into small pices
import java.util.StringTokenizer;
public class JavaApplication13 {
    //Main Method
    public static void main(String[] args) {

        //Jops Array Length 10
        String[]jops=new String[10];
        jops[0]="IT Officer@Instaling and maintaing Systems and Applicaion";
        jops[1]="Devolper@Devolop Systems and projects and tsting";
        jops[2]="IT Mannger@Mange the commpany and the works team";
        jops[3]="Accounter@Resbonsible for the commpany Accounting";


        int count =4;
        //Users Whow interact With Systems
         String user="Mohamed";
         String pass="123";
         String useradmin="fagier";
         String passadmin="123";

         //Define object from Scanner
        Scanner scan =new Scanner(System.in);
        while(true)
                    {

             System.out.println("Chose your login type \n 1 for admin \n 2 for user \n 3 for exit");
        int type=scan.nextInt();


             //Define the login choosis
                  switch(type)
               {
        case(1):

               System.out.println("Enter the user name");
               String user1=scan.next();
               System.out.println("Enter the password");
               String pass1=scan.next();

                          if(user1.equals(useradmin) && pass1.equals(passadmin))
                                       {
              while(true)
                {
              System.out.println("Choose from mnue \n  1 for insert \n 2for Exit");
              type =scan.nextInt();
              int braker=0;

          //Define Admin choosise
              switch(type)
                          {
         case(1):
                    System.out.println("Enter the jop name");
                    String jopname=scan.next();
                    System.out.println("Enter the jop Description");
                    String jopdes=scan.next();
                    jops[count]=(jopname+"@"+jopdes);
                    System.out.println("jop added sucsesfuly");
                    count++;
                    break;


        case(2):
                   braker=1;
               }

                if (braker == 1)
            {
                       break;
                                                    }
                                               }
                                    }
        else
                   System.out.println("wrong user or pass1");
                       break;


        case(2):

                   System.out.println("Enter the user name");
                   user1=scan.next();
                   System.out.println("Enter the password");
                   pass1=scan.next();



                  if(user1.equals(user) && pass1.equals(pass))
            {
                   for(int x=0;x<count;x++)
            {
                  StringTokenizer z=new StringTokenizer(jops[x],"@");
                  System.out.println(x+"-"+z.nextToken());
            }
                //the menu of jops import from the Array
                  System.out.println("Chouse jop number");
                    int x=scan.nextInt();
                 StringTokenizer  z=new StringTokenizer(jops[x],"@");
                 z.nextToken();
                 System.out.println(z.nextToken());
                 System.out.println("Do you want to apply for this jop Y/N");
                 String a=scan.next();
                 if(a.equals("y"))
                 System.out.println("your CV is submited sucsefully we will call you soon thank you for using our app");
                            break;
            }


                else
                 System.out.println("Wrong user or pass");
                             break;
       case(3):
               System.exit(0);
        }


    }


    }
}

