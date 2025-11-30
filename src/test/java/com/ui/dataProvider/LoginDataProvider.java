package com.ui.dataProvider;

import com.google.gson.Gson;
import com.ui.pojo.TestData;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoginDataProvider {

    @DataProvider(name = "LoginTestDataProvider")
    public Iterator<Object[]> loginDataProvider() throws FileNotFoundException {
        Gson gson = new Gson();
        File testDataFile = new File(System.getProperty("user.dir")+"\\src\\test\\testData\\loginData.json");
        FileReader fileReader = new FileReader(testDataFile);
        TestData data = gson.fromJson(fileReader,TestData.class);

        List<Object[]> dataToReturn = new ArrayList<Object[]>();
        for(User user:data.getData()){
            dataToReturn.add(new Object[]{user});
        }
        return dataToReturn.iterator();


    }
}
