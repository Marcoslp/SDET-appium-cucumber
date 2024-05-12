package com.capabilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static final Properties props = new Properties();

    public Properties getProps() throws IOException {
        String propsFileName = "config.properties";

        if (props.isEmpty()) {
            try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propsFileName)) {
                props.load(inputStream);
            }
        }
        return props;
    }
}
