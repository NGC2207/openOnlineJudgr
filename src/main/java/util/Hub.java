package util;

import Backend.DataFolder;

import java.nio.file.Path;
import java.util.logging.Logger;

public class Hub {
    private final static Logger logger = Logger.getLogger("Hub");

    public static String submit(long time, int index, String code) {
        if (DataFolder.createFolder(time)) {
            if (DataFolder.createFile(time, code, "java")) {
                return "Success!";
            } else {
                logger.warning("Failed to create File.");
                return "Inner Error!";
            }
        } else {
            logger.warning("Failed to create Folder.");
            return "Inner Error!";
        }
    }
}
