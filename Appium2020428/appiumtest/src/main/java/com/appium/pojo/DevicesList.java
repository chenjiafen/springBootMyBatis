package com.appium.pojo;

import java.io.File;

/**
 * @ClassName DevicesList
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/4/30
 * @Version V1.0
 **/
public class DevicesList {

    //AndroidMobileCapabilityType
    private String appActivity;
    private String appPackage;
    private String appWaitActivity;
    private String appWaitPackage;
    private String appWaitDuration;
    private String deviceReadyTimeout;
    private String androidCoverage;
    private String enablePerformanceLogging;
    private String androidDeviceReadyTimeout;
    private String adbPort;
    private String androidDeviceSocket;
    private String androidInstallTimeout;
    private String avd;
    private String avdLaunchTimeout;
    private String avdReadyTimeout;
    private String avdArgs;
    private String useKeystore;
    private String keystorePath;
    private String keystorePassword;
    private String KkeyAlias;
    private String keyPassword;
    private String chromedriverExecutable;
    private String autoWebviewTimeout;
    private String intentAction;
    private String intentCategory;
    private String intentFlags;
    private String optionalIntentArguments;
    private String dontStopAppOnReset;
    private Boolean unicodeKeyboard;
    private Boolean resetKeyboard;
    private Boolean noSign;
    private String ignoreUnimportantViews;
    private String disableAndroidWatchers;
    private String chromeOptions;
    private String recreateChromeDriverSessions;
    private String nativeWebScreenshot;
    private String androidScreenshotPath;
    private String autoGrantPermissions;
    private String androidNaturalOrientation;
    private String selendroidPort;
    private String systemPort;

    //MobileCapabilityType
    private String automationName;
    private String platformName;
    private String platformVersion;
    private String deviceName;
    private String newCommandTimeout;
    private File app;
    private String browserName;
    private String udid;
    private String appiumVersion;
    private String language;
    private String locale;
    private String orientation;
    private String autoWebview;
    private String noReset;
    private String fullReset;
    private String clearSystemFiles;
    private String eventTimings;


    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppWaitActivity() {
        return appWaitActivity;
    }

    public void setAppWaitActivity(String appWaitActivity) {
        this.appWaitActivity = appWaitActivity;
    }

    public String getAppWaitPackage() {
        return appWaitPackage;
    }

    public void setAppWaitPackage(String appWaitPackage) {
        this.appWaitPackage = appWaitPackage;
    }

    public String getAppWaitDuration() {
        return appWaitDuration;
    }

    public void setAppWaitDuration(String appWaitDuration) {
        this.appWaitDuration = appWaitDuration;
    }

    public String getDeviceReadyTimeout() {
        return deviceReadyTimeout;
    }

    public void setDeviceReadyTimeout(String deviceReadyTimeout) {
        this.deviceReadyTimeout = deviceReadyTimeout;
    }

    public String getAndroidCoverage() {
        return androidCoverage;
    }

    public void setAndroidCoverage(String androidCoverage) {
        this.androidCoverage = androidCoverage;
    }

    public String getEnablePerformanceLogging() {
        return enablePerformanceLogging;
    }

    public void setEnablePerformanceLogging(String enablePerformanceLogging) {
        this.enablePerformanceLogging = enablePerformanceLogging;
    }

    public String getAndroidDeviceReadyTimeout() {
        return androidDeviceReadyTimeout;
    }

    public void setAndroidDeviceReadyTimeout(String androidDeviceReadyTimeout) {
        this.androidDeviceReadyTimeout = androidDeviceReadyTimeout;
    }

    public String getAdbPort() {
        return adbPort;
    }

    public void setAdbPort(String adbPort) {
        this.adbPort = adbPort;
    }

    public String getAndroidDeviceSocket() {
        return androidDeviceSocket;
    }

    public void setAndroidDeviceSocket(String androidDeviceSocket) {
        this.androidDeviceSocket = androidDeviceSocket;
    }

    public String getAndroidInstallTimeout() {
        return androidInstallTimeout;
    }

    public void setAndroidInstallTimeout(String androidInstallTimeout) {
        this.androidInstallTimeout = androidInstallTimeout;
    }

    public String getAvd() {
        return avd;
    }

    public void setAvd(String avd) {
        this.avd = avd;
    }

    public String getAvdLaunchTimeout() {
        return avdLaunchTimeout;
    }

    public void setAvdLaunchTimeout(String avdLaunchTimeout) {
        this.avdLaunchTimeout = avdLaunchTimeout;
    }

    public String getAvdReadyTimeout() {
        return avdReadyTimeout;
    }

    public void setAvdReadyTimeout(String avdReadyTimeout) {
        this.avdReadyTimeout = avdReadyTimeout;
    }

    public String getAvdArgs() {
        return avdArgs;
    }

    public void setAvdArgs(String avdArgs) {
        this.avdArgs = avdArgs;
    }

    public String getUseKeystore() {
        return useKeystore;
    }

