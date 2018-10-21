package org.openmrs.module.atomfeed;

public final class AtomfeedConstants {

    public static final String ATOMFEED_PATH_TO_DEFAULT_CONFIGURATION = "defaultAtomfeedConfig.json";

    public static final String ATOMFEED_PATH_TO_CUSTOM_CONFIGURATION = "customAtomfeedConfig.json";
    
    public static final String DEFAULT_FEED_WRITER = "atomfeed.DefaultFeedWriter";

    public final static String KAFKA_HOST = "localhost";
    public final static String KAFKA_PORT = "9092";
    public final static String KAFKA_TOPIC = "openmrs-input";

    public static final class FilterProperties {
        public static final String PREFERRED_LOCATION_FILTER = "atomfeed.filter.location";
    }
}
