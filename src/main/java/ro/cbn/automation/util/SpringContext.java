package ro.cbn.automation.util;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import ro.cbn.automation.configuration.MainConfiguration;

@ActiveProfiles("chrome")
@ContextConfiguration(classes = MainConfiguration.class)
public abstract class SpringContext {

}
