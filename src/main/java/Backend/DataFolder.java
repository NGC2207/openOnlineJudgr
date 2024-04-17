package Backend;

import util.FileHelper;

import java.nio.file.Path;

public class DataFolder {
    public static boolean createFolder(long time) {
        // 在dataPath文件夹下新建一个名为time的文件夹
        Path dataPath = FileHelper.getDataPath();
        Path folderPath = dataPath.resolve(String.valueOf(time));
        return FileHelper.createFolder(folderPath);
    }

    public static boolean createFile(long time, String code, String suffix) {
        // 在dataPath/time文件夹下新建一个名为time.suffix的文件
        Path dataPath = FileHelper.getDataPath();
        Path folderPath = dataPath.resolve(String.valueOf(time));
        return FileHelper.createFile(folderPath, code, suffix);
    }
}
