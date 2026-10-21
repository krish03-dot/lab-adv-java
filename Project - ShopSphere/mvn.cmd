@echo off
if exist "%~dp0..\servlet\maven\apache-maven-3.9.9\bin\mvn.cmd" (
    "%~dp0..\servlet\maven\apache-maven-3.9.9\bin\mvn.cmd" %*
) else if exist "C:\Users\bhave\maven\apache-maven-3.9.9\bin\mvn.cmd" (
    "C:\Users\bhave\maven\apache-maven-3.9.9\bin\mvn.cmd" %*
) else (
    mvn %*
)
