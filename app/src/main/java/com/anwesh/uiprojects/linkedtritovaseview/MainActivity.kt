package com.anwesh.uiprojects.linkedtritovaseview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.tritovaseview.TriToVaseView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TriToVaseView.create(this)
    }
}
