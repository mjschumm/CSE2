public class Arithmetic{
    public static void main(String[] args) {
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassCost$=2.29;
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        
        double taxPercent=0.06;
        
        double nSockCost$= nSocks* sockCost$;
        double nGlassCost$= nGlasses* glassCost$;
        double nEnvelopeCost$= nEnvelopes* envelopeCost$;
        
        double nTaxSockCost$=taxPercent*nSockCost$;
        double roundNTaxSockCost$= Math.round(nTaxSockCost$*100.0)/100.0;
        
        double nTaxGlassCost$=taxPercent*nGlassCost$;
        double roundNTaxGlassCost$= Math.round(nTaxGlassCost$*100.0)/100.0;
        
        double nTaxEnvelopeCost$=taxPercent*nEnvelopeCost$;
        double roundNTaxEnvelopeCost$= Math.round(nTaxEnvelopeCost$*100.0)/100.0;
        
        
        double TotalCostBeforeTax$=nSockCost$+nGlassCost$+nEnvelopeCost$;
        double TotalSalesTax$=roundNTaxSockCost$+roundNTaxGlassCost$+roundNTaxEnvelopeCost$;
        double TotalCost$=TotalCostBeforeTax$+TotalSalesTax$;
        
       System.out.println("The item being purchased is Socks");
       System.out.println("The number of socks being purchased is " + nSocks);
       System.out.println("The cost for each Sock is " + sockCost$);
       
       System.out.println("The item being puchased is Drinking Glasses");
       System.out.println("Then number of glasses being purchased is " + nGlasses);
       System.out.println("The cost for each glass is " + glassCost$);
       
       System.out.println("The item being purchased is an envelope");
       System.out.println("The number of envelopes being purchased is " + nEnvelopes);
       System.out.println("The cost for each envelope is " +envelopeCost$);
       
        System.out.println("The cost of socks is " + nSockCost$+
        " and the sales tax for the socks is " + roundNTaxSockCost$);
        System.out.println("The cost of the glasses is " +nGlassCost$+
        " and the sales tax for the glasses is " +roundNTaxGlassCost$);
        System.out.println("The cost of the envelope is " +nEnvelopeCost$+
        " and the sales tax for the envelope is "+roundNTaxEnvelopeCost$);
        
        System.out.println("The total cost of the purchases before tax is " 
        + TotalCostBeforeTax$ + ".  The total sales tax is " + TotalSalesTax$+ 
        " and the total paid inclucding sales tax is " + TotalCost$);
        
    }
}