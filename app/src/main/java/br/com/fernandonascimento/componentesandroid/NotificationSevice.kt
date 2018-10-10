package br.com.fernandonascimento.componentesandroid

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationSevice: IntentService("") //intent service abre a thread assincrona automaticamente
{
    override fun onHandleIntent(intent: Intent?) {
        val msg1 = intent?.getStringExtra("MSG")
        val msg2 = intent?.getStringExtra("MSG2")
        Log.i("HEIDER",msg1)//grava no log - nao deve ser usado em produção
        Log.i("HEIDER",msg2)//grava no log - nao deve ser usado em produção
    }
}