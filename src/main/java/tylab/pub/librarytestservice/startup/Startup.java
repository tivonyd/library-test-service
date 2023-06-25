package tylab.pub.librarytestservice.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class Startup implements CommandLineRunner {

    @Value("#{${property.value-annotated-map?:{:}}}")
    private Map<String,String> valueMap;

    @Override
    public void run(String... args) throws Exception {
        log.info("Running");
    }
}
