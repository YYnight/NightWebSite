package com.night.service.impl;

import com.night.dao.LogTypeDao;
import com.night.entity.LogType;
import com.night.service.LogTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 日志类型业务层实现类
 * @author dyoon
 * @Date 2017/11/10 16:31
 */
@Service
@Transactional
public class LogTypeServiceImpl implements LogTypeService {

    @Resource private LogTypeDao logTypeDao;
    public List<LogType> findAll() {
        return logTypeDao.findAll();
    }
}
