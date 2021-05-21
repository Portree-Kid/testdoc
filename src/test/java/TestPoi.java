import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class TestPoi {


    @Test
    public void loadDocument() throws IOException, URISyntaxException {
        final URL docURL = getClass().getResource("testdoc.docx");
        final XWPFDocument doc = new XWPFDocument(new FileInputStream(new File(docURL.toURI())));
        final List<XWPFPictureData> pics = doc.getAllPictures();
        Assertions.assertEquals(1, pics.size());
    }
}
