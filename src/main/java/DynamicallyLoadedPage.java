import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class DynamicallyLoadedPage {
    private SelenideElement example1 = $("#content a[href='/dynamic_loading/1'");
    private SelenideElement startButton = $("#start>button");
    private SelenideElement text = $("#finish>h4");

    public void clickExample1() {
        example1.click();
    }

    public void clickStartButton() {
        startButton.click();
    }

    public String checkText() {
        text.shouldBe(appear, Duration.ofSeconds(10));
        return text.getText();
    }
}
