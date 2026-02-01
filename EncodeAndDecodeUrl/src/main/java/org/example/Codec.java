package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Codec {

    private Map<String,String> shortToLong=new HashMap<>();
    private  Map<String,String> longToShort=new HashMap<>();
    private static final String BASE_URL = "http://tinyurl.com/";


    public String encode(String longUrl) {
      if(!longToShort.containsKey(longUrl))
      {
          String id=UUID.randomUUID().toString().substring(0,6);
          String shortUrl=BASE_URL + id;
          longToShort.put(longUrl,shortUrl);
          shortToLong.put(shortUrl,longUrl);
      }
      return longToShort.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(!shortToLong.containsKey(shortUrl))
        {
            return null;
        }
        return shortToLong.get(shortUrl);
    }
}
