@echo off
javac -cp ".";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" -Xlint:deprecation source\sis\studentinfo\*.java source\sis\report\*.java source\sis\*.java -d  ".\classes"

if not errorlevel 1 java -cp ".\classes";".\..\..\junit-3.8.1.jar" junit.awtui.TestRunner sis.AllTests
pause