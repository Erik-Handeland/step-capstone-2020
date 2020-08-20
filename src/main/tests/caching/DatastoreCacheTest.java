package caching;

import com.google.netpcapanalysis.caching.CacheBuilder;
import com.google.netpcapanalysis.caching.CacheBuilder.CacheType;
import com.google.netpcapanalysis.caching.CacheBuilder.Policy;
import org.junit.Before;

public class DatastoreCacheTest extends CacheTest {

  @Before
  @Override
  public void setup() {
    cache =
        new CacheBuilder<Integer, Integer>()
            .setCacheName("dstest")
            .setCacheType(CacheType.MEMORY)
            .setPolicy(Policy.MAXIMUM_SIZE)
            .setPolicyArgument(100)
            .build();

  }
}
