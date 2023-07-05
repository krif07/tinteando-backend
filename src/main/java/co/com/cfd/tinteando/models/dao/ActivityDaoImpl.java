package co.com.cfd.tinteando.models.dao;

import co.com.cfd.tinteando.models.entity.Activity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActivityDaoImpl implements IActivityDao{

    private EntityManager em;

    @Override
    public List<Activity> findAll() {

    }
}
