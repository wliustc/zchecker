package me.jingw.zchecker;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 * ZGetter
 */
public class ZGetter {
    private static final Logger logger = LoggerFactory.getLogger(ZGetter.class);
    private RestTemplate restTemplate = new RestTemplate();
    // private final String ZFrontUrl = "https://www.amazon.cn/ref=z_cn?tag=zcn0e-23";
    private final String ZFrontUrl = "https://www.google.com";

    public String getZFront(String URL) {
        String result = restTemplate.getForObject(ZFrontUrl, String.class);
        logger.info(result);
        return result;
    }

    public String getDeals(String URL) {
        // String deals = restTemplate.getForObject(URL, String.class);
        Long ts = System.currentTimeMillis();
        logger.info("Current TS", ts);
        // logger.info(deals);
        return "";
    }
}