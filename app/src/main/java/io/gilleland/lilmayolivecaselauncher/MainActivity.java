package io.gilleland.lilmayolivecaselauncher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by shawn on 4/23/16.
 */
public class MainActivity extends Activity {

    private static final String LIL_MAYO_GRAM = "https://www.instagram.com/_u/lilmayo/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LIL_MAYO_GRAM));
        startActivity(i);
    }
}
