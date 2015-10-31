package com.hsdemo.auction;

import android.app.Application;
import android.util.Log;

import com.hsdemo.auction.models.AuctionItem;
import com.hsdemo.auction.models.Bid;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class AuctionApplication extends Application {

  public static final String APP_ID = "IeAyjoCzUbbciMcenEGc97qSCdNB9Om1JBN3rR8B";
  public static final String CLIENT_KEY = "fzV5bkPnq37y5Il4wsNHCYwdwEc1J1P2iE9OiPzp";

  @Override
  public void onCreate() {
    super.onCreate();

    ParseObject.registerSubclass(AuctionItem.class);
    ParseObject.registerSubclass(Bid.class);


    // Add your initialization code here
    Parse.initialize(this, APP_ID, CLIENT_KEY);
    ParsePush.subscribeInBackground("", new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if (e == null) {
          Log.i("TEST", "successfully subscribed to the broadcast channel.");
        } else {
          Log.i("TEST", "failed to subscribe for push", e);
        }
      }
    });

    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
      
    // If you would like all objects to be private by default, remove this line.
    defaultACL.setPublicReadAccess(true);
    
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
