package helloScala

object OptionExample {
	def main(args: Array[String]){
	  var x : Option[String] = None
	  //println(x.get) //NoSuchElementException
	  println(x.getOrElse("default"))
	  x = Some("Initialized")
	  println(x.get)
	  println(x.getOrElse("default"))
	  
	}
}