@echo off
javac -cp "F:\bollen\Agile-Java-Learn\3-Strings and Packages\source";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" -Xlint:deprecation sis\studentinfo\*.java sis\report\*.java sis\*.java -d  "F:\bollen\Agile-Java-Learn\3-Strings and Packages\source\bin"

if not errorlevel 1 java -cp "F:\bollen\Agile-Java-Learn\3-Strings and Packages\source\bin";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" junit.awtui.TestRunner sis.AllTests
pause