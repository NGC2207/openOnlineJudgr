package util;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Logger;

public class FileHelper {
    private static final Logger logger = Logger.getLogger("FileHelper");

    // 查看文件或目录是否存在
    public static boolean isExist(Path path) {
        if (path == null) {
            logger.warning("path is null");
            return false;
        }
        return Files.exists(path);
    }

    public static boolean createFolder(Path path) {
        if (path == null) {
            logger.warning("path is null");
            return false;
        }
        try {
            Files.createDirectories(path);
            return true;
        } catch (Exception e) {
            logger.warning("Failed to create direction: " + e.getMessage());
            return false;
        }
    }

    public static boolean createFile(Path path, String code, String suffix) {
        if (path == null) {
            logger.warning("path is null");
            return false;
        }
        try {
            Path filePath = path.resolve("Main" + "." + suffix);
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
            Files.write(filePath, Arrays.asList(code), StandardCharsets.UTF_8);
            return true;
        } catch (Exception e) {
            logger.warning("Failed to create file: " + e.getMessage());
            return false;
        }
    }


    // 获取当前项目的根目录
    private static Path getRootPath() {
        return Paths.get("").toAbsolutePath();
    }

    // 获取根目录下的data目录
    public static Path getDataPath() {
        return getRootPath().resolve("data");
    }

}
