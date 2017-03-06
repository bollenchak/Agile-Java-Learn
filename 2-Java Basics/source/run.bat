@echo off
javac -cp "F:\bollen\Agile-Java-Learn\2-Java Basics\source";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" -Xlint:deprecation studentinfo\*.java
if not errorlevel 1 java -cp "F:\bollen\Agile-Java-Learn\2-Java Basics\source";"F:\bollen\Agile-Java-Learn\junit-3.8.1.jar" junit.awtui.TestRunner studentinfo.AllTests
pause