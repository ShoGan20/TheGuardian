package my.iot.womensafety;



import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MyLocationListener implements LocationListener {

    public static double latitude=19.110001;
    public static double longitude=72.837625;

    @Override
    public void onLocationChanged(Location loc)
    {
        loc.getLatitude();
        loc.getLongitude();
        latitude=loc.getLatitude();
        longitude=loc.getLongitude();
    }

    @Override
    public void onProviderDisabled(String provider)
    {

    }
    @Override
    public void onProviderEnabled(String provider)
    {

    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras)
    {

    }
}