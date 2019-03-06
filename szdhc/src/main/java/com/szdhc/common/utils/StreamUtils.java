package com.szdhc.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * @author zouke
 */
public class StreamUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamUtils.class);
    public static String read(InputStream is) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int len = 0;
            byte[] buffer = new byte[512];
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            return new String(baos.toByteArray(), 0, baos.size(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage(),e);
        }
        return null;
    }
}
