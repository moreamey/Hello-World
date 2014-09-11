package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
//	template = "Hello World"
	
	@RequestMapping(value = Array("/"))
	def controller() :String = {
	return "Hello World"
	}
	
}