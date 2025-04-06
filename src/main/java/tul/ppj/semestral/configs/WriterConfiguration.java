package tul.ppj.semestral.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tul.ppj.semestral.writer.DevelWriter;
import tul.ppj.semestral.writer.ProdWriter;
import tul.ppj.semestral.writer.Writer;

@Configuration
public class WriterConfiguration {

    @Bean
    @Profile("devel")
    public Writer develWriter() {
        return new DevelWriter();
    }

    @Bean
    @Profile("!devel")
    public Writer prodWriter() {
        return new ProdWriter();
    }
}
