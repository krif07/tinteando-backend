package co.com.cfd.tinteando.models.services;

import co.com.cfd.tinteando.models.dao.IActivityDao;
import co.com.cfd.tinteando.models.entity.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActivityServiceImpl implements IActivityService {

    @Autowired
    private IActivityDao activityDao;

    @Override
    @Transactional(readOnly = true)
    public List<Activity> findAll() {
        return (List<Activity>) activityDao.findAll();
    }
}
