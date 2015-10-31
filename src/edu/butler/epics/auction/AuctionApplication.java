package edu.butler.epics.auction;

import android.app.Application;
import android.util.Log;

import edu.butler.epics.auction.models.AuctionItem;
import edu.butler.epics.auction.models.Bid;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class AuctionApplication extends Application {

<<<<<<< HEAD:src/com/hsdemo/auction/AuctionApplication.java
  public static final String APP_ID = "RrfsiiHqCF5fQVO0ZthuYECqPTOWiKD7NwaDei8d";
  public static final String CLIENT_KEY = "jDwE4YJwmfydoJzlMGE5ujJyUNnoK7LzL61Jnkk2";
=======
  public static final String APP_ID = "WhkQetI8nb0HrIykoaNc8LJ9flHIxOvgaXhFXFxm";
  public static final String CLIENT_KEY = "uxKjxfKHKj5mlDwAtykNsur3vd1Hlc1Zms1lodEg";
  
  //Braxtyn account key: Ha6x84QKrSEfs0DMcsZ2w1bGDjddsPtrK7iVzpyN
>>>>>>> df9aface884ab8d924da3d263fbb6656e282d1fb:src/edu/butler/epics/auction/AuctionApplication.java

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
