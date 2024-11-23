package com.Qapitol.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil
{
    public String getDataFromProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol\\IdeaProjects\\DemoQa\\src\\test\\java\\com\\Qapitol\\util\\prop.properties")    ;
        Properties p=new Properties();
        p.load(fis);
        String value=p.getProperty(key);
        return value;
    }
}
