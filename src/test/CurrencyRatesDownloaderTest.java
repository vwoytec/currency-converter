package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Currency;
import model.CurrencyRates;
import service.CurrencyRatesDownloader;

public class CurrencyRatesDownloaderTest {
private CurrencyRatesDownloader classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new CurrencyRatesDownloader();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDownload() throws Exception {
		BigDecimal rate = classUnderTest.downloadRate(Currency.USD, Currency.PLN);
		
		assertNotNull(rate);
	}

}
