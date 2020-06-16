public class VacationLetter {

    public static void main(String[] args) {

        //Declare Variables

        String nameOfCountry = "Philippines";       //name of the country
        double population = 106.7; // in millions    //population in millions
        String capCity = "Manila";                  //Capital city of the country
        double phP = 50.12; //                      //1 USD is equal to 50.26 pesos


        //Print Letter to Console with Variables inserted
        System.out.println("Hey Mom and Dad!");
        System.out.println("Here are are some interesting details about the first country I'm visiting.");
        System.out.println("Name: " + nameOfCountry);
        System.out.println("Population Size: " + population + " million");
        System.out.println("Capital: " + capCity);
        System.out.println("Currency: One U.S. Dollar equals $" + phP + " Philippine pesos!");
        System.out.println("I'm so excited to visit the " + capCity + " National Park and feel the giraffes! Talk later.");
    }
}
