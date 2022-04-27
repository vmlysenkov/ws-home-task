import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicallyLoadedPageTest {
    @BeforeEach
    void shouldOpenPage() {
        open("https://the-internet.herokuapp.com/dynamic_loading");
    }

    @Test
    void shouldFindHelloWorldText() {
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage.clickExample1();
        dynamicallyLoadedPage.clickStartButton();
        String actual = dynamicallyLoadedPage.checkText();
        String expected = "Hello World!";
        Assertions.assertEquals(expected, actual);
    }
}