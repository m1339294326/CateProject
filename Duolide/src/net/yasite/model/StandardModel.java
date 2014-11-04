package net.yasite.model;

import android.content.Context;
import net.yasite.entity.StandardEntity;
import net.yasite.service.StandardService;

public class StandardModel extends Model{

	StandardService standardService;
	public StandardModel(Context context){
		this.context = context;
		standardService = new StandardService(context);
	}
	public StandardEntity requestStandard(String c3){
		return standardService.getStandard(c3);
	}
}
