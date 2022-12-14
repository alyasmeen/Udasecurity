module com.udacity.catpoint.security {
    requires com.udacity.catpoint.image;
    requires miglayout;
    requires java.desktop;
    requires com.google.common;
    requires com.google.gson;
    requires java.prefs;
    exports com.udacity.catpoint.security.data;
    opens com.udacity.catpoint.security.data to com.google.gson;
}