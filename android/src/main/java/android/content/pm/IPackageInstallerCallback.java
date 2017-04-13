/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/content/pm/IPackageInstallerCallback.aidl
 */
package android.content.pm;

public interface IPackageInstallerCallback extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements IPackageInstallerCallback {
        private static final String DESCRIPTOR = "android.content.pm.IPackageInstallerCallback";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an android.content.pm.IPackageInstallerCallback interface,
         * generating a proxy if needed.
         */
        public static IPackageInstallerCallback asInterface(android.os.IBinder obj) {
            throw new UnsupportedOperationException("STUB");
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            throw new UnsupportedOperationException("STUB");
        }

    }

    public void onSessionCreated(int sessionId) throws android.os.RemoteException;

    public void onSessionBadgingChanged(int sessionId) throws android.os.RemoteException;

    public void onSessionActiveChanged(int sessionId, boolean active) throws android.os.RemoteException;

    public void onSessionProgressChanged(int sessionId, float progress) throws android.os.RemoteException;

    public void onSessionFinished(int sessionId, boolean success) throws android.os.RemoteException;
}
