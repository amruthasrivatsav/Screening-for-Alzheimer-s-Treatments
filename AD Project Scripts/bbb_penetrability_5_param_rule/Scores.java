 
import java.util.ArrayList;


public class Scores
{
    public static void main(String[]args)
    {
        
        ArrayList<Molecule> highestScoring = new ArrayList<Molecule>();
        highestScoring.add(new Molecule("Paliperidone",1.0,5.0,426.5,2.3,8.2,4.0,82.17));
        highestScoring.add(new Molecule("Irinotecan",1.0,8.0,586.7,3.2,9.47,5.0,112.51));
        
        highestScoring.add(new Molecule("Imatinib",2.0,	7.0,	493.6,	3.0,	8.27,	 7.0,	86.3));
        highestScoring.add(new Molecule("Clofazimine",1.0,4.0, 448.9,4.75,9.29,	4.0,39.99));
        highestScoring.add(new Molecule("Tolvaptan",2.0,3.0,586.7,3.20,	9.66,3.0,69.64));
        
        highestScoring.add(new Molecule("Risperidone", 0.0,4.0,410.5,3.27,8.76,	4.0,61.94));
        
        for(int x =0; x<highestScoring.size(); x++)
        {
            System.out.println(highestScoring.get(x).getName() + ": " + DifferenceConstant.getConstant(highestScoring.get(x)));
            
        }
        //double Telscore = DifferenceConstant.getConstant(Telmisartan);
        //System.out.print(Telscore);
    }
}
