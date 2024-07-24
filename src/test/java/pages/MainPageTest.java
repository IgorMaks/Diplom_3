package pages;

import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.*;
import rule.DriverRule;

import static org.junit.Assert.*;

public class MainPageTest {
    private MainPage mainPage;
    private WebDriver driver;

    @Rule
    public DriverRule driverRule = new DriverRule();

    @Before
    public void setUp() {
        driver = DriverRule.createWebDriver();
        mainPage = new MainPage(driver);
        mainPage.openMainPage();
    }

    @Test
    @DisplayName("Bun tab should be selected")
    public void bunTabShouldBeSelected() {
        mainPage.clickSauceTab();
        mainPage.clickBunTab();
        assertTrue(mainPage.isBunTabSelected());
    }

    @Test
    @DisplayName("Sauce tab should be selected")
    public void sauceTabShouldBeSelected() {
        mainPage.clickSauceTab();
        assertTrue(mainPage.isSauceTabSelected());
    }

    @Test
    @DisplayName("Filling tab should be selected")
    public void fillingTabShouldBeSelected() {
        mainPage.clickFillingTab();
        assertTrue(mainPage.isFillingTabSelected());
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
