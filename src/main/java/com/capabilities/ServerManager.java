package com.capabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.IOException;
import java.util.Properties;

public class ServerManager {
    private static final ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();

    public static AppiumDriverLocalService getServer() {
        return server.get();
    }

    public static void startServer() throws IOException {
        AppiumDriverLocalService server = getAppiumService();
        server.start();
        if (!server.isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server couldn't be started");
        }
        ServerManager.server.set(server);
    }

    private static AppiumDriverLocalService getAppiumService() throws IOException {
        Properties props = new PropertyManager().getProps();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
    }
}
