import org.json.simple.parser.JSONParser;

public class RatesMain {
    public static void main(String args[]){

        //RatesFileReader ratesFileReader = new RatesFileReader("Resources/rates.json");
        //System.out.println(ratesFileReader.getFullJSONFile());

        RatesParser ratesParser = new RatesParser("Resources/rates.json");
        System.out.println(ratesParser.getJSONSuccess());
        System.out.println("BHD RATE IS " + ratesParser.getRate("BHD"));

    }
}

