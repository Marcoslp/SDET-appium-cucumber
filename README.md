# SDET appium-cucumber automation challenge
This is a Appium-Cucumber automation project and iss currently designed to test Android devices

## Getting Started

```
git clone https://github.com/Marcoslp/SDET-appium-cucumber.git
```

### Prerequisites

* Maven installed
* Appium installed
* A virtual device manager (you can use Android studio > Virtual device manager)
* Android Path configured on your environment variables
    
    ANDROID_HOME: root android SDK directory
    
    PATH: ANDROID_HOME + the following paths = platform-tools, tools, tools/bin

## How to run the project

1. Open [IntelliJ IDEA]([https://www.npmjs.com/package/appium](https://www.jetbrains.com/idea/)) or any IDE
2. Run the TestRunner class which is a JUNit runner

Notes:
- You don't need to run the Appium server, the application will do it. The virtual machine **should be** turned on. 
- You may need to change the **deviceName**/**platformVersion** of `/main/src/main/resources/config.properties` file to match with the specific VDM.

## What was implemented
The project implements three features of the James app:
- Login process
- Edit user profile process
- Logout process
