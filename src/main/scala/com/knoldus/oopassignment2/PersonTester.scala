package com.knoldus.oopassignment2

object PersonTester {
  def main(args: Array[String]): Unit = {
    val person1 = new Person("Gaurav", 25)
    val person2 = new Person("Prakha", 25)

    if (person1 < person2)
      printf("person1 is good to go")
    else
      printf("person2 is good to go")
  }
}
