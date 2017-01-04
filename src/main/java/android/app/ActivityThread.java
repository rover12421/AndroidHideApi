/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.os.Debug;
import android.os.IBinder;
import android.os.Looper;

import java.io.PrintWriter;
import java.util.List;


/**
 * This manages the execution of the main thread in an
 * application process, scheduling and executing activities,
 * broadcasts, and other operations on it as the activity
 * manager requests.
 *
 */
public final class ActivityThread {
    /** Type for IActivityManager.serviceDoneExecuting: anonymous operation */
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    /** Type for IActivityManager.serviceDoneExecuting: done with an onStart call */
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    /** Type for IActivityManager.serviceDoneExecuting: done stopping (destroying) service */
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;

    public static ActivityThread currentActivityThread() {
        throw new UnsupportedOperationException("STUB");
    }

    public static boolean isSystem() {
        throw new UnsupportedOperationException("STUB");
    }

    public static String currentOpPackageName() {
        throw new UnsupportedOperationException("STUB");
    }

    public static String currentPackageName() {
        throw new UnsupportedOperationException("STUB");
    }

    public static String currentProcessName() {
        throw new UnsupportedOperationException("STUB");
    }

    public static Application currentApplication() {
        throw new UnsupportedOperationException("STUB");
    }

    public static IPackageManager getPackageManager() {
        throw new UnsupportedOperationException("STUB");
    }

    public final LoadedApk getPackageInfo(String packageName, CompatibilityInfo compatInfo,
                                          int flags) {
        throw new UnsupportedOperationException("STUB");
    }

    public final LoadedApk getPackageInfo(String packageName, CompatibilityInfo compatInfo,
                                          int flags, int userId) {
        throw new UnsupportedOperationException("STUB");
    }

    public final LoadedApk getPackageInfo(ApplicationInfo ai, CompatibilityInfo compatInfo,
                                          int flags) {
        throw new UnsupportedOperationException("STUB");
    }

    public final LoadedApk getPackageInfoNoCheck(ApplicationInfo ai,
                                                 CompatibilityInfo compatInfo) {
        throw new UnsupportedOperationException("STUB");
    }

    public final LoadedApk peekPackageInfo(String packageName, boolean includeCode) {
        throw new UnsupportedOperationException("STUB");
    }


//    public ApplicationThread getApplicationThread()
//    {
//        throw new UnsupportedOperationException("STUB");
//    }

    public Instrumentation getInstrumentation()
    {
        throw new UnsupportedOperationException("STUB");
    }

    public boolean isProfiling() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getProfileFilePath() {
        throw new UnsupportedOperationException("STUB");
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException("STUB");
    }

    public Application getApplication() {
        throw new UnsupportedOperationException("STUB");
    }

    public String getProcessName() {
        throw new UnsupportedOperationException("STUB");
    }

    public ContextImpl getSystemContext() {
        throw new UnsupportedOperationException("STUB");
    }

    public void installSystemApplicationInfo(ApplicationInfo info, ClassLoader classLoader) {
        throw new UnsupportedOperationException("STUB");
    }


    public static void dumpMemInfoTable(PrintWriter pw, Debug.MemoryInfo memInfo, boolean checkin,
                                        boolean dumpFullInfo, boolean dumpDalvik, boolean dumpSummaryOnly,
                                        int pid, String processName,
                                        long nativeMax, long nativeAllocated, long nativeFree,
                                        long dalvikMax, long dalvikAllocated, long dalvikFree) {

        throw new UnsupportedOperationException("STUB");
    }

//    public void registerOnActivityPausedListener(Activity activity,
//            OnActivityPausedListener listener) {
//        throw new UnsupportedOperationException("STUB");
//    }
//
//    public void unregisterOnActivityPausedListener(Activity activity,
//            OnActivityPausedListener listener) {
//        throw new UnsupportedOperationException("STUB");
//    }

    public final ActivityInfo resolveActivityInfo(Intent intent) {
        throw new UnsupportedOperationException("STUB");
    }

//    public final Activity startActivityNow(Activity parent, String id,
//                                           Intent intent, ActivityInfo activityInfo, IBinder token, Bundle state,
//                                           Activity.NonConfigurationInstances lastNonConfigurationInstances) {
//        throw new UnsupportedOperationException("STUB");
//    }

    public final Activity getActivity(IBinder token) {
        throw new UnsupportedOperationException("STUB");
    }

    public final void sendActivityResult(
            IBinder token, String id, int requestCode,
            int resultCode, Intent data) {
        throw new UnsupportedOperationException("STUB");
    }

//    public void handleRequestAssistContextExtras(RequestAssistContextExtras cmd) {
//        throw new UnsupportedOperationException("STUB");
//    }

    public void handleTranslucentConversionComplete(IBinder token, boolean drawComplete) {
        throw new UnsupportedOperationException("STUB");
    }

    public void onNewActivityOptions(IBinder token, ActivityOptions options) {
        throw new UnsupportedOperationException("STUB");
    }

    public void handleCancelVisibleBehind(IBinder token) {
        throw new UnsupportedOperationException("STUB");
    }

    public void handleOnBackgroundVisibleBehindChanged(IBinder token, boolean visible) {
        throw new UnsupportedOperationException("STUB");
    }

    public void handleInstallProvider(ProviderInfo info) {
        throw new UnsupportedOperationException("STUB");
    }

    /**
     * Return the Intent that's currently being handled by a
     * BroadcastReceiver on this thread, or null if none.
     * @hide
     */
    public static Intent getIntentBeingBroadcast() {
        throw new UnsupportedOperationException("STUB");
    }

//    public final ActivityClientRecord performResumeActivity(IBinder token,
//            boolean clearHide, String reason) {
//        throw new UnsupportedOperationException("STUB");
//    }
//
//    public final ActivityClientRecord performDestroyActivity(IBinder token, boolean finishing) {
//        return performDestroyActivity(token, finishing, 0, false);
//    }
//
//    /**
//     * @param preserveWindow Whether the activity should try to reuse the window it created,
//     *                        including the decor view after the relaunch.
//     */
//    public final void requestRelaunchActivity(IBinder token,
//                                              List<ResultInfo> pendingResults, List<ReferrerIntent> pendingNewIntents,
//                                              int configChanges, boolean notResumed, Configuration config,
//                                              Configuration overrideConfig, boolean fromServer, boolean preserveWindow) {
//        throw new UnsupportedOperationException("STUB");
//    }

    public final void applyConfigurationToResources(Configuration config) {
        throw new UnsupportedOperationException("STUB");
    }

    /**
     * Public entrypoint to stop profiling. This is required to end profiling when the app crashes,
     * so that profiler data won't be lost.
     *
     */
    public void stopProfiling() {
        throw new UnsupportedOperationException("STUB");
    }

//    public final IContentProvider acquireProvider(
//            Context c, String auth, int userId, boolean stable) {
//        throw new UnsupportedOperationException("STUB");
//    }
//
//    public final IContentProvider acquireExistingProvider(
//            Context c, String auth, int userId, boolean stable) {
//        throw new UnsupportedOperationException("STUB");
//    }
//
//    public final boolean releaseProvider(IContentProvider provider, boolean stable) {
//        throw new UnsupportedOperationException("STUB");
//    }

    public static ActivityThread systemMain() {
        throw new UnsupportedOperationException("STUB");
    }

    public final void installSystemProviders(List<ProviderInfo> providers) {
        throw new UnsupportedOperationException("STUB");
    }

    public int getIntCoreSetting(String key, int defaultValue) {
        throw new UnsupportedOperationException("STUB");
    }

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB");
    }
}
