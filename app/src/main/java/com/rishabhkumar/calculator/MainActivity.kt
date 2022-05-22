package com.rishabhkumar.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rishabhkumar.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAC.setOnClickListener {
            binding.txtInput.text = ""
            binding.txtOutput.text = ""
        }

        binding.btnZero.setOnClickListener {
            binding.txtInput.append("0")
        }

        binding.btnOne.setOnClickListener {
            binding.txtInput.append("1")
        }

        binding.btnTwo.setOnClickListener {
            binding.txtInput.append("2")
        }

        binding.btnThree.setOnClickListener {
            binding.txtInput.append("3")
        }

        binding.btnFour.setOnClickListener {
            binding.txtInput.append("4")
        }

        binding.btnFive.setOnClickListener {
            binding.txtInput.append("5")
        }

        binding.btnSix.setOnClickListener {
            binding.txtInput.append("6")
        }

        binding.btnSeven.setOnClickListener {
            binding.txtInput.append("7")
        }

        binding.btnEight.setOnClickListener {
            binding.txtInput.append("8")
        }

        binding.btnNine.setOnClickListener {
            binding.txtInput.append("9")
        }


        binding.btnPlus.setOnClickListener {
            binding.txtInput.append("+")
        }

        binding.btnMinus.setOnClickListener {
            binding.txtInput.append("-")
        }

        binding.btnMultiplication.setOnClickListener {
            binding.txtInput.append("*")
        }

        binding.btnDivide.setOnClickListener {
            binding.txtInput.append("/")
        }

        binding.btnDot.setOnClickListener {
            binding.txtInput.append(".")
        }

        binding.btnStartBracket.setOnClickListener {
            binding.txtInput.append("(")
        }

        binding.btnEndBracket.setOnClickListener {
            binding.txtInput.append(")")
        }

        binding.btnEquals.setOnClickListener {
            val expression = ExpressionBuilder(binding.txtInput.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if(result == longResult.toDouble()){
                binding.txtOutput.text = longResult.toString()
            }else{
                binding.txtOutput.text = result.toString()
            }
        }

    }
}