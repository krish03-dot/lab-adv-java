@echo off
echo ===================================================
echo  ShopSphere TCP Socket Server (Port 9090)
echo ===================================================
java -cp "%~dp0shopsphere-network\target\shopsphere-network-1.0.0.jar" com.shopsphere.network.server.InventorySocketServer
pause
