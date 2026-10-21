@echo off
echo ===================================================
echo  ShopSphere RMI Registry & Server (Port 1099)
echo ===================================================
java -cp "%~dp0shopsphere-rmi\target\shopsphere-rmi-1.0.0.jar" com.shopsphere.rmi.server.RmiServer
pause
