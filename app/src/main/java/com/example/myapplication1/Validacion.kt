package com.example.myapplication1

import android.widget.EditText

object Validacion{
    fun passwordValida(editpassword: EditText):Boolean{
        if (this.toString().isNotEmpty() && this.toString().length.compareTo(6)==1){
            return true
        }else{
            return false
        }
    }
}