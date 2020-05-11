package cs544.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs544.project.domain.User;
import cs544.project.service.response.UserResponse;
import edu.miu.common.controller.BaseReadController;
//test
// localhost:8081/users
// localhost:8081/users/6
// localhost:8081/users?page=1
// localhost:8081/users?fetch-all=true
// localhost:8081/users/search?query=actor_id:2
// localhost:8081/users/search?query=firstName:PENELOPE
@RestController
@RequestMapping("/users")
public class UserController extends BaseReadController<UserResponse, User, Integer> {
	
//	@Autowired
//	private UserServiceImpl userService;
//
//	@ResponseBody
//	@RequestMapping(value = "/users", method = RequestMethod.GET)
//	public List<UserResponse> getUsers(){
//		
//		return userService.findAll();
//	}
}
