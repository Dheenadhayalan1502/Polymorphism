
package busticketbooking;

import java.util.Scanner;
public class BusTicketBooking 
{

   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Transport ts=null;
        while(true)
        {
            System.out.println("**************************");
            System.out.println("1.City Bus Booking");
            System.out.println("2.Luxury Bus Booking");
            System.out.println("3.Calculate Fare");
            System.out.println("4.Display ticket Details");
            System.out.println("5.exit");
            System.out.println("**************************");
            int choise=sc.nextInt();
            switch(choise)
            {
                case 1:
                {
                   ts=new CityBus();
                    System.out.println("enter your name :");
                    ts.name=sc.nextLine();
                    System.out.println("enter your id :");
                    ts.id=sc.nextByte();
                    
                    System.out.println("====================");
                    System.out.println("Select Route");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");
                    System.out.println("enete your option ");
                    int option=sc1.nextInt();
                    switch(option)
                    {
                        case 1:
                        {
                            ts.from="chennai";
                            ts.to="bangalore";
                            ts.distance=350;
                            break;
                                   
                        }
                        case 2:
                        {
                            ts.from="chennai";
                            ts.to="coimbatore";
                            ts.distance=500;
                            break;
                            
                        }
                        case 3:
                        {
                           ts.from="chennai";
                            ts.to="Madurai";
                            ts.distance=460;
                             break;
                        }
                        case 4:
                        {
                            ts.from="chennai";
                            ts.to="Trichy";
                            ts.distance=330;
                            break;
                            
                        }
                        case 5:
                        {
                            ts.from="chennai";
                            ts.to="Salem";
                            ts.distance=340;
                            break;
                            
                        }
                        
                        default:
                        {
                            System.out.println("out option");
                        }
                            
                        
                    }
                    if(ts!=null)
                    {
                        System.out.println("Ticket Booked Succesfully");
                        
                    }
                    break;
                        
                    
                }
                case 2:
                {
                    ts=new LuxuryBus();
                     System.out.println("enter your name :");
                    String name=sc.nextLine();
                    System.out.println("enter your id :");
                    int id=sc1.nextInt();
                    System.out.println("====================");
                    System.out.println("Select Route");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");
                    System.out.println("enter your option ");
                    int option=sc1.nextInt();
                    switch(option)
                     {
                         case 1:
                        {
                            ts.from="chennai";
                            ts.to="bangalore";
                            ts.distance=350;
                            break;
                                   
                        }
                        case 2:
                        {
                            ts.from="chennai";
                            ts.to="coimbatore";
                            ts.distance=500;
                            break;
                            
                        }
                        case 3:
                        {
                           ts.from="chennai";
                            ts.to="Madurai";
                            ts.distance=460;
                             break;
                        }
                        case 4:
                        {
                            ts.from="chennai";
                            ts.to="Trichy";
                            ts.distance=330;
                            break;
                            
                        }
                        case 5:
                        {
                            ts.from="chennai";
                            ts.to="Salem";
                            ts.distance=340;
                            break;
                            
                        }
                        
                        default:
                        {
                            System.out.println("out option");
                        }
                            
                        
                    }
                    if(ts!=null)
                    {
                        System.out.println("Ticket Booked Succesfully");
                        
                    }
                    break;
                    
                    
                }
                case 3:
                {
                    if(ts!=null)
                    {
                        ts.calculatefare();
                        System.out.println("Fare Caluluated Succesfully");
                    }
                    else
                    {
                        System.out.println("pls Book Ticket First");
                    }
                    
                }
                case 4:
                {
                    if(ts!=null)
                    {
                        ts.display();
                       
                    }
                    else
                    {
                        System.out.println("Ticket not found ");
                    }
                }
                    
                    
                case 5:
                {
                    System.out.println("exiting");
                    System.exit(0);
                }
                    
            }
        }
         
    }
    
}
