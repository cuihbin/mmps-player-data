package com.zzvc.mmps.model;

// Generated 2010-10-22 15:04:15 by Hibernate Tools 3.2.4.GA

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PlayerKeyValue generated by hbm2java
 */
@Entity
@Table(name = "player_key_value")
public class PlayerKeyValue implements java.io.Serializable, Comparable<PlayerKeyValue> {

	private Long id;
	private PlayerKey playerKey;
	private String value;

	public PlayerKeyValue() {
	}

	public PlayerKeyValue(Long id) {
		this.id = id;
	}

	public PlayerKeyValue(Long id, PlayerKey playerKey, String value) {
		this.id = id;
		this.playerKey = playerKey;
		this.value = value;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_key_id")
	public PlayerKey getPlayerKey() {
		return this.playerKey;
	}

	public void setPlayerKey(PlayerKey playerKey) {
		this.playerKey = playerKey;
	}

	@Column(name = "value", length = 2000)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(PlayerKeyValue o) {
		return value.compareTo(o.getValue());
	}

}
