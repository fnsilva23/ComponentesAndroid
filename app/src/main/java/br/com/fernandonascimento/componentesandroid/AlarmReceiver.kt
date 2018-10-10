package br.com.fernandonascimento.componentesandroid

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, NotificationUtils::class.java)
        service.putExtra("MSG", "Teste")
        context?.startService(service)
    }
}