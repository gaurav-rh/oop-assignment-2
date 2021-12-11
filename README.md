# oop-assignment-2
## The project is a implementation of comparision of two persons based on it's parameters using scala language. It contains one class, one trait and one object

 ***Ordered***
This trait is used for comaring two persons. 
-It has three abstract methods two of which overloads **'<'** and **'>'** operators and **checkPerson** method to comapre two persons.

**Person**
This class extends the Ordered trait and implements three abstract methods **'>'**, **'<'** and **'checkPerson'** to compare person owing to their parameters
If Name parameter is equal the comarision goes to check for age, otherwise checks for name length.  

**PersonTester**
This scala object is used to check the functionality of Person class

***PersonTest***
This is a Test class using AnyFlatSpec style of scala test for testing functionability of this Project.

### To run this project one has to open the PersonTester object where two objects of Person class are created . Anyone can change the parameters and use accordingly 
