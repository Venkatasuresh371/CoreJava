package accessModifiers1;

public class Country 
{
	//static variable
	static int countryCounter;  
    // instance variable
    String name;
    int dummyCounter;
    
    Country(String name)
    {
        this.name=name;
        countryCounter++;
        dummyCounter++;
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public static void main(String[] args)
    {
        System.out.println("****************************************");
        Country india=new Country("India");
        System.out.println("Country Name: "+india.getName());
        System.out.println("Number of country object created: "+Country.countryCounter);
        System.out.println("Dummy counter not a static variable: "+india.dummyCounter);
        System.out.println("****************************************");
        Country france=new Country("France");
        System.out.println("Country Name: "+france.getName());
        System.out.println("Number of country object created: "+Country.countryCounter);
        System.out.println("Dummy counter not a static variable: "+france.dummyCounter);
 
        System.out.println("****************************************");
    }
}
