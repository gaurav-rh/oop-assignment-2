package com.knoldus.oopassignment2

trait Ordered[T] {
  def <(person2: Person): Boolean
  def >(person2: Person): Boolean
  def checkPerson(person2: Person):Boolean
}
