package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SearchPage {

    public SearchPage openPage() {
        open("https://duckduckgo.com/");
        return this;
    }

    public SearchPage search(String text) {
        $("[name=q]").setValue(text).pressEnter();
        return this;
    }

    public SearchPage checkResult(String text) {
        $("body").shouldHave(text(text));
        return this;
    }

    public SearchPage checkInputValue(String text) {
        $("[name=q]").shouldHave(value(text));
        return this;
    }

    public SearchPage checkResultsVisible() {
        $("[data-testid='result']").shouldBe(visible);
        return this;
    }
}