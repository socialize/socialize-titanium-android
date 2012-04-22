package com.socialize;

//import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.kroll.annotations.Kroll;

import android.app.Activity;

@Kroll.proxy(creatableInModule = SocializeModule.class)
public class SocializeActionBarViewProxy extends TiViewProxy {
	
	private String entityKey;
	
	private SocializeActionBarView view;
	private TiViewProxy parent;

	public SocializeActionBarViewProxy(TiViewProxy parent, String entityKey) {
		super();
		this.entityKey = entityKey;
		this.parent = parent;
	}

	@Override
	public TiUIView createView(Activity activity) {
		view = new SocializeActionBarView(this, parent, activity, entityKey);
		return view;
	}

	public String getEntityKey() {
		return entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}
}
