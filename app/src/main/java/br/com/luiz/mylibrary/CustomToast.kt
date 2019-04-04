package br.com.luiz.mylibrary

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

class CustomToast {

    fun showToast(context: Context , message: String) {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customToastRoot = inflater.inflate(R.layout.custom_toast, null) as View
        val customToast = Toast(context)

        customToast.view = customToastRoot

        customToastRoot.tv_toast.text = message

        customToast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0,0)
        customToast.duration = Toast.LENGTH_LONG
        customToast.show()


    }

}