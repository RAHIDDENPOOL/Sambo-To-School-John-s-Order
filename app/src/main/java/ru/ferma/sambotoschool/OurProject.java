package ru.ferma.sambotoschool;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import ru.ferma.sambotoschool.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class OurProject extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_project);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_ourProject);
        bottomNavigationView.setSelectedItemId(R.id.our_project_webView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (menuItem.getItemId()) {
                    case R.id.yandex_webView:
                        startActivity(new Intent(getApplication()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.our_project_webView:

                        return true;
                }
                return false;
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}