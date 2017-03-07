@echo off
javac -cp "F:\bollen\Agile-Java-Learn\2-Java Basics\practice";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" chess\*.java
if not errorlevel 1 java -cp "F:\bollen\Agile-Java-Learn\2-Java Basics\practice";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" junit.awtui.TestRunner chess.AllTests
pause