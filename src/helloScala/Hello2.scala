package helloScala

object Hello2 {
  def main(args: Array[String]){
    println(greeting(args(0)))
  }
  
  def greeting(name : String) : String = name match{
    case "Illia" => "Master, I'm glad you've run me again!"
    case _ => "Hello, " + name		
  }

}