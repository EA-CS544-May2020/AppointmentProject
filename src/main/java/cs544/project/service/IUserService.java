package cs544.project.service;

import cs544.project.domain.User;
import cs544.project.service.response.UserResponse;
import edu.miu.common.service.BaseReadService;

public interface IUserService extends BaseReadService<UserResponse, User, Integer> {

}
