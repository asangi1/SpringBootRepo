package demo;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/areas")
	public String filterBy(@RequestParam MultiValueMap<String, String> inputparam) {
		 String query = "";
		for (Entry<String, List<String>> entry : inputparam.entrySet())
		{
			for(String s:entry.getValue()){
				 System.out.println(s);
				  query =  "select "+s;
			}
		   
		}
	
		return query+" from areas";
	}
}