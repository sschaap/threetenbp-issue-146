package com.example.threetenbpissue146;

import android.app.Application;

import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Uncommenting the lines below overrides the default zone rules initializer.
        // This prevents use of ServiceLoader to find ZoneRulesProvider implementations,
        // which means TracingZoneRulesProvider is not used, avoiding its (intentional) crash.
//        ZoneRulesInitializer.setInitializer(new ZoneRulesInitializer() {
//            @Override
//            protected void initializeProviders() {
//                ZoneRulesProvider.registerProvider(new TzdbZoneRulesProvider());
//            }
//        });
    }
}
