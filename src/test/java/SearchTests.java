import org.junit.jupiter.api.Test;
import pages.SearchPage;

public class SearchTests {

    SearchPage page = new SearchPage();

    @Test
    void successfulSearchTest() {
        page.openPage()
                .search("selenide")
                .checkResult("selenide.org");
    }

    @Test
    void searchInputTest() {
        page.openPage()
                .search("selenide")
                .checkInputValue("selenide");
    }

    @Test
    void searchResultsTest() {
        page.openPage()
                .search("selenide")
                .checkResultsVisible();
    }
}