package br.com.yotivmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    //toda vez que mContador receber dados, o MainActivity sera avisado
    var mContador= MutableLiveData<String>().apply { value= contador.toString() }
    private var contador:Int = 0

    private fun setmContador(){
        mContador.value= contador.toString()
    }

    private fun validaContador() {
        contador++
        if(contador>5){
            contador=0
        }
        setmContador()
    }

    fun Contador(){
        validaContador()
    }
}