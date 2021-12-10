package com.knoldus.oopassignment2

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {
  "a person" should "BE LESS than other person if it's name is equal and age is less" in {
    val person = new Person("Prakha", 25)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(result)

  }

  "a person" should "BE LESS than other person if it's name length is smaller than other even if age is greater" in {
    val person = new Person("Prakh", 27)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(result)

  }

  "a person" should "BE LESS than other person if it's name length is smaller than other even if age is less" in {
    val person = new Person("Prakh", 23)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(result)

  }

  "a person" should "NOT BE LESS less than other person if it's name length is greater than other even if age is less" in {
    val person = new Person("Prakhar", 25)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(!result)
  }

  "a person" should "NOT BE LESS less than other person if it's name length is greater than other even if age is GREATER" in {
    val person = new Person("Prakhar", 28)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(!result)
  }

  "a person" should "NOT BE LESS than other person if name length is equal but age is greater " in {
    val person = new Person("Prakha", 28)
    val otherPerson = new Person("gaurav", 26)
    var result = false
    if (person < otherPerson)
      result = true
    else
      result = false
    assert(!result)
  }
}
