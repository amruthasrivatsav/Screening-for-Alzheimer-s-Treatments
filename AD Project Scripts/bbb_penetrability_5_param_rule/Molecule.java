package Calculations;


public class Molecule
{
    private double Hbd;
    private double Hba;
    private double Mw;
    private double Logp;
    private double Pka;
    private String Name;
    private double Rot;
    private double Psa;
    public Molecule(String name, double hbd, double hba, double mw, double logp, double pka, double rot, double psa)
    {
        Name = name;
        Hbd = hbd;
        Hba = hba;
        Mw = mw;
        Logp = logp;
        Pka=pka;
        Rot = rot;
        Psa = psa; 
    }
    public String getName()
    {
        return Name;
    }
    public double getHBD()
    {
        return Hbd;
    }
    public double getHBA()
    {
        return Hba;
    }
    public double getMW()
    {
        return Mw;
    }
    public double getlogP()
    {
        return Logp;
    }
    public double getpKa()
    {
        return Pka;
    }
    public double getRot()
    {
        return Rot;
    }
    public double getPSA()
    {
        return Psa;
    }
}
