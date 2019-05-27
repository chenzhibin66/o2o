package com.nuc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * @author Calvin
 * @Description:
 */
public class ImageUtil {
    public static void main(String[] args) throws IOException {
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        basePath=basePath.replace("/","\\");
        System.out.println(basePath);
        Thumbnails.of(new File("D:\\BaiduNetdiskDownload\\images\\xiaohuangren.jpg"))
                .size(200, 200).watermark(Positions.BOTTOM_RIGHT
                , ImageIO.read(new File(basePath+"watermark.jpg")), 0.25f).outputQuality(0.8f)
                .toFile("D:\\BaiduNetdiskDownload\\images\\xiaohuangrennew.jpg");
    }
}
