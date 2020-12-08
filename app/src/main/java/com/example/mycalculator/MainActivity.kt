package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var check_if_Decimal_present= false//Used to prevent user from adding more than 1 decimal dot
        fun NumberClickEvent(view:View)
        {
            // TO get which Number is selected by the user
            val NumberId= view as Button
            //To append the current selected Number in our current Number
            //DisplayNum extracts the current number from the screen.
            var NumberSelected:String=DisplayNum.text.toString()
            when(NumberId.id)
            {
                Num0.id->{
                    NumberSelected+="0"
                }
                Num1.id->{
                    NumberSelected+="1"
                }
                Num2.id->{
                    NumberSelected+="2"
                }
                Num3.id->{
                    NumberSelected+="3"
                }
                Num4.id->{
                    NumberSelected+="4"
                }
                Num5.id->{
                    NumberSelected+="5"
                }
                Num6.id->{
                    NumberSelected+="6"
                }
                Num7.id->{
                    NumberSelected+="7"
                }
                Num8.id->{
                    NumberSelected+="8"
                }
                Num9.id->{
                    NumberSelected+="9"
                }
                NumDecimal.id->{
                    //1st condition :if user only enters "." consider it as "0."
                    //2nd condition:if user enters dot when string only contains "-"
                    //so in 2nd condition our new string becomes "-0."
                    if(NumberSelected.length==0 || (NumberSelected.length==1 && NumberSelected.elementAt(0)=='-'))
                        NumberSelected+="0"
                    if(check_if_Decimal_present==false)
                            NumberSelected+="."
                    check_if_Decimal_present=true
                }
                PlusMinus.id->{
                    NumberSelected="-"+NumberSelected
                }
            }
            DisplayNum.setText(NumberSelected)
        }

}