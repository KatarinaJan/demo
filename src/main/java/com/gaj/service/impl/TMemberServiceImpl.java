package com.gaj.service.impl;

import com.gaj.entity.TMember;
import com.gaj.mapper.TMemberMapper;
import com.gaj.service.TMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通讯录主表 服务实现类
 * </p>
 *
 * @author Jan
 * @since 2020-09-02
 */
@Service
public class TMemberServiceImpl extends ServiceImpl<TMemberMapper, TMember> implements TMemberService {

}
