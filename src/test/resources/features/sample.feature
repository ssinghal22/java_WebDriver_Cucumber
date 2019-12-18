@sample
  Feature: Sample page predefined steps

    @sample1
    Scenario: Responsive UI
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      And I resize window to 1200 and 800
      Then element with xpath "//*[@id='location']" should be displayed
      And element with xpath "//*[@id='currentDate']" should be displayed
      And element with xpath "//*[@id='currentTime']" should be displayed
      When I resize window to 800 and 800
      Then element with xpath "//*[@id='location']" should be displayed
      And element with xpath "//*[@id='currentDate']" should be displayed
      And element with xpath "//*[@id='currentTime']" should be displayed
      When I resize window to 400 and 800
      Then element with xpath "//*[@id='location']" should not be displayed
      And element with xpath "//*[@id='currentDate']" should not be displayed
      And element with xpath "//*[@id='currentTime']" should not be displayed

    @sample2
    Scenario: Validate Username
       Given I open url "https://skryabin.com/webdriver/html/sample.html"
       When I type "s" into element with xpath "//*[@name='username']"
       And I click on element with xpath "//*[@name='email']"
       Then element with xpath "//*[@id='username-error']" should contain text "2 characters"
       
    @sample3
    Scenario: Validate Email
       Given I open url "https://skryabin.com/webdriver/html/sample.html"
       When I type "sss" into element with xpath "//*[@name='email']"
       And I click on element with xpath "//*[@name='password']"
       Then element with xpath "//*[@id='email-error']" should contain text "valid email"

    @sample4
    Scenario: Validate Password fields
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      When I click on element with xpath "//input[@name='password']"
      And I click on element with xpath "//input[@id='confirmPassword']"
      Then element with xpath "//input[@id='confirmPassword']" should be disabled

    @sample5
    Scenario: Validate Name
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      When I click on element with xpath "//input[@id='name']"
      Then element with xpath "//div[@role='dialog']" should be displayed
      And I type "Soni" into element with xpath "//input[@id='firstName']"
      And I type "Kris" into element with xpath "//input[@id='middleName']"
      And I type "Sing" into element with xpath "//input[@id='lastName']"
      And I click on element with xpath "//span[text()='Save']"
      Then element with xpath "//input[@id='name']" should have attribute "value" as "Soni Kris Sing"

    @sample6
    Scenario: Validate Privacy policy
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      When I click on element with xpath "//button[@id='formSubmit']"
      Then element with xpath "//label[@for='agreedToPrivacyPolicy']" should be displayed
#      Then I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
      Then I click on element using JavaScript with xpath "//input[@name='agreedToPrivacyPolicy']"
      # wonder why javascript has to be used here

    @sample7
    Scenario: Verify form data
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      When I type "SoniS" into element with xpath "//input[@name='username']"
      And I type "soniya.singhal@epsilon.com" into element with xpath "//input[@name='email']"
      And I type "Sunshine" into element with xpath "//input[@id='password']"
      And I type "Sunshine" into element with xpath "//input[@id='confirmPassword']"
      And I click on element with xpath "//input[@name='name']"
      And I type "Soni" into element with xpath "//input[@id='firstName']"
      And I type "Kris" into element with xpath "//input[@id='middleName']"
      And I type "Sing" into element with xpath "//input[@id='lastName']"
      And I click on element with xpath "//span[@class='ui-button-text'][text()='Save']"
      And I type "650-111-2222" into element with xpath "//input[@name='phone']"
      And I click on element with xpath "//input[@id='dateOfBirth']"
      And I click on element with xpath "(//select[@class='ui-datepicker-month']/option)[7]"
      And I click on element with xpath "//select[@class='ui-datepicker-year']/option[@value='2000']"
      And I click on element with xpath "//a[contains(@class,'ui-state-default')][text()='11']"
      And I click on element with xpath "//select[@name='countryOfOrigin']/option[@value='India']"
      And I click on element with xpath "//input[@name='gender'][@value='female']"
      And I click on element using JavaScript with xpath "//input[@name='allowedToContact']"
      And I type "800 Fremont St #101 \n Evergreen CA 90123" into element with xpath "//textarea[@id='address']"
      And I click on element with xpath "//select[@name='carMake']/option[@value='Other']"
      And I switch to iframe with xpath "//iframe[@name='additionalInfo']"
      And I type "Krishna" into element with xpath "//input[@name='contactPersonName']"
      And I switch to default content
      And I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
      And I click on element with xpath "//button[@id='formSubmit']"
      Then element with xpath "//legend[text() = 'Submitted sample form data']" should be displayed
      And element with xpath "//b[@name='username'][text()='SoniS']" should be displayed
      And element with xpath "//b[@name='email'][text()='soniya.singhal@epsilon.com']" should be displayed
      And element with xpath "//b[@name='firstName'][text()='Soni']" should be displayed
      And element with xpath "//b[@name='middleName'][text()='Kris']" should be displayed
      And element with xpath "//b[@name='lastName'][text()='Sing']" should be displayed
      And element with xpath "//b[@name='dateOfBirth'][text()='07/11/2000']" should be displayed
      And element with xpath "//b[@name='countryOfOrigin'][text()='India']" should be displayed
      And element with xpath "//b[@name='gender'][text()='female']" should be displayed
      And element with xpath "//b[@name='allowedToContact'][text()='true']" should be displayed
      And element with xpath "//b[@name='address'][text()='800 Fremont St #101 \n Evergreen CA 90123']" should be displayed
      And element with xpath "//b[@name='carMake'][text()='Other']" should be displayed
      And element with xpath "//b[@name='agreedToPrivacyPolicy'][text()='true']" should be displayed
      And element with xpath "//b[@name='contactPersonName'][text()='Krishna']" should be displayed
      And element with xpath "//b[@name='password'][text()='[entered]']" should be displayed

    @sample8
    Scenario: Non-required fields
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      Then I type "1112223344" into element with xpath "//input[@name='phone']"
      And I click on element with xpath "//select[@name='countryOfOrigin']/option[@value='India']"
      And I click on element with xpath "//input[@name='gender'][@value='female']"
      And I click on element using JavaScript with xpath "//input[@name='allowedToContact']"
      And I type "877 Willow St #226 \n San Jose CA 95125" into element with xpath "//textarea[@id='address']"
      And I click on element with xpath "//select[@name='carMake']/option[@value='Other']"
      And I click on element with xpath "//button[@id='thirdPartyButton']"
      And I accept alert
      And I click on element with xpath "//input[@id='dateOfBirth']"
      And I click on element with xpath "//select[@class='ui-datepicker-month']/option[@value='6']"
      And I click on element with xpath "//select[@class='ui-datepicker-year']/option[@value='2000']"
      And I click on element with xpath "//a[contains(@class,'ui-state-default')][text()='11']"


    @sample9
    Scenario: code review
      Given I open url "https://skryabin.com/webdriver/html/sample.html"
      And I click on element with xpath "//input[@id='dateOfBirth']"
      And I click on element with xpath "(//select[@class='ui-datepicker-month']/option)[7]"
      And I click on element with xpath "//select[@class='ui-datepicker-year']/option[@value='2000']"
      And I click on element with xpath "//td[@data-handler='selectDay']/a[text()='22']"
      Then element with xpath "//input[@id='dateOfBirth']" should have attribute "value" as "07/22/2000"
      And I click on element with xpath "//button[contains(@onclick,'window.open')]"
      And I switch to new window
      And element with xpath "//body" should contain text "Document 2"
      And I switch to first window