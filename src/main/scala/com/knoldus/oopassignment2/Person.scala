package com.knoldus.oopassignment2

class Person(var personName:String,var personAge:Int) extends Ordered[Person]{


    override def <(person2: Person): Boolean ={
      if(this.personName.length==person2.personName.length)
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
