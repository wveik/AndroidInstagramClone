package wveik.instagramclone.Utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Kataev_MV on 13.03.2018.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx item){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        item.enableAnimation(false);
        item.enableItemShiftingMode(false);
        item.enableItemShiftingMode(false);
        item.setTextVisibility(false);
    }
}
