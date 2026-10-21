@echo off
echo ===================================================
echo  ShopSphere TCP Socket Client (Interactive CLI)
echo ===================================================
java -cp "%~dp0shopsphere-network\target\shopsphere-network-1.0.0.jar" com.shopsphere.network.client.InventorySocketClient
pause
