package com.zzvc.mmps.dao;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.GenericDao;

import com.zzvc.mmps.model.Player;

public interface PlayerDao extends GenericDao<Player, Long> {
	Player findByAddress(String address);
	List<Player> findByAddresses(List<String> addresses);
	List<Player> findByHeartbeatBefore(Date time);
	List<Player> findByHeartbeatAfter(Date time);
	List<Player> findAll();
}
