import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class Demo {
    public static void main(String args[]) throws IOException {
        
        String srcDirPath = args[0];
        String dstDirPath = args[1];
        
        System.out.println("[INFO ] creating file list. srcDirPath=" + srcDirPath);
        List<File> fileList = new ArrayList<File>();
        Demo.listPath(new File(srcDirPath), fileList);
        System.out.println("[INFO ] created file list. fileListCount=" + fileList.size());
        
        System.out.println("[INFO ] copying files.");
        for(File f: fileList) {
            System.out.println("[INFO ] copy " + f.getName());
            if (f.canRead()) {
                Path srcPath = f.toPath();
                Path dstPath = Paths.get(dstDirPath, f.getName());
                Files.copy(srcPath, dstPath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("[INFO ] copy success.");
            } else {
                System.out.println("[WARN ] copy fail, file cant read.");
            }
        }
        System.out.println("[INFO ] copied files.");
    }
    
    private static void listPath(File dir, List<File> fileList) {
        final String TGT_EXTENSION = ".log";
        final String IGNORE_WITH_EXTENSION = ".txt";
        
        File[] files = dir.listFiles();
        List<String> ignoreFileNameList = new ArrayList<String>();
        for(File f: files) {
            if(f.getName().endsWith(IGNORE_WITH_EXTENSION)) {
                ignoreFileNameList.add(f.getName());
            }
        }
        
        for(File f: files) {
            if(f.isFile()) {
                if(f.getPath().endsWith(TGT_EXTENSION)) {
                    String fileNameWithoutExtension = f.getName().substring(0, f.getName().lastIndexOf("."));
                    if(ignoreFileNameList.indexOf(fileNameWithoutExtension + IGNORE_WITH_EXTENSION) == -1) {
                        fileList.add(f);
                    } else {
                        System.out.println("[INFO ] not add file, ignore file exists. fileName=" + f.getName());
                    }
                }
            } else if(f.isDirectory()) {
                Demo.listPath(f, fileList);
            }
        }
    }
}