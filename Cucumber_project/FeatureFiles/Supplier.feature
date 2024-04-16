Feature:
As a Admin user validate supplier creation with multiple data
@supplierTest
Scenario Outline:
As Admin User Add Supplier
Given Launch Browser
When Launch Url "http://webapp.qedgetech.com/"
When wait For Username with "name" and "username"
When Enter username with "name" and "username" and"admin"
When Enter password with "id" and "password" and "master"
When Click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Click supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When wait for Add + icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When click Add + icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for supplier number with "name" and "x_Supplier_Number"
When capture Supplier num with "name" and "x_Supplier_Number"
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When Click On Add Button after adding notes with "id" and "btnAction"
When Wait For Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Click On Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Wait For Alert with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click On Alert with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
Then user validate the supplier table
When user closes the browser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Laptops|Ameerpet5|Hydearabd1|India|Ramau1|9876543212|test@gmail.com|8765432345|Supplying Laptops|
|mobiles|Ameerpet5|Hydearabd1|India|Ramau1|9876543212|test@gmail.com|8765432345|Supplying Laptops|
|Electonics|Ameerpet1|Hydearabd1|India|Ramau1|9876543212|test@gmail.com|8765432345|Supplying Laptops|











