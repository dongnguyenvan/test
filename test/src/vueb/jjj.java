package vueb;

import java.util.concurrent.TimeUnit;

public class jjj {
//ssg
		  /*Run before all testcases = pre-condition for all test cases*/
		  driver = new ChromeDriver();
		  wait = new WebDriverWait (driver, 30);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/v4/");
		  }
