package tul.ppj.semestral.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tul.ppj.semestral.Main;

public class ProdWriter implements Writer {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    @Override
    public void write(String message) {
        log.info(message);
    }
}
