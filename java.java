public class java {
  public static void main(String[] args) {
    class Console { void log(String input) { System.out.println(input); } }

    Console console = new Console();
    console.log("Hello World");
  }
}