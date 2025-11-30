package com.ui.pojo;

import com.constant.Env;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSONUtility {

    public static String readJSON(Env env){
        Gson gson = new Gson();
        File jsonFile = new File(System.getProperty("user.dir")+"\\config\\config.json");
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(jsonFile);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Config config  = gson.fromJson(fileReader,Config.class);
        Environment environment = config.getEnvironments().get("QA");
        System.out.println(environment);
        return environment.getUrl();
    }
}
