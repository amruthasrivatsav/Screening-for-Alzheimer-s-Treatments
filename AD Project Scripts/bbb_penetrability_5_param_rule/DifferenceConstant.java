package Calculations;



public class DifferenceConstant
{
    static double maxHBD = 5.0;
    static double maxHBA = 10.0;
    static double maxMW = 500.0;
    
    static double maxPSA = 90.0;
    static double maxpKa = 10.0;
    static double minpKa = 4.0;
    static double maxlogP = 5.0;
    static double minLOGP = 2.0;
    static double maxROT = 5.0;
    
    
    
    
    
    
    public static double getConstant(Molecule inputMol)
    {
        double difference_constant=0.0;
        if(compareHBD(inputMol))
        {
            
            difference_constant = difference_constant + ((inputMol.getHBD() - maxHBD)/(maxHBD));
            
        }
        if(compareHBA(inputMol))
        {
            difference_constant = difference_constant + ((inputMol.getHBA() - maxHBA)/(maxHBA));
            
        }
        if(compareMW(inputMol))
        {
            difference_constant = difference_constant + ((inputMol.getMW() - maxMW)/(maxMW));
            
        }
        if(comparePSA(inputMol))
        {
            
            
                difference_constant = difference_constant + ((inputMol.getPSA() - maxPSA)/(maxPSA));
            
            
        }
        if(comparepKa(inputMol))
        {
            if(inputMol.getpKa() > maxpKa)
            {
                difference_constant = difference_constant + ((inputMol.getpKa() - maxpKa)/6.0);
            }
            if(inputMol.getpKa() < minpKa)
            {
                difference_constant = difference_constant + (( minpKa- inputMol.getpKa())/6.0);
            }
        }
        if(comparelogP(inputMol))
        {
            if(inputMol.getlogP() > maxlogP)
            {
                difference_constant = difference_constant + ((inputMol.getlogP() - maxlogP)/3.0);
            }
            if(inputMol.getlogP() < minLOGP)
            {
                difference_constant = difference_constant + (( minLOGP- inputMol.getlogP())/3.0);
            }
            
            
            
        }
        if(compareROT(inputMol))
        {
            
            
            difference_constant = difference_constant + ((inputMol.getRot() - maxROT)/(maxROT));
            
        }
        return difference_constant;
    }
    public static boolean compareHBD(Molecule inputHBD)
    {
        if (inputHBD.getHBD()>maxHBD)
        return true;
        
        return false;
        
    }
    public static boolean compareHBA(Molecule inputHBA)
    {
        if (inputHBA.getHBA()>maxHBA)
        return true;
        
        return false;
        
    }
    public static boolean compareMW(Molecule inputMW)
    {
        if (inputMW.getMW()>maxMW)
        return true;
        
        return false;
        
    }
    public static boolean comparePSA(Molecule inputPSA)
    {
        if (inputPSA.getPSA()>maxPSA)
        return true;
        
        return false;
        
    }
    public static boolean comparepKa(Molecule inputKa)
    {
        if (inputKa.getpKa()>maxpKa || inputKa.getpKa()<minpKa)
        return true;
        
        return false;
        
    }
    
    public static boolean comparelogP(Molecule inputlogP)
    {
        if (inputlogP.getlogP()>maxlogP || inputlogP.getlogP()<minLOGP)
        return true;
        
        return false;
        
    }
    public static boolean compareROT(Molecule inputROT)
    {
        if (inputROT.getRot()>maxROT)
        return true;
        
        return false;
        
    }
}