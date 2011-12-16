package com.socialize;

import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

public class SocializeActionBarViewProxy extends TiViewProxy {
	
	private String entityKey;
	
	private SocializeActionBarView view;

	public SocializeActionBarViewProxy(TiContext tiContext, String entityKey) {
		super(tiContext);
		this.entityKey = entityKey;
	}

	@Override
	public TiUIView createView(Activity activity) {
		view = new SocializeActionBarView(this, activity, entityKey);
		return view;
	}

	public String getEntityKey() {
		return entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}
	
	public void refresh() {
		if(view != null) {
			view.refresh();
		}
	}
}
