public class Variables{

public static void computeSpeed(){
    float processorSpeed;
    byte numberProcessors;
    float computerSpeed;
    
    processorSpeed = 2.3f;
    numberProcessors=3;
    
    computerSpeed = processorSpeed * numberProcessors;
    System.out.println("Computer Speed = " + computerSpeed);
}

public static void addInterest(float interestrate) {
    
     float balance = 45;
    //float interestrate = 0.05f 
    //(can place interest rate as a float variable) and then
    //place in parenthesis of public static void
  
  float newbalance= balance + (int)(balance*interestrate);
  System.out.println("new balance = " + newbalance);
}

public static void main(String[] args)
{
    
    computeSpeed();
    addInterest(.05f);
    
  
}
}