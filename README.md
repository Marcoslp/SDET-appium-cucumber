# SDET appium-cucumber automation challenge
This is an Appium-Cucumber automation project and is currently designed to test Android devices

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
2. Run the TestRunner class, which is a JUNit runner

Notes:
- You don't need to start the Appium server manually, the application will do it but the virtual machine **should be** turned on. 
- You may need to change the **deviceName**/**platformVersion** of `/main/src/main/resources/config.properties` file to match with the specific VDM.

## What was implemented
The project implements three features of the James app:
- Login process
- Edit user profile process
- Logout process

## Reports

[Cluecumber](https://github.com/trivago/cluecumber) was used for genereting reports

### Guide to generate reports
1. Run the TestRunner class
2. Go to the terminal and type: `mvn cluecumber-report:reporting`
3. Go to target folder > generated-report and open **index.html file**
![image](https://github.com/Marcoslp/SDET-appium-cucumber/assets/14029770/91e4e659-34a9-451e-bd54-d034dc92ad35)
4. Once the **index.html** file is opened, a report like this one will be displayed:
![image](https://github.com/Marcoslp/SDET-appium-cucumber/assets/14029770/ca9d7c76-1feb-499b-a821-fb50c852abbb)
