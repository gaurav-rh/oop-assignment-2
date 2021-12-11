package com.knoldus.oopassignment2

object PersonTester {
  def main(args: Array[String]): Unit = {

    // two objects of person class created to compare
    val person1 = new Person("Gaurav", 25)
    val person2 = new Person("aurav", 26)

    if (person1 < person2) // to compare two Person using operator overloading
      printf("person1 is less")
    else
      printf("person2 is less")

    printf("\n")

    if (person1 > person2) // to compare two Person using operator overloading
      printf("person 1 is greater than person 2")
    else
      printf("person 2 is greater than person 1")

    printf("\n")

    if (person1.checkPerson(person2)) // to compare two Person using checkPerson method
      printf("person 1 is less in check method")
    else
      printf("person 2 is less in check method")
  }
}

