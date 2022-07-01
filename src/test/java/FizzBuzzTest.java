import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
        void number1 (){
        //given
        int number = 1;

        //when
        String actual = FizzBuzz.transform(number);

        //then
        String expected = "1";
        Assertions.assertEquals(expected, actual);
    }

}