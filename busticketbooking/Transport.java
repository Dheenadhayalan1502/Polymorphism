
package busticketbooking;

abstract public class Transport 
{
    String name;
    byte id;
    String from;
    String to;
    int distance;
    long fare;
    abstract long calculatefare();
    public void display()
    {
        System.out.println("Passenger Id :"+id);
        System.out.println("Passenger Name :"+name);
        System.out.println("Route :"+from+"->"+to);
        System.out.println("Distance :"+distance);
        System.out.println("Toatal Fare :"+fare);
    }
    
    
}
