import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

public class JedisTest {
public static void main(String[] args) {
	/*Jedis jedis = new Jedis("192.168.1.100",6379);
	System.out.println(jedis.ping());
	System.out.println(jedis.get("k1"));
	Set<String> keys = jedis.keys("*");
	for(String s:keys) {
		System.out.println(s);
	}
	System.out.println(jedis.exists ("k2"));

	Long hset = jedis.hset("user", "name", "王二");
	System.out.println(hset);
    Long hset = jedis.hset("user", "name", "fg");
    System.out.println(jedis.hget("user","name"));
	Long del = jedis.del("user");
	System.out.println(del);
Map<String, String> map = new HashMap<String,String>();
	map.put("name", "王二");
	map.put("Dfd","34");
	map.put("cb","57");
	jedis.hmset("student", map);
	List<String> result = jedis.hmget("student", "name","Dfd","cb");
	for(String d:result) {
		System.out.println(d);
	}
	
	 Map<String,String> map = new HashMap<String,String>();
     map.put("telphone","13810169999");
     map.put("address","atguigu");
     map.put("email","abc@163.com");
     jedis.hmset("hash2",map);
     List<String> result = jedis.hmget("hash2", "telphone","email");
     for (String element : result) {
       System.out.println(element);
     }

    jedis.close();*/
    HashSet<HostAndPort> set = new HashSet<HostAndPort>();
    set.add(new HostAndPort("192.168.1.100",6379));
    
}
}
