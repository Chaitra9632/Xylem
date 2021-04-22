package crm.Xylem.SampleProject;

import org.testng.annotations.Test;

public class XylemSample {
	
	@Test
	public void sampleTest()
	{
		System.out.println("Hello World..!!!");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USER = System.getProperty("user");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USER);
	}

}