    public void setUseKeystore(String useKeystore) {
        this.useKeystore = useKeystore;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public void setKeystorePath(String keystorePath) {
        this.keystorePath = keystorePath;
    }

    public String getKeystorePassword() {
        return keystorePassword;
    }

    public void setKeystorePassword(String keystorePassword) {
        this.keystorePassword = keystorePassword;
    }

    public String getKkeyAlias() {
        return KkeyAlias;
    }

    public void setKkeyAlias(String kkeyAlias) {
        KkeyAlias = kkeyAlias;
    }

    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    public String getChromedriverExecutable() {
        return chromedriverExecutable;
    }

    public void setChromedriverExecutable(String chromedriverExecutable) {
        this.chromedriverExecutable = chromedriverExecutable;
    }

    public String getAutoWebviewTimeout() {
        return autoWebviewTimeout;
    }

    public void setAutoWebviewTimeout(String autoWebviewTimeout) {
        this.autoWebviewTimeout = autoWebviewTimeout;
    }

    public String getIntentAction() {
        return intentAction;
    }

    public void setIntentAction(String intentAction) {
        this.intentAction = intentAction;
    }

    public String getIntentCategory() {
        return intentCategory;
    }

    public void setIntentCategory(String intentCategory) {
        this.intentCategory = intentCategory;
    }

    public String getIntentFlags() {
        return intentFlags;
    }

    public void setIntentFlags(String intentFlags) {
        this.intentFlags = intentFlags;
    }

    public String getOptionalIntentArguments() {
        return optionalIntentArguments;
    }

    public void setOptionalIntentArguments(String optionalIntentArguments) {
        this.optionalIntentArguments = optionalIntentArguments;
    }

    public String getDontStopAppOnReset() {
        return dontStopAppOnReset;
    }

    public void setDontStopAppOnReset(String dontStopAppOnReset) {
        this.dontStopAppOnReset = dontStopAppOnReset;
    }

    public Boolean getUnicodeKeyboard() {
        return unicodeKeyboard;
    }

    public void setUnicodeKeyboard(Boolean unicodeKeyboard) {
        this.unicodeKeyboard = unicodeKeyboard;
    }

    public Boolean getResetKeyboard() {
        return resetKeyboard;
    }

    public void setResetKeyboard(Boolean resetKeyboard) {
        this.resetKeyboard = resetKeyboard;
    }

    public Boolean getNoSign() {
        return noSign;
    }

    public void setNoSign(Boolean noSign) {
        this.noSign = noSign;
    }

    public String getIgnoreUnimportantViews() {
        return ignoreUnimportantViews;
    }

    public void setIgnoreUnimportantViews(String ignoreUnimportantViews) {
        this.ignoreUnimportantViews = ignoreUnimportantViews;
    }

    public String getDisableAndroidWatchers() {
        return disableAndroidWatchers;
    }

    public void setDisableAndroidWatchers(String disableAndroidWatchers) {
        this.disableAndroidWatchers = disableAndroidWatchers;
    }

    public String getChromeOptions() {
        return chromeOptions;
    }

    public void setChromeOptions(String chromeOptions) {
        this.chromeOptions = chromeOptions;
    }

    public String getRecreateChromeDriverSessions() {
        return recreateChromeDriverSessions;
    }

    public void setRecreateChromeDriverSessions(String recreateChromeDriverSessions) {
        this.recreateChromeDriverSessions = recreateChromeDriverSessions;
    }

    public String getNativeWebScreenshot() {
        return nativeWebScreenshot;
    }

    public void setNativeWebScreenshot(String nativeWebScreenshot) {
        this.nativeWebScreenshot = nativeWebScreenshot;
    }

    public String getAndroidScreenshotPath() {
        return androidScreenshotPath;
    }

    public void setAndroidScreenshotPath(String androidScreenshotPath) {
        this.androidScreenshotPath = androidScreenshotPath;
    }

    public String getAutoGrantPermissions() {
        return autoGrantPermissions;
    }

    public void setAutoGrantPermissions(String autoGrantPermissions) {
        this.autoGrantPermissions = autoGrantPermissions;
    }

    public String getAndroidNaturalOrientation() {
        return androidNaturalOrientation;
    }

    public void setAndroidNaturalOrientation(String androidNaturalOrientation) {
        this.androidNaturalOrientation = androidNaturalOrientation;
    }

    public String getSelendroidPort() {
        return selendroidPort;
    }

    public void setSelendroidPort(String selendroidPort) {
        this.selendroidPort = selendroidPort;
    }

    public String getSystemPort() {
        return systemPort;
    }

    public void setSystemPort(String systemPort) {
        this.systemPort = systemPort;
    }

    public String getAutomationName() {
        return automationName;
    }

    public void setAutomationName(String automationName) {
        this.automationName = automationName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getNewCommandTimeout() {
        return newCommandTimeout;
    }

    public void setNewCommandTimeout(String newCommandTimeout) {
        this.newCommandTimeout = newCommandTimeout;
    }

    public File getApp() {
        return app;
    }

    public void setApp(File app) {
        this.app = app;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getAppiumVersion() {
        return appiumVersion;
    }

    public void setAppiumVersion(String appiumVersion) {
        this.appiumVersion = appiumVersion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getAutoWebview() {
        return autoWebview;
    }

    public void setAutoWebview(String autoWebview) {
        this.autoWebview = autoWebview;
    }

    public String getNoReset() {
        return noReset;
    }

    public void setNoReset(String noReset) {
        this.noReset = noReset;
    }

    public String getFullReset() {
        return fullReset;
    }

    public void setFullReset(String fullReset) {
        this.fullReset = fullReset;
    }

    public String getClearSystemFiles() {
        return clearSystemFiles;
    }

    public void setClearSystemFiles(String clearSystemFiles) {
        this.clearSystemFiles = clearSystemFiles;
    }

    public String getEventTimings() {
        return eventTimings;
    }

    public void setEventTimings(String eventTimings) {
        this.eventTimings = eventTimings;
    }
}
