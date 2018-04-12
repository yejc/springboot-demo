package cn.yejc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	@RequestMapping("/")
	public String health() {
		throw new RuntimeException("运行时异常");
//		return "ok12";
	}
}
