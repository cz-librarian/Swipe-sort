package cz.librarian.swipesort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onResume");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart");
        Log.d(TAG,"User navigated to the activity");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause");
        Log.d(TAG,"Some other activity came to the foreground");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy");
        Log.d(TAG,"TheActivity is finishing or is being destroyed by the system");
        super.onDestroy();
    }
}
