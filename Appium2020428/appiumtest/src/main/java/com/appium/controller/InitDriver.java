package com.appium.controller;
import com.appium.pojo.DevicesList;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.net.URL;

/**
 * @ClassName InitDriver
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/4/28
 * @Version V1.0
 **/

@RestController
@RequestMapping("/appium")
public class InitDriver {

    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public void initDriver(@RequestBody DevicesList devicesList) throws Exception {
        if (StringUtils.isEmpty(devicesList)) {
            throw new RuntimeException("参数不能为空");
        }
        devicesList.setApp(new File("//Users//chenjiafeng//Desktop//wolaidai.apk"));
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, devicesList.getDeviceName());
        caps.setCapability(MobileCapabilityType.APP, devicesList.getApp());
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, devicesList.getPlatformName());
        caps.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, devicesList.getUnicodeKeyboard());
        caps.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, devicesList.getResetKeyboard());
        caps.setCapability(AndroidMobileCapabilityType.NO_SIGN, devicesList.getNoSign()); //是否不重签名APP
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }
}

//我的思路：把set需要的value值配置到文件中，或者让开一个接口