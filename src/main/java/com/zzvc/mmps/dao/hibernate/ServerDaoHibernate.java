package com.zzvc.mmps.dao.hibernate;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zzvc.mmps.dao.ServerDao;
import com.zzvc.mmps.model.Server;

@Repository("serverDao")
public class ServerDaoHibernate extends GenericDaoHibernate<Server, Long> implements ServerDao {

	public ServerDaoHibernate() {
		super(Server.class);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Server> findByCode(String code) {
		return getSession().createCriteria(Server.class).add(Restrictions.eq("code", code)).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Server> findByHeartbeatBefore(Date time) {
		return getSession().createCriteria(Server.class).add(Restrictions.or(Restrictions.isNull("lastHeartbeat"), Restrictions.le("lastHeartbeat", time))).add(Restrictions.eq("enabled", true)).list();
	}
}
