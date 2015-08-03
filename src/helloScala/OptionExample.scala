package helloScala

import java.io.File

object OptionExample {
	def main(args: Array[String]){
	  var x : Option[String] = None
	  //println(x.get) //NoSuchElementException
	  println(x.getOrElse("default"))
	  x = Some("Initialized")
	  println(x.get)
	  println(x.getOrElse("default"))
	  
	  x = Option(null) //Scala provides a factory method on the Option which creates a None object if the imput
	  					//is null, or it will create a Some of the inpt that was initialized.
	  
	  println(x)
	  
	  
	  //You can treat option as a collection. You can perform the standard map, flatMap, foreach methods.
	  x = Option("Test")
	  
	  x.map(name =>new  File(name))
	  
	  println(x)
	  
	  
	  //Option can be used to executed a block of code if the Option contains a value:
	  //This is done using foreach method:
	  
	  for(value <- x){
	    println("Option: " + value)
	  }
	  
	}
	
	
}