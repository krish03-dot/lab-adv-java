@echo off
echo ===================================================
echo  ShopSphere RMI Client
echo ===================================================
java -cp "%~dp0shopsphere-rmi\target\shopsphere-rmi-1.0.0.jar" com.shopsphere.rmi.client.RmiClient
pause
