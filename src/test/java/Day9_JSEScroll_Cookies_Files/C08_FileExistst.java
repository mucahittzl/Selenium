package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import utilities.BaseTest;

import java.io.File;

public class C08_FileExistst {

    @Test
    public void fileExists(){
        //C:\Users\90552\OneDrive\Masaüstü\fileExist (2)png
        System.out.println(System.getProperty("user.home"));

        String homePath=System.getProperty("user.home");
        String filePath="\\OneDrive\\Masaüstü\\fileExist (2)png";
        String fullPath=homePath+filePath;

        File image=new File(fullPath);
        Assert.assertTrue(image.exists());

    }
}
