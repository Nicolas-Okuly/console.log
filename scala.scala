class console { def log(input: String) = { println(input) } }

object HelloWorld {
	def main(args: Array[String]) = {
	  var console = new console();
	  console.log("Hello World!")
	}
}
