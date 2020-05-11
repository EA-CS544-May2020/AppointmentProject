package cs544.project.repository;

import org.springframework.stereotype.Repository;

import cs544.project.domain.User;
import edu.miu.common.repository.BaseRepository;

@Repository
public interface UserRepository extends BaseRepository<User, Integer>{

}
