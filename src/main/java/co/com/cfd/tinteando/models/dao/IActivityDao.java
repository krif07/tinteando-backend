package co.com.cfd.tinteando.models.dao;

import co.com.cfd.tinteando.models.entity.Activity;

import java.util.List;

public interface IActivityDao {
    public List<Activity> findAll();
}
