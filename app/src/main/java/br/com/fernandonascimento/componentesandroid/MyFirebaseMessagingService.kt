package br.com.fernandonascimento.componentesandroid

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService(){
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)

        Log.d("NOTIFICACAO_TITULO", remoteMessage?.notification?.body);
        Log.d("NOTIFICACAO_BODY", remoteMessage?.notification?.title);

        NotificationUtils
                .showNotification(this,
                        123456789,
                        "PUSH",
                        "PUSH",
                        remoteMessage?.notification?.title!!,
                        remoteMessage?.notification?.body!!)
    }
}