package appewtc.masterung.traffic;

import android.content.Context;

/**
 * Created by masterUNG on 9/13/15 AD.
 */
public class MyAdapter {

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }   // Constructor

}   // Main Class
