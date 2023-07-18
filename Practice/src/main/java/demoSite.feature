Feature: DemoSite
 
  @sanity
  Scenario: Add product to the cart
    Given hit the url "https://demowebshop.tricentis.com/"
    When click on login button
    And logIn to the application
    And add 2 products to the cart  print sub total and validate using assertion.
    Then print sub total
    And validate using assertion.
   
#
  #"https://demowebshop.tricentis.com/
#
#In POM design pattern, using testNG annotation, login and add 2 products to the cart and print
 sub total and validate using assertion.
#In suite use parameters  annotation and group method"
  