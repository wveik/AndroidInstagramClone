package wveik.instagramclone;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import wveik.instagramclone.Utils.BottomNavigationViewHelper;

/**
 * Created by Kataev_MV on 13.03.2018.
 */

public class ShareActivity extends AppCompatActivity {
    private static final String TAG = "ShareActivity";
    private static final int ACTIVITY_NUM = 2;

    private Context mContext = ShareActivity.this;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting.");

        setupBottomNavigationView();
    }

    /*
    * BottomNavigationView setup
    * */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx =
                (BottomNavigationViewEx) findViewById(R.id.bottomNavBar);

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);

        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
