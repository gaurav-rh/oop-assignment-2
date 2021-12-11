package com.knoldus.oopassignment2

class Person(var personName:String,var personAge:Int) extends Ordered[Person]{

  override def <(person2: Person): Boolean ={ // defining abstract method < of trait Ordered
      if(this.personName.equalsIgnoreCase(person2.personName))
        if(this.personAge<person2.personAge)
          true
        else
          false

      else if(this.personName.length<person2.personName.length)
        true
      else
        false

    }

  override def >(person2: Person): Boolean ={ // defining abstract method > of trait Ordered
    if(this.personName.equalsIgnoreCase(person2.personName))
      if(this.personAge>person2.personAge)
        true
      else
        false

    else if(this.personName.length>person2.personName.length)
      true
    else
      false

  }

  override def checkPerson(person2: Person): Boolean ={ // defining abstract method checkPerson of trait Ordered
    if(this.personName.equalsIgnoreCase(person2.personName))
      if(this.personAge<person2.personAge)
        true
      else
        false

    else if(this.personName.length<person2.personName.length)
      true
    else
      false

  }
}
