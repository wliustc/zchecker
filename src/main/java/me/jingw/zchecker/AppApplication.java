package me.jingw.zchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		ZGetter getter = new ZGetter();
		getter.getDeals("https://www.amazon.cn/xa/dealcontent/v2/GetDeals?nocache=1492762505196");
	}
}
