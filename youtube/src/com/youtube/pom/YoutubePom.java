package com.youtube.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.youtube.genericlib.BaseTest;

public class YoutubePom {
	
	@FindBy(id="search") private WebElement searchbox;
	@FindBy(xpath = "//yt-formatted-string[contains(text(),'Candice Warner')]") private WebElement buttabomma;
	@FindBy(xpath = "//yt-icon[@class='style-scope ytd-searchbox']") private WebElement searchbtn;

	public YoutubePom()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public void setSearchbox(String songName ) {
		searchbox.sendKeys(songName);
			
	}
	
	

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void clickSearchbtn() {
		searchbtn.click();
	}

	public WebElement getButtabomma() {
		return buttabomma;
	}

	public void clickButtabomma() {
	buttabomma.click();
	}
	
	public void playButtabomma(String songName) throws Throwable
	{
		searchbox.sendKeys(songName);
		searchbtn.click();
		Thread.sleep(2000);
		buttabomma.click();
		
	}
	
}