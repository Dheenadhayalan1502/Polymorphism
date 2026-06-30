
package busticketbooking;

public class CityBus extends Transport
{

    @Override
    long calculatefare() 
    {
        long fare=distance*5;
        return fare;
    }
    
}
