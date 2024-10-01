package org.guvi.BestBuyEcommerceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

public class BestBuy {
	@Beforesuite
	public static void main(String[] args) throws InterruptedException {
		//set up the Chrome Browser
	  	  ChromeDriver driver=new ChromeDriver();	  	  
	  	//to maximize the window
	  	  driver.manage().window().maximize();	
	 @Test
	      //load the url
	  	  driver.get("https://www.bestbuy.com");
	  	 // Wait for the page to load
	  	  Thread.sleep(2000);
	  	 // Select "United States" if the country selection page appears
          if (driver.findElements(By.cssSelector("button#us-link")).size() > 0) {
              driver.findElement(By.cssSelector("button#us-link")).click();
          }
       // Validate if the URL is broken
          try {
              driver.findElement(By.xpath("//*[contains(text(), 'Best Buy')]"));
              System.out.println("The URL is not broken.");
          } catch (NoSuchElementException e) {
              System.out.println("The URL is broken.");
          }
          // Sign Up Functionality
          signUp(driver);
          // Login Functionality
          login(driver);
          // Close the browser
          driver.quit();
      }
		public static void signUp(WebDriver driver) {
        try {
            // Click on the 'Account' button to open the account menu
            WebElement accountButton = driver.findElement(By.cssSelector("button[data-lid='hdr_signin']"));
            accountButton.click();
            // Click on the 'Create Account' link
            WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
            createAccountLink.click();
            // Fill in the sign-up form
            WebElement firstName = driver.findElement(By.id("firstName"));
            WebElement lastName = driver.findElement(By.id("lastName"));
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement confirmPassword = driver.findElement(By.id("reenterPassword"));
            WebElement phoneNumber = driver.findElement(By.id("phone"));
            firstName.sendKeys("Preethi");
            lastName.sendKeys("Karthikeyan");
            email.sendKeys("preethibalan98@gmail.com");
            password.sendKeys("Preethi@18");
            confirmPassword.sendKeys("Preethi@18");
            phoneNumber.sendKeys("1234567890");
            // Submit the sign-up form
            WebElement createAccountButton = driver.findElement(By.cssSelector("button[type='submit']"));
            createAccountButton.click();          
            // Add wait to ensure the process completes
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
		 public static void login(WebDriver driver) {
		        try {
		            // Click on the 'Account' button to open the account menu
		            WebElement accountButton = driver.findElement(By.cssSelector("button[data-lid='hdr_signin']"));
		            accountButton.click();
		            // Click on the 'Sign In' link
		            WebElement signInLink = driver.findElement(By.linkText("Sign In"));
		            signInLink.click();
		            // Fill in the login form
		            WebElement email = driver.findElement(By.id("fld-e"));
		            WebElement password = driver.findElement(By.id("fld-p1"));
		            email.sendKeys("preethibalan98@gmail.com");
		            password.sendKeys("1234567890");
		            // Submit the login form
		            WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
		            signInButton.click();
		            // Add wait to ensure the process completes
		            Thread.sleep(5000);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		// Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
          // Locate the Best Buy logo
		 WebElement logo = driver.findElement(By.cssSelector("img[alt='Best Buy Logo']"));
		 {
         // Verify the logo is displayed
         if (logo.isDisplayed()) {
         System.out.println("Best Buy logo is displayed.");
         } else {
        System.out.println("Best Buy logo is not displayed.");
}
// Accept the cookies if a popup appears
try {
    WebElement cookiesButton = driver.findElement(By.cssSelector(".c-close-icon.c-modal-close-icon"));
    cookiesButton.click();
} catch (Exception e) {
    // Do nothing if the popup does not appear
}
// Wait until the menu is visible and clickable
try {
    Thread.sleep(3000); 
} catch (InterruptedException e) {
    e.printStackTrace();
}
}
// Click on the "Menu" button
WebElement menuButton = driver.findElement(By.cssSelector("button[data-lid='hdr_menu']"));
menuButton.click();
// Wait until the "Best Buy Outlet" link is visible and clickable
try {
    Thread.sleep(3000); 
} catch (InterruptedException e) {
    e.printStackTrace();
}
}	
// Click on the "Best Buy Outlet" link
WebElement outletLink = driver.findElement(By.linkText("Best Buy Outlet"));
outletLink.click();
// Click on the 'Best Buy Business' link
WebElement bestBuyBusinessLink = driver.findElement(By.linkText("Best Buy Business"));
bestBuyBusinessLink.click();
// Locate and click on the "Connect with an Expert" menu item
WebElement expertMenu = driver.findElement(By.linkText("Connect with an Expert"));
expertMenu.click();
// Find the "Top Deals" menu item and click on it
WebElement topDealsMenu = driver.findElement(By.xpath("//a[text()='Top Deals']"));
topDealsMenu.click();
// Locate the "Deal of the Day" menu item and click it
WebElement dealOfTheDay = driver.findElement(By.linkText("Deal of the Day"));
dealOfTheDay.click();
// Find and click the "Yes, best buy sells that" button or link
WebElement yesButton = driver.findElement(By.cssSelector("selector-for-yes-button"));
yesButton.click();
// Find and click on "My Best Buy Memberships"
WebElement myBestBuyMemberships = driver.findElement(By.linkText("My Best Buy Memberships"));
myBestBuyMemberships.click();
// Navigate to the "Credit Cards" section
WebElement creditCardsLink = driver.findElement(By.linkText("Credit Cards"));
creditCardsLink.click();
// Locate the "Order Status" link and click it
WebElement orderStatusLink = driver.findElement(By.linkText("Order Status"));
orderStatusLink.click();
// Navigate to the saved items page
WebElement savedItemsButton = driver.findElement(By.xpath("//a[text()='Saved Items']"));
savedItemsButton.click();
// Search for Apple Airpods
WebElement searchBox = driver.findElement(By.id("gh-search-input"));
searchBox.sendKeys("Apple Airpods 4 with Active Noise Cancellation - White");
searchBox.submit();
//Wait for search results to load and click on the product link
Thread.sleep(3000); 
WebElement productLink = driver.findElement(By.cssSelector("a[href*='/site/apple-airpods/']"));
productLink.click();
//Add the product to the cart
Thread.sleep(3000); 
WebElement addToCartButton = driver.findElement(By.cssSelector("button.add-to-cart-button"));
addToCartButton.click();
//Wait for the cart to update
Thread.sleep(3000); 
// Print a confirmation message
System.out.println("Product added to the cart successfully.");
// Hover over "Menu" to reveal "Shop by Department"
WebElement menu = driver.findElement(By.cssSelector("button[aria-label='Menu']"));
Actions actions = new Actions(driver);
actions.moveToElement(menu).perform();

// Click on "Shop by Department"
WebElement shopByDepartment = driver.findElement(By.cssSelector("button[aria-label='Shop by Department']"));
shopByDepartment.click();

// Wait for the menu to load
Thread.sleep(3000);

// Click on "Computers & Tablets"
WebElement computersTablets = driver.findElement(By.linkText("Computers & Tablets"));
computersTablets.click();

// Wait for the products to load
Thread.sleep(3000);

// Select the first item in the list
WebElement firstItem = driver.findElement(By.cssSelector(".sku-item .sku-header a"));
firstItem.click();

// Wait for the product page to load
Thread.sleep(3000);

// Click on "Add to Cart"
WebElement addToCartButton1 = driver.findElement(By.cssSelector(".add-to-cart-button"));
addToCartButton.click();

// Wait for the item to be added to the cart
Thread.sleep(3000);

// Go to Cart
driver.get("https://www.bestbuy.com/cart");

// Proceed to Checkout
WebElement checkoutButton = driver.findElement(By.className("checkout-buttons__checkout"));
checkoutButton.click();

// Fill out the form with dummy payment information
WebElement emailField = driver.findElement(By.id("user.preethi1234@gmail.com"));
emailField.sendKeys("preethi1234@gmail.com");

WebElement creditCardNumberField = driver.findElement(By.id("optimized-cc-card-number"));
creditCardNumberField.sendKeys("423156423456");

WebElement expirationMonthField = driver.findElement(By.id("credit-card-expiration-month"));
expirationMonthField.sendKeys("12");

WebElement expirationYearField = driver.findElement(By.id("credit-card-expiration-year"));
expirationYearField.sendKeys("2025");

WebElement cvvField = driver.findElement(By.id("credit-card-cvv"));
cvvField.sendKeys("123");

WebElement firstNameField = driver.findElement(By.id("payment.billingAddress.firstName"));
firstNameField.sendKeys("Preethi");

WebElement lastNameField = driver.findElement(By.id("payment.billingAddress.lastName"));
lastNameField.sendKeys("Karthikeyan");

WebElement addressField = driver.findElement(By.id("payment.billingAddress.street"));
addressField.sendKeys("123 Street");

WebElement cityField = driver.findElement(By.id("payment.billingAddress.city"));
cityField.sendKeys("Chennai");

WebElement stateField = driver.findElement(By.id("payment.billingAddress.state"));
stateField.sendKeys("TN");

WebElement zipCodeField = driver.findElement(By.id("payment.billingAddress.zipcode"));
zipCodeField.sendKeys("10001");

WebElement phoneNumberField = driver.findElement(By.id("payment.billingAddress.phone"));
phoneNumberField.sendKeys("1234567890");
 WebElement placeOrderButton = driver.findElement(By.className("place-order-button"));
 placeOrderButton.click();
 // Verify order confirmation message
 WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(),'Thank you for your order')]"));

 // Check if the confirmation message is displayed
 if (confirmationMessage.isDisplayed()) {
     System.out.println("Order was placed successfully.");
 } else {
     System.out.println("Order confirmation message not found.");
 }
 @AfterSuite
 public void closeChromeBrowser() {
	  driver.quit();
 }
 }
 





