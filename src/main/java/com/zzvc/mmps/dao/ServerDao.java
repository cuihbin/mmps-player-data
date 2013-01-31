package com.zzvc.mmps.dao;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.GenericDao;

import com.zzvc.mmps.model.Server;

public interface ServerDao extends GenericDao<Server, Long> {
	List<Server> findByCode(String code);
	List<Server> findByHeartbeatBefore(Date time);
}
