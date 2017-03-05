@echo off
javac -cp .;"F:\bollen\agile java\junit-3.8.1.jar" *.java
if not errorlevel 1 start java -cp .;"F:\bollen\agile java\junit-3.8.1.jar" junit.awtui.TestRunner StudentTest
pause