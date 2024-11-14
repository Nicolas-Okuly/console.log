using System;

namespace HelloWorld {
  public class console { public static void log(string input) { Console.WriteLine(input); } }
  
	public class Program {
		public static void Main(string[] args) {
			console console;
			console.log("Hello world!");
		}
	}
}
