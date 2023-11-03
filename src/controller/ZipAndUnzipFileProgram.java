package controller;

import Repository.ZipAndUnzipFileRepository;
import view.Menu;

public class ZipAndUnzipFileProgram extends Menu<String> {

    static String[] mc = {"Compression", "Extraction", "Exit"};
    ZipAndUnzipFileRepository program;

    public ZipAndUnzipFileProgram() {
        super("\nZipper program", mc);
        program = new ZipAndUnzipFileRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.zipFile();
                break;
            case 2:
                program.unzipFile();
                break;
            case 3:
                System.exit(0);
        }
    }

}
