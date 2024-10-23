package com.DMS.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefox implements DriverStrategy{

    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/browserDriver/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();

        // Atur profil Firefox untuk mendownload semua tipe file
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2); // Set folder download ke custom
        profile.setPreference("browser.download.dir", "C:\\Users\\sqa_d\\Downloads"); // Lokasi download
        profile.setPreference("pdfjs.disabled", true); // Disable PDF viewer di Firefox
        profile.setPreference("browser.download.manager.showWhenStarting", false); // Disable the download manager popup
        profile.setPreference("browser.helperApps.alwaysAsk.force", false); // Disable file open prompt
        profile.setPreference("browser.download.manager.focusWhenStarting", false); // Don't focus on download

        // Menambahkan semua MIME type yang ingin diunduh secara otomatis
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "application/pdf," +
                        "application/vnd.ms-excel," +
                        "application/msword," +
                        "application/zip," +
                        "application/octet-stream," +
                        "application/x-rar-compressed," +
                        "image/jpeg," +
                        "image/png," +
                        "text/csv,");

        return new FirefoxDriver(options);
    }
}
