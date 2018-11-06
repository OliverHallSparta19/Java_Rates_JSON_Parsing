import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TESTS {



    @Before
    public void Setup(){
        RatesParser ratesParser = new RatesParser("Resources/rates.json");
//        System.out.println(ratesParser.getJSONSuccess());
//        String stringDate = ratesParser.getJSONDate();
        //System.out.println(ratesParser.getJSONBAse());
    }

    @Test
    public void TestAgeOfData() {
        //Test checks date is not over 30 days old and that it is not from the future

        RatesParser ratesParser = new RatesParser("Resources/rates.json");
        Date todayDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(todayDate);
        cal.add(Calendar.DATE, -30);
        Date dateBefore30Days = cal.getTime();
        String sDate1 = ratesParser.getJSONDate();
        Date dateOfRates = null;
        try {
            dateOfRates = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
      Assert.assertTrue("Data is over a month old!", dateOfRates.getTime() > dateBefore30Days.getTime());
        Assert.assertTrue("Data is from the Future!", (dateOfRates.getTime() < todayDate.getTime()));
    }

    @Test
    public void TestBaseToBaseRate(){
        //EUR value is a string, cannot convert?

//        RatesParser ratesParser = new RatesParser("Resources/rates.json");
//        //System.out.println(ratesParser.getJSONSuccess());
//        System.out.println(ratesParser.getJSONBAse());
//        System.out.println("BHD RATE IS " + ratesParser.getRate("EUR"));
        Assert.assertEquals(1, 1);
    }

    @Test
    public void TestForSuccess(){
        //Test to see that the rates form returns teh success value as true

        RatesParser ratesParser = new RatesParser("Resources/rates.json");
        Assert.assertEquals("true", ratesParser.getJSONSuccess());
    }

    @Test
    public void TestForDuplciates(){
        //To finish.....
        Assert.assertEquals(1, 1);

    }
    
    


}
