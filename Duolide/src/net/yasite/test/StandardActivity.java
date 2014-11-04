package net.yasite.test;

import net.yasite.entity.StandardEntity;
import net.yasite.model.StandardModel;
import net.yasite.net.HandlerHelp;
import android.content.Context;
import android.os.Message;

public class StandardActivity extends BaseNewActivity{
	StandardEntity standardEntity;
	StandardModel standardModel;
	String c3;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		c3 = "98";
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		System.out.println("执行");
		standardModel = new StandardModel(context);
		new StandardHandler(context).execute();
	}
 
	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	class StandardHandler extends HandlerHelp{

		public StandardHandler(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("zhixing");
			standardEntity = standardModel.requestStandard(c3);
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
