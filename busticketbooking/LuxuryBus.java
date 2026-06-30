
package busticketbooking;

public class LuxuryBus extends Transport
{

    @Override
    long calculatefare() 
    {
       long fare=(distance*10)+200;
       return fare;
    }
    
}
