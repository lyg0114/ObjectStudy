import org.junit.Test;

import java.util.Date;


public class javaTest {

    @Test
    public void dateTest(){
        Date input = new Date();
        System.out.println("input = " + input);
        System.out.println("input = " + input.getTime());
        System.out.println("input.getTime() = " + (int)(input.getTime()/1000)/60/60/24);


    }

}
