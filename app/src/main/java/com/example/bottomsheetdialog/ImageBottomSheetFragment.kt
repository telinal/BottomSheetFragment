package com.example.bottomsheetdialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ImageBottomSheetFragment(
    private val onClick: (Int) -> Unit
) : BottomSheetDialogFragment(), View.OnClickListener {

    private var iListener: AdapterView.OnItemClickListener? = null
    lateinit var recyclerView: RecyclerView
    lateinit var arrayList: IntArray
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewId)
        recyclerView.layoutManager = GridLayoutManager(requireActivity(), 3)


        arrayList = intArrayOf(
            R.drawable.image1,
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.image5,
            R.drawable.images6,
            R.drawable.image7,
            R.drawable.images8,
            R.drawable.images9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15
        )

        recyclerView.isClickable = true
        recyclerView.adapter = MyAdapter(arrayList, onItemClickListener = { image ->
            onClick.invoke(image)
            dismiss()

        })

//        recyclerView.setOnClickListener {
//            val imageList: IntArray = arrayList
//            val intent = Intent(requireActivity(), MainActivity::class.java)
//            intent.putExtra("image", imageList)
//            startActivity(intent)
//
//            Toast.makeText(requireActivity(), "image has been clicked", Toast.LENGTH_SHORT).show()
//
//        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}