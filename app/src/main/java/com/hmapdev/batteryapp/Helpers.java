package com.hmapdev.batteryapp;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by hpestana on 03/08/2016.
 */
public class Helpers{
    public static void ChangeInterfaceColor(Context ctx, Boolean charging) {
        Activity act = (Activity)ctx;
        TextView tv = (TextView) act.findViewById(R.id.titleLabel);
        TextView tv1 = (TextView) act.findViewById(R.id.chargeLevelLabel);
        TextView tv2 = (TextView) act.findViewById(R.id.chargeLevelValue);
        TextView tv3 = (TextView) act.findViewById(R.id.chargingTypeLabel);
        TextView tv4 = (TextView) act.findViewById(R.id.chargingTypeValue);
        if(charging) {
            tv.setBackgroundResource(R.color.titleCharging);
            tv1.setBackgroundResource(R.color.labelCharging);
            tv2.setBackgroundResource(R.color.valueCharging);
            tv3.setBackgroundResource(R.color.labelCharging);
            tv4.setBackgroundResource(R.color.valueCharging);
        }else{
            tv.setBackgroundResource(R.color.titleDischarging);
            tv1.setBackgroundResource(R.color.labelDischarging);
            tv2.setBackgroundResource(R.color.valueDischarging);
            tv3.setBackgroundResource(R.color.labelDischarging);
            tv4.setBackgroundResource(R.color.valueDischarging);
        }
    }
}
