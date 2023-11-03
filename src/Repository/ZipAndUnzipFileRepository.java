package Repository;

import DataAccess.ZipAndUnzipDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZipAndUnzipFileRepository implements IZipAndUnzipFileRepository {

    @Override
    public void zipFile() {
        try {
            ZipAndUnzipDAO.Instance().zipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipAndUnzipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void unzipFile() {
        try {
            ZipAndUnzipDAO.Instance().unzipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipAndUnzipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
