package xyz.tricyzhou.service.impl;

import xyz.tricyzhou.entity.User;
import xyz.tricyzhou.mapper.UserMapper;
import xyz.tricyzhou.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tricyzhou
 * @since 2022-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
