package co.com.cfd.tinteando.models.dao;

import co.com.cfd.tinteando.models.entity.Activity;
import org.springframework.data.repository.CrudRepository;

public interface IActivityDao extends CrudRepository<Activity, Long> {
}
