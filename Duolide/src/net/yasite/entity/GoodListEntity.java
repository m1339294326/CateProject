package net.yasite.entity;

import java.io.Serializable;
import java.util.List;

public class GoodListEntity implements Serializable {
	private List<GoodEntity> alist;

	public List<GoodEntity> getList() {
		return alist;
	}

	public void setList(List<GoodEntity> list) {
		this.alist = list;
	}
	
}
