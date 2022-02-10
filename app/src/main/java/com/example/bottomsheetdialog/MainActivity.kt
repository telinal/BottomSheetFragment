package com.example.bottomsheetdialog

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var textView: TextView
    // creating a variable for our button
    lateinit var imagebottonSheet: Button
    lateinit var textbottonSheet: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageViewDisplay)
        textView = findViewById(R.id.textViewDisplay)
        // initializing our variable for button with its id.
        imagebottonSheet = findViewById(R.id.imageDialogId)
        textbottonSheet = findViewById(R.id.textDialogId)

        // creating a new bottom sheet dialog.
        val imageDialog = ImageBottomSheetFragment( onClick = { image ->
            imageView.setImageResource(image)
        })
        val textDialog = TextBottomSheetFragment(onType = {
            textView.text = it
        })
        // adding on click listener for our button.
        imagebottonSheet.setOnClickListener {
            // set cancelable
            // closing of dialog box when clicking on the screen.
            imageDialog.setCancelable(true)
//            // on below line we are calling
//            // a show method to display a dialog.
            imageDialog.show(supportFragmentManager, "BottomSheetDialog")

        }
        textbottonSheet.setOnClickListener {
            textDialog.setCancelable(true)
            textDialog.show(supportFragmentManager, "TextBottomSheetDialog")
        }





    }
}