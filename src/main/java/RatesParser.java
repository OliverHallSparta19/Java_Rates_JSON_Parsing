import org.json.simple.JSONObject;

public class RatesParser {
    JSONObject rates;

    public RatesParser (String filePath){
        RatesFileReader ratesFile = new RatesFileReader(filePath);
        rates = ratesFile.getFullJSONFile();
    }

    private Object getJSONValue(String key){return rates.get(key);}

    public String getJSONSuccess(){return getJSONValue("success").toString();}

    public String getJSONBAse(){return getJSONValue("base").toString();}

    public String getJSONDate(){return getJSONValue("date").toString();}

    public JSONObject getRatesJSONObject(){
        return (JSONObject) rates.get("rates");
    }

    public Double getRate(String rateKey){
        return (Double) getRatesJSONObject().get(rateKey);
    }

    }


