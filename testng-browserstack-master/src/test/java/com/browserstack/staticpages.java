package com.browserstack;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.browserstack.SeleniumTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class staticpages extends SeleniumTest {

    @Test
    public void huftreward(){
	driver.findElement(By.xpath("//a[@href='https://headsupfortails.com/pages/huft-rewards']//p//picture//img[@loading='lazy']")).click();
	//String reward=driver.getTitle();
    //Assert.assertEquals(reward, "HUFT Rewards   Heads Up For Tails");
	Response res=null;
	String url=driver.getCurrentUrl();
	res=RestAssured.given().get(url);
	int code= res.getStatusCode();
	Assert.assertEquals(200, code);	
}
	@Test
	public void goldenretriever(){
		driver.get("https://headsupfortails.com/pages/golden-retriever");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void Beagle(){
		driver.get("https://headsupfortails.com/pages/beagles");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void boxer(){
		driver.get("https://headsupfortails.com/pages/boxers");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	

	@Test
	public void pugs(){
		driver.get("https://headsupfortails.com/pages/pugs");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	

	@Test
	public void indies(){
		driver.get("https://headsupfortails.com/pages/indies");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void germanshepherd(){
		driver.get("https://headsupfortails.com/pages/german-shepherd");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void huskies(){
		driver.get("https://headsupfortails.com/pages/huskies");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void shihtzus(){
		driver.get("https://headsupfortails.com/pages/shih-tzus");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void puppy(){
		driver.get("https://headsupfortails.com/pages/puppy");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void kitten(){
		driver.get("https://headsupfortails.com/pages/kitten");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void senoirdogessentials(){
		driver.get("https://headsupfortails.com/pages/senior-dog-essentials");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void learnwithhuft(){
		driver.get("https://headsupfortails.com/pages/learn-with-huft");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void store(){
		driver.get("https://headsupfortails.com/pages/stores");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void contactus(){
		driver.get("https://headsupfortails.com/pages/contact-us");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void downloadhuftapp(){
		driver.get("https://headsupfortails.com/pages/download-huft-app");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void dashdog(){
		driver.get("https://headsupfortails.com/pages/dashdog");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
	
	@Test
	public void nauturehug(){
		driver.get("https://headsupfortails.com/pages/natures-hug");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void blogs(){
		driver.get("https://headsupfortails.com/pages/blogs");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void termofuses(){
		driver.get("https://headsupfortails.com/pages/terms-of-use");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void privacypolicy(){
		driver.get("https://headsupfortails.com/pages/privacy-policy");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void referafriend(){
		driver.get("https://headsupfortails.com/pages/refer-a-friend");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void aboutus(){
		driver.get("https://headsupfortails.com/pages/refer-a-friend");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void career(){
		driver.get("https://headsupfortails.com/pages/careers");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void awards(){
		driver.get("https://headsupfortails.com/pages/awards");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void petspa(){
		driver.get("https://headsupfortails.com/pages/pet-spa");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void birthdayclub(){
		driver.get("https://headsupfortails.com/pages/birthday-club");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void huftcommunity(){
		driver.get("https://headsupfortails.com/pages/huft-community");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void offer(){
		driver.get("https://headsupfortails.com/pages/offers");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void cats(){
		driver.get("https://headsupfortails.com/pages/cats");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}

	@Test
	public void alldogtreats(){
		driver.get("https://headsupfortails.com/pages/all-dog-treats");
		Response res=null;
		String url=driver.getCurrentUrl();
		res=RestAssured.given().get(url);
		int code= res.getStatusCode();
		Assert.assertEquals(200, code);	
	}
}
