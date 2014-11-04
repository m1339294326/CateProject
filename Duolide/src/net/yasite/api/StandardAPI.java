package net.yasite.api;

import net.yasite.api.params.StandardParams;
import net.yasite.api.params.Urls;
import net.yasite.entity.StandardEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class StandardAPI extends BaseAPI{

	public StandardAPI(Context context, StandardParams pm) {
		super(context, pm);
		setMethod(Urls.WEB_SERVER_PATH + Urls.API + Urls.MERCHANT 
				+ Urls.STANDARD + "?c3=" + pm.getC3());
	}

	@Override
	public StandardEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), StandardEntity.class);
	}

}
