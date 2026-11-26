what is manual testing:
>Manual testing is the process of testing software manually by a human tester without using automation tools or 
> scripts. The tester acts as an end-user to find bugs, usability issues, and verify that features match requirements.

Example: Opening a website in Chrome, typing a username and password by hand, clicking "Login," and verifying that the dashboard loads properly.

what are the possible test cases for login (normal login page)
>Possible test cases are:
• Valid Login (Positive): Enter valid email and valid password \(\rightarrow \) User logs in successfully.
• Invalid Password (Negative): Enter valid email and wrong password \(\rightarrow \) System blocks access and shows "Invalid credentials."
• Empty Fields (Validation): Leave email and password blank and click Submit \(\rightarrow \) Inline validation error triggers.
• Password Masking (UI/Security): Type characters in the password field \(\rightarrow \) Characters appear masked as dots (••••••)


what are the possible test cases for adhar card requirements
>
• Exact Length (Positive): Enter a valid 12-digit number starting with 2–9 (e.g., 2345 6789 0120) \(\rightarrow \) Accepted.
• Under/Over Length (Boundary): Enter 11 digits or 13 digits \(\rightarrow \) Rejected or blocked at 12 digits.
• Invalid Starting Digit (Negative): Enter a 12-digit number starting with 0 or 1 (e.g., 1234 5678 9012) \(\rightarrow \) Rejected.
• Non-Numeric Input (Negative): Enter letters or special symbols (e.g., 2345ABCD0120) \(\rightarrow \) Rejected.

what is the diff between manual and automation testing
>Manual testing is the process where a human tester physically interacts with the software—clicking buttons, 
entering data, and visually verifying the output—without using any coding tools or scripts. Because it relies on 
human intuition, it is best suited for exploratory testing, checking visual design, and evaluating overall user 
experience, though it becomes slow and repetitive when testing large applications.

>Automation testing, on the other hand, uses specialized tools and code (such as Selenium with Java) to execute 
pre-written test scripts automatically. While it requires upfront time and coding skills to set up, automation 
runs much faster than a human, eliminates manual fatigue, and is ideal for repetitive regression testing across 
hundreds of scenarios.


what are the high level senario and high level senario
>• High-Level Scenarios (Test Scenarios): One-line summaries describing what feature or functionality needs to be tested without going into step-by-step details.
• Example: "Verify user login functionality."
>• Low-Level Scenarios (Test Cases): Detailed, step-by-step instructions explaining how to test a specific condition, including exact inputs and expected results.
• Example: "Enter valid email user@test.com and invalid password 1234, click Login, and verify the 'Invalid credentials' error appears.


what are the test case steps
>A standard test case follows a clear sequence of components so any tester can execute it consistently:
• Test Case ID & Title: Unique identifier and short summary (e.g., TC_01 - Valid Login).
• Preconditions: Requirements needed before starting (e.g., "User must have a registered account").
• Test Steps: Exact actions to perform (1. Open URL, 2. Enter username, 3. Click Login).
• Test Data: Specific input values used during the test.
• Expected Result vs. Actual Result: What should happen versus what actually happened, followed by a Pass/Fail status.

What is the Automation
> Automating the web application using tools like selenium , playwrite etc ..
what is selenium
>

what are the resources required to run a test project
>programing language
>software tools to run it like selenuim
>and a ide is required like eclipse and Intelij IDE
>


what is web driver and why we are using ChromeDriver
>web driver is interface in selenium 

why we are using webdriver
>Browser is doesn't know about 
> Third party java library
> 
> 

*selenium uses weblocators to idenfy the web elements 
by using 8 locators selenium identify the web locators
    id, name, className, tagname, linktest, partial link test, x path , css selector

>To interact with these elements in your test automation scripts, you can use various locator strategies:

>>ID Locator (Fastest & most unique if IDs are provided)

Example: driver.findElement(By.id("username"));

>>Name Locator

Example: driver.findElement(By.name("gender"));

>>CSS Selector (Great for styling and attributes)

Example: driver.findElement(By.cssSelector("input[type='password']"));

>>XPath (Most powerful for traversing the DOM or handling dynamic elements)

Example: driver.findElement(By.xpath("//select[@id='country']"));


>Verification and validation
Verification and Validation (V&V) are the two foundational pillars of quality assurance used
across software engineering, manufacturing, and project management to ensure a product is both
technically sound and fit for its intended purpose.
> • Verification ("Are we building the product right?"): 
A quality control process that evaluates whether a product, service, or system complies with
regulations, requirements, specifications, or imposed conditions at each phase of development. It is mostly static (does not require running the actual software/product).
> • Validation ("Are we building the right product?"): 
A quality assurance process that evaluates whether the final product actually meets the business
needs, expectations, and real-world requirements of the end-user. It is dynamic 
(requires executing and interacting with the working product).




















