package lesson5.home_work5.copy_files;

import java.io.*;

public class CopyFiles {
    private File outFolder;
    private File inFolder;
    private String[] fileNameExtension;
    private File[] fileList;

    public CopyFiles(File out, File in, String[] fileNameExtension) {
        this.outFolder = out;
        this.inFolder = in;
        this.fileNameExtension = fileNameExtension;
    }

    public void copy() throws IOException {
        fileList = this.outFolder.listFiles(f -> {
            int pointIndex = f.getName().lastIndexOf(".");
            if (pointIndex == -1) {
                return false;
            }
            String ext = f.getName().substring(pointIndex + 1).toLowerCase();
            return check(ext);
        });
        for (File files:fileList) {
            int m=files.getName().lastIndexOf("\\");
            String path=inFolder.getPath()+"\\"+files.getName().substring((m+1));
            File tempFile = new File(path);
            copyFile(files,tempFile);
        }
    }

    private boolean check(String path) {
        for (String arr : fileNameExtension) {
            if (arr.toLowerCase().equals(path.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private void copyFile(File in, File out) throws IOException {
        if (in == null || out == null) {
            throw new IllegalArgumentException("This is null");
        }
        try (InputStream is = new FileInputStream(in);
             OutputStream os = new FileOutputStream(out)) {
            int n;
            byte[] buffer = new byte[1024 * 1024];
            while ((n = is.read(buffer)) > 0) {
                os.write(buffer, 0, n);

            }

        } catch (IOException e) {
            throw e;
        }
    }

}

