package dev.patika.fourthhomeworkavemphract;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class FourthHomeworkAvemphractApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(LocalDate.parse("1997-05-11"));
    }

}
