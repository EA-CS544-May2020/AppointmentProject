package cs544.project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cs544.project.domain.User;
import cs544.project.service.response.UserResponse;
import edu.miu.common.service.BaseReadServiceImpl;

@Service
@Transactional
public class UserServiceImpl extends BaseReadServiceImpl<UserResponse, User, Integer> implements IUserService{

}
