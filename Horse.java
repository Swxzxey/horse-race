

class Horse
{
    //Fields of class Horse
    private String horseName;
    private char horseSymbol;
    public int horseDistance;
    public boolean horseFallen;
    private double horseConfidence;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.horseFallen = false;
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        this.horseFallen = true;
        System.out.println(horseName + " has fallen!");
        
    }
    
    public double getConfidence()
    {
        return horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return horseDistance;
    }
    
    public String getName()
    {
        return horseName;
    }
    
    public char getSymbol()
    {
        return horseSymbol;
    }
    
    public void goBackToStart()
    {
        horseDistance = 0;
    }
    
    public boolean hasFallen()
    {
        if (horseFallen) {
            return true;
        } else {
            return false;
        }
    }

    public void moveForward()
    {
        horseDistance += 1;
    }

    public void setConfidence(double newConfidence)
    {
        horseConfidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        horseSymbol = newSymbol;
    }
    
}