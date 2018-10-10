package br.com.fernandonascimento.componentesandroid

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIdService: FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        //Obter o InstanceID token atualizado
        val token = FirebaseInstanceId.getInstance().token
        Log.i("Token", token)


    }
}
