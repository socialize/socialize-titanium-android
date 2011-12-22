# Socialize Module

## Description

Wrapper for the Socialize Action Bar

## Accessing the socialize Module

To access this module from JavaScript, you would do the following:

	var socialize = require("com.socialize");

The socialize variable is a reference to the Module object.	

## Example Use

The Socialize Action Bar for Android must be "wrapped" around an existing view.
This is so it always pins itself to the bottom of the view.

First set your socialize consumer key/secret:

	socialize.setSocializeCredentials("your_consumer_key", "your_consumer_secret");
	
Then (optionally) set your facebook app id:

	socialize.setFacebookAppId("your_facebook_app_id");
	
	
Wrap an existing view in the action bar with a given entity key:

	var someView = ... // This is your existing view.

	var actionBar = socialize.showActionBar(someView, "http://www.getsocialize.com");
	
Add the wrapped view to the window instead of the original view

	// win.add(someView); <-- Not this anymore
	win.add(actionBar);

