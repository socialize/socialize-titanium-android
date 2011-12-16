package com.socialize;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import com.socialize.ui.actionbar.ActionBarView;

import android.app.Activity;

public class SocializeActionBarView extends TiUIView {
	
	private Activity activity;
	private String entityKey;
	private ActionBarView view;

	public SocializeActionBarView(TiViewProxy proxy, Activity activity, String entityKey) {
		super(proxy);
		this.activity = activity;
		this.entityKey = entityKey;
	}

	@Override
	public void processProperties(KrollDict dict) {
		super.processProperties(dict);
		view = new ActionBarView(activity);
		view.setEntityKey(entityKey);
		setNativeView(view);
	}
	
	public void refresh() {
		if(view != null) {
			view.refresh();
		}
	}
}
