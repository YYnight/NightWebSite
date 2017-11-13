package com.night.service.impl;

import com.night.dao.LogDao;
import com.night.entity.Log;
import com.night.service.LogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author dyoon
 * @Date 2017/11/10 16:33
 */
@Service
@Transactional
public class LogServiceImpl implements LogService {
    @Resource private LogDao logDao;
    public List<Log> countList() {
        return logDao.findLogsGroupByDate();
    }

    public List<Log> list(Map<String, Object> map) {
        return logDao.findAll(map);
    }


    public Log findById(Integer id) {
        return logDao.findById(id);
    }

    public List<Log> findLogsByLogTypeId(Integer id) {
        return logDao.findLogsByLogTypeId(id);
    }

    public Log findLogByPreId(Map<String, Integer> map) {
        return logDao.findLogByPreId(map);
    }

    public Log findLogByNextId(Map<String, Integer> map) {
        return logDao.findLogByNextId(map);
    }
}
