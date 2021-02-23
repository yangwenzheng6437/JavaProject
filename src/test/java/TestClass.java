import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;

public class TestClass {
    @Test
    public void testMethod(){
      Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.getClient().getPort());
        jedis.set("1","hash");
        System.out.println(jedis.get("" +
                "1"));

    }

}
