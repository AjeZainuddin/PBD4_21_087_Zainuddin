package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecycleview : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.iofi,
            R.drawable.moona,
            R.drawable.risu,
            R.drawable.ollie,
            R.drawable.reine,
            R.drawable.anya,
            R.drawable.kobo,
            R.drawable.zeta,
            R.drawable.kaela,
        )

        heading = arrayOf(
            "Airani Iofifteen Hololive ID Gen 1",
            "Moona Hoshinova Hololive ID Gen 1",
            "Ayunda Risu Hololive ID Gen 1  ",
            "Kureiji Ollie Hololive ID Gen 2",
            "Reine Pavalia Hololive ID Gen 2",
            "Anya Melfissa Hololive ID Gen 2",
            "Kobo Kanaeru Hololive ID Gen 3",
            "Vestia Zeta Hololive ID Gen 3",
            "Kaela Kovalskia Hololive ID Gen 3"
        )

        newRecycleview = findViewById(R.id.recycleview)
        newRecycleview.layoutManager = LinearLayoutManager(this)
        newRecycleview.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()


    }

    private fun getUserdata() {

        for (i in imageId.indices){

            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        newRecycleview.adapter = MyAdapter(newArrayList)
    }
}