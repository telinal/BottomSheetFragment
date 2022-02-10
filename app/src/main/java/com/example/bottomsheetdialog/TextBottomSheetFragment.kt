package com.example.bottomsheetdialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class TextBottomSheetFragment(private val onType: (String) -> Unit): BottomSheetDialogFragment(), View.OnClickListener {

    lateinit var edittextBox: EditText
    lateinit var edittextBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edittextBox = view.findViewById(R.id.editTextDialog)
        edittextBtn = view.findViewById(R.id.edittextBtn)


        edittextBtn.setOnClickListener {
            val text = edittextBox.text.toString()
            onType.invoke(text)
            dismiss()
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}