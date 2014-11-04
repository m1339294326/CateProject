package net.yasite.service;

import net.yasite.api.BaseAPI;
import net.yasite.api.StandardAPI;
import net.yasite.api.params.StandardParams;
import net.yasite.entity.StandardEntity;
import android.content.Context;

public class StandardService extends BaseService{

	public StandardService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public StandardEntity getStandard(String c3){
		StandardParams params = new StandardParams();
		params.setC3(c3);
		BaseAPI api = new StandardAPI(context, params);
		try {
			if(api.doGet()){
				return (StandardEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
