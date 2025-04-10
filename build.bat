@echo off
setlocal

:: Define directories
set dirs=api-gateway eureka-server organization-service event-service news-service

:: Loop through each directory and run mvn clean package
for %%d in (%dirs%) do (
    echo Building %%d...
    cd %%d
    call mvn clean package
    cd ..
)

echo Build process completed for all services.
endlocal
