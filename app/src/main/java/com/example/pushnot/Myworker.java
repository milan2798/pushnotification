package com.example.pushnot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import javax.xml.transform.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;


    public class Myworker extends Worker {

        private static final String TAG = "MyWorker";

        public Myworker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
            super(appContext, workerParams);
        }

        @NonNull
        @Override
        public Result doWork() {
            Log.d(TAG, "Performing long running task in scheduled job");
            // TODO(developer): add long running task here.
            return Result.success();
        }
    }

