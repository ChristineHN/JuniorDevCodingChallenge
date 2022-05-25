package BusinessObjects;

public class Van extends Vehicle{
    @Override
    public String toString() {
        return super.toString() +
                " | Sun Roof: " + hasSunRoof +
                " | Entertainment Screen: " + entertainmentScreen;
    }

    public boolean hasSunRoof;
    public boolean entertainmentScreen;
}
