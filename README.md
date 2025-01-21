# HKAselenium

A. Repository Name: selenium-java-basics

B. Overview

    This repository contains the foundational setup for Selenium WebDriver using Java. It is aimed at helping beginners 
    understand the basics of configuring and running Selenium tests with Java. The provided script demonstrates how to:

           - Set up Selenium WebDriver with ChromeDriver.

           - Open a website (Google).

           - Retrieve and print the page title and current URL.

           - Close the browser programmatically.

C. Prerequisites

    1. Java Development Kit (JDK): Ensure you have JDK 8 or higher installed on your system.
    2. Apache Maven (optional): To manage dependencies efficiently.
    3. Selenium WebDriver: Include Selenium dependencies in your project. Use Maven for dependency management.
    4. ChromeDriver: Download the appropriate version for your Chrome browser.
    5. IDE: Use an IDE like IntelliJ IDEA or Eclipse for writing and running the code.

D. File Structure

       selenium-java-basics/
         └── src/
              └── BasicSeleniumSetup.java

E. Setup and Usage

     1. Clone the Repository
            git clone https://github.com/your-username/selenium-java-basics.git
            cd selenium-java-basics

     2. Set up Dependencies
            If using Maven, add the following dependency to your pom.xml:

                     <dependency>
                           <groupId>org.seleniumhq.selenium</groupId>
                           <artifactId>selenium-java</artifactId>
                           <version>4.11.0</version>
                     </dependency>

    3. Download ChromeDriver
           -  Download ChromeDriver matching your browser version from ChromeDriver Downloads.
           -  Place the chromedriver executable in a known directory.

    4. Update the Code
           Replace path/to/chromedriver in the script with the actual path to your ChromeDriver executable.

    5. Run the Script
           Compile and run the script using your IDE or from the command line.
                 javac BasicSeleniumSetup.java
                 java BasicSeleniumSetup

F. Code Explanation : BasicSeleniumSetup.java

    1. Setting ChromeDriver Path:
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
             // This line specifies the location of ChromeDriver on your system.

    2. Initializing WebDriver:
            WebDriver driver = new ChromeDriver();
             // This initializes a new instance of ChromeDriver.

    3. Opening a Website:
            driver.get("https://www.google.com");
            // Navigates to Google’s homepage.

    4. Printing Page Title and URL:
           System.out.println("Page Title: " + driver.getTitle());
           System.out.println("Current URL: " + driver.getCurrentUrl());
            // Retrieves and displays the title and current URL of the page.

    5. Closing the Browser:
           driver.quit();
            // Ensures the browser is closed after execution.

G. Expected Output

          1. When you run the script, the console will display the following:

                   - Page Title: Google
                   - Current URL: https://www.google.com/

          2. After 5 seconds, the browser will close automatically.

H. Troubleshooting

          1. ChromeDriver Version Mismatch:
                 - Ensure that the ChromeDriver version matches your browser version.

          2. PATH Issues:
                 - If the script cannot find ChromeDriver, ensure that the path to ChromeDriver is correct and accessible.

          3. Selenium Version Compatibility:
                 - Use compatible versions of Selenium, ChromeDriver, and your browser.

I. Contributions

        Contributions to this repository are welcome. Please follow these steps:
                    1. Fork the repository.
                    2. Create a feature branch: git checkout -b feature-name.
                    3. Commit your changes: git commit -m 'Description of changes'.
                    4. Push to the branch: git push origin feature-name.
                    5. Create a pull request.
