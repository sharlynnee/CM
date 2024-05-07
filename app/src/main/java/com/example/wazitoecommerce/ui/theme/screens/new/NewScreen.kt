package com.example.wazitoecommerce.ui.theme.screens.new

import android.os.Bundle
import android.view.View.generateViewId
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.wazitoecommerce.R

class DashboardActivity : AppCompatActivity() {

    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var tvChildName: TextView
    private lateinit var btnLocate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create ConstraintLayout
        constraintLayout = ConstraintLayout(this)
        constraintLayout.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        // Initialize TextView for Child's Name
        tvChildName = TextView(this)
        tvChildName.id = generateViewId()
        tvChildName.text = "Child's Name"
        constraintLayout.addView(tvChildName)

        // Initialize Button for Locate
        btnLocate = Button(this)
        btnLocate.id = generateViewId()
        btnLocate.text = "Locate"
        constraintLayout.addView(btnLocate)

        // Apply constraints programmatically
        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)

        // Connect TextView constraints
        constraintSet.connect(
            tvChildName.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            resources.getDimensionPixelSize(R.dimen.margin_top)
        )
        constraintSet.connect(
            tvChildName.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            resources.getDimensionPixelSize(R.dimen.margin_start)
        )

        // Connect Button constraints
        constraintSet.connect(
            btnLocate.id,
            ConstraintSet.TOP,
            tvChildName.id,
            ConstraintSet.BOTTOM,
            resources.getDimensionPixelSize(R.dimen.margin_top)
        )
        constraintSet.connect(
            btnLocate.id,
            ConstraintSet.START,
            ConstraintSet.PARENT_ID,
            ConstraintSet.START,
            resources.getDimensionPixelSize(R.dimen.margin_start)
        )

        // Apply constraints to ConstraintLayout
        constraintSet.applyTo(constraintLayout)

        setContentView(constraintLayout)
    }
}
