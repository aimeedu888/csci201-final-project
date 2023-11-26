package campus_threads.backend.api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/templates/")
	public String index() {
		return "index";
	}
}
