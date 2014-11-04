package net.yasite.entity;

import java.io.Serializable;
import java.util.List;

public class GoodListEntity implements Serializable {
	private List<GoodEntity> blist;

	public List<GoodEntity> getList() {
		return blist;
	}

	public void setList(List<GoodEntity> list) {
		this.blist = list;
	}
	
}
