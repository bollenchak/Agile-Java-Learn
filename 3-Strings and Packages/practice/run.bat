@echo off
javac -cp ".";".\..\..\junit-3.8.1.jar" -d ".\classes" source\chess\*.java source\chess\pieces\*.java
if not errorlevel 1 java -cp ".\classes";".\..\..\junit-3.8.1.jar" junit.awtui.TestRunner chess.AllTests
pause