package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

class ReminderTasks
{

    public static final String ACTION_INCREAMENT_WATER_COUNT="increament_water_Count";




    public static void executeTask(Context context,String Action)
    {
        if(Action.equals(ACTION_INCREAMENT_WATER_COUNT))
        {



            increamentWaterCount(context);
        }




    }

    public static void increamentWaterCount(Context context)
    {


        PreferenceUtilities.incrementWaterCount(context);

    }





}




