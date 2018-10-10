package br.com.fernandonascimento.componentesandroid


import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btBotaoUm.setOnClickListener{
            val alarmeManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val alarmIntent = Intent(this,AlarmReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(this,0,alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT)
            alarmeManager.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().timeInMillis + 5000,  pendingIntent)
        }

        btBotaoDois.setOnClickListener(){
            NotificationUtils
                    .showNotification(this,

                            1234,
                            "CHANNEL_BOTAO_DOIS",
                            "CHANNEL_BOTAO_DOIS_NAME",
                            "Hello Notification",
                            "Esta é minha primeira notificação no Android")
        }
    }
}
