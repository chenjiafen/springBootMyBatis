import com.appium.pojo.DevicesList;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.net.URL;

/**
 * @ClassName TestDemo
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/4/30
 * @Version V1.0
 **/
public class TestDemo {
    public static void initDriver() throws Exception {

        File f=new File("//Users//chenjiafeng//Desktop//wolaidai.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "fadsfa");
        caps.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
        caps.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
        caps.setCapability(AndroidMobileCapabilityType.NO_SIGN, true); //是否不签名APP
        caps.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,"co.welab.wolaidai.MainActivity");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");//默认appium，可以不写
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,600);//600s,session超时时间10分钟，脚本于服务端
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
        public static void main(String[] args) throws Exception {
        initDriver();

    }

}
