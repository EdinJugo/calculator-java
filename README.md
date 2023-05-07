# calculator-java
simple calculator written in Java; supports addition, subtraction, multiplication and division

Calculator.java --> LOC (Lines of code) = 188
Start.java --> LOC (Lines of code) = 26


Code complexity and cognitive Report
----------------------
Calculator::evaluateExpression = 12
Calculator::Calculate = 12
----------------------
File: calculator-java

L4    public class Calculator 
(Potrebno dodati privatni konstruktor kako biste sakrili implicitni javni)

Ll8   public static String ToString()
(Potrebno promjeniti ime metode "ToString" kako bi izbjegli probleme sa metodom "toString".Metode počinju sa malim slovom)

L24 public static String Run
(Potrebno promjeniti prvo početno slovo u malo)

L70  String textResult = Float.toString(finalResult);
(Zamjeniti sa return Float.toString(finalResult); )

L183 return;
(Izbrisati, možemo bez)


File: Start.java 

L6 String Expression;
(malim slovom expression jer je atribut)
