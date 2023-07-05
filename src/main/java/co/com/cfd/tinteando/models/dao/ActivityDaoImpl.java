package co.com.cfd.tinteando.models.dao;

import co.com.cfd.tinteando.models.entity.Activity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActivityDaoImpl implements IActivityDao{
    @Override
    public List<Activity> findAll() {
        return null;
    }
}
