# SeleniumKG
Project contains the only test TestCase1() in test class WebsiteTest.java.

### Run test
To run test just type in console:

    mvn test

### Chromedriver binary path
Chromedriver binary path is recognized automatically for both systems: Windows and Mac OS, but it can be provided manually via CLI. Just type following command: 

    mvn test -DpathToChromedriver=<path_to_chromedriver>

An example command might look like below:

    mvn test -DpathToChromedriver=src/main/resources/chromedriverWindows.exe

### Headless mode

There is other maven parameter that you can use: `headless`. Available options for this parameter are: `true` and `false`. The default is `false`. To run test in headless mode just type in console:

    mvn test -Dheadless=true