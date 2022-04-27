import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
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

    public void checkText() {
        text.shouldBe(visible);
    }
}
