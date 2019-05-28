package com.nuc.o2o.util;

/**
 * @author Calvin
 * @Description:
 */
public class PathUtil {

    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:\\BaiduNetdiskDownload\\images";
        } else {
            basePath = "D:\\projectImg";
        }
        basePath = basePath.replace("\\", seperator);
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "D:\\upload\\item\\shop" + shopId + "\\";
        return imagePath.replace("\\", seperator);
    }
}
