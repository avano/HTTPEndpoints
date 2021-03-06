package io.syndesis.qe.springboot.http.controller.swagger.put;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.syndesis.qe.springboot.http.util.ResponseUtil;

@Controller
public class PutJson {
	@RequestMapping(
			method = RequestMethod.PUT,
			path = "/api/putJson",
			produces = "application/json"
	)
	@ResponseBody
	public String putJson() {
		return ResponseUtil.getJsonResponse("put");
	}
}
