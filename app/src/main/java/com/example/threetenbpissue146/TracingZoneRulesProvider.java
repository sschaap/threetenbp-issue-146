package com.example.threetenbpissue146;

import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesProvider;

import java.util.NavigableMap;
import java.util.Set;

public class TracingZoneRulesProvider extends ZoneRulesProvider {

    @Override
    protected Set<String> provideZoneIds() {
        throw new RuntimeException("using default zone rules initializer");
    }

    @Override
    protected ZoneRules provideRules(String regionId, boolean forCaching) {
        throw new RuntimeException("using default zone rules initializer");
    }

    @Override
    protected NavigableMap<String, ZoneRules> provideVersions(String zoneId) {
        throw new RuntimeException("using default zone rules initializer");
    }
}