// this sets the background color of the master UIView (when there are no windows/tab groups on it)
Titanium.UI.setBackgroundColor('#000');

// create tab group
var tabGroup = Titanium.UI.createTabGroup();

var socialize = require('com.socialize');

//
// create base UI tab and root window
//
var win1 = Titanium.UI.createWindow({  
    title:'Tab 1',
    backgroundColor:'#fff'
});
var tab1 = Titanium.UI.createTab({  
    icon:'KS_nav_views.png',
    title:'Tab 1',
    window:win1
});

var label1 = Titanium.UI.createLabel({
	color:'#999',
	text:'I am Window 1',
	font:{fontSize:20,fontFamily:'Helvetica Neue'},
	textAlign:'center',
	width:'auto'
});



//
// create controls tab and root window
//
var win2 = Titanium.UI.createWindow({  
    title:'Tab 2',
    backgroundColor:'#fff'
});
var tab2 = Titanium.UI.createTab({  
    icon:'KS_nav_ui.png',
    title:'Tab 2',
    window:win2
});

var label2 = Titanium.UI.createLabel({
	color:'#999',
	text:'I am Window 2',
	font:{fontSize:20,fontFamily:'Helvetica Neue'},
	textAlign:'center',
	width:'auto'
});

if (Ti.Platform.name == "android") {

	// Set the consumer key and secret
	socialize.setSocializeCredentials("12a05e3e-e522-4c81-b4bb-89d3be94d122", "9c313d12-f34c-4172-9909-180384c724fd");
	
	// Set the facebook app ID	
	socialize.setFacebookAppId("209798315709193");
	
	// One action bar for each tab
	var actionBar1 = socialize.showActionBar(label1, "http://www.getsocialize.com");
	var actionBar2 = socialize.showActionBar(label2, "http://getsocialize.com");
	
	win1.add(actionBar1);
	win2.add(actionBar2);
}
else {
	win1.add(label1);
	win2.add(label2);
}

//
//  add tabs
//
tabGroup.addTab(tab1);  
tabGroup.addTab(tab2);  

// open tab group
tabGroup.open();