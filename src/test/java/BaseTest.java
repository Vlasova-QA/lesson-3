import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
        @BeforeAll
        static void Base() {open("https://github.com/selenide/selenide");}
}
