package xyz.tricyzhou.service.impl;

import xyz.tricyzhou.entity.Blog;
import xyz.tricyzhou.mapper.BlogMapper;
import xyz.tricyzhou.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
