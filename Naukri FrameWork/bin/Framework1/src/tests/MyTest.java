package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import pages.AddressTab;
import pages.ConfirmOrder;
import pages.ShippingTab;
import pages.cartItemConfirmationScreen;
import pages.cartPage;
import pages.cartSummaryPage;
import pages.loginOnCart;
import pages.payment;
import pages.searchResult;
import utils.Browser;
import utils.my;

public class MyTest {

	@BeforeTest
	public void setup() {
		Browser.Launch("CHROME");
		Browser.OpenUrl("http://automationpractice.com/index.php");

	}

	@Test
	public void hello() throws InterruptedException {

		System.out.println("hello");
		my.sendKeys(pages.homePage.searchBox, "top");
		my.click(pages.homePage.searchSubmit);
		String searchTitle = my.getText(searchResult.searchResultTitle);
		System.out.println(searchTitle);

		Assert.assertEquals(searchTitle, "\"TOP\"");
		Thread.sleep(2000);
		my.scroll();
		my.ActionPerform(searchResult.image);
		my.click(searchResult.addTocartBtn);
		my.wait(cartPage.proceedButton);

		my.click(cartPage.proceedButton);
		my.scroll();
		my.click(cartSummaryPage.Proceed);

		my.scrollElement(loginOnCart.email);

		my.sendKeys(loginOnCart.email, "ag@ag.com");
		my.sendKeys(loginOnCart.pwd, "123123");

		my.click(loginOnCart.submitButton);
		my.scrollElement(AddressTab.proceedButton);
		my.click(AddressTab.proceedButton);

		my.scrollElement(ShippingTab.checkBox);
		my.click(ShippingTab.checkBox);

		my.click(ShippingTab.proceedButton);

		my.scrollElement(payment.bankWire);
		my.click(payment.bankWire);

		my.click(ConfirmOrder.confirmButton);
	}
}
