package com.e.customdialogexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.e.customdialoglibrary.CustomDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonShowDialog.setOnClickListener {

            val dialog = CustomDialog(
                context = this,
                icon = R.drawable.ic_tick,
                title = "Submitted Successfully",
                description = "your transaction has been submitted\nsuccessfully",
                buttonFirstText = "Done",
                buttonFirstBackgroundColor = R.color.colorPrimary,
                buttonFirstFontColor = R.color.colorWhite,
                buttonSecondText = "Cancel",
                buttonSecondBackgroundColor = R.color.colorLightRed,
                buttonSecondFontColor = R.color.colorWhite,
                cancelButton = true,
                setCancelable = false,
                secondButton = false
            )

            dialog.show()

            // click handling
            dialog.onCancelDialog = { dialog.dismiss() }

            dialog.onPerformAction = {
                Toast.makeText(this, "hye , how are you!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}