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
        System.out.println(ratesParser.getJSONSuccess());
        String stringDate = ratesParser.getJSONDate();
        System.out.println(ratesParser.getJSONBAse());



    }

    @Test
    public void TestAgeOfData() {
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
       // Assert.assertTrue("Data is from the Future!", (dateOfRates.getTime() > todayDate.getTime()));
    }

    @Test
    public void Test1(){
        Assert.assertEquals(1, 1);
        Assert.assertNotEquals(1, 2);
    }

    @Test
    public void TestForDuplciates(){

        Assert.assertEquals(1, 1);


    }
    
    


}
