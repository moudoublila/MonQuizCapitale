package com.esiea.monquiz.Presentation.main

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.R
import androidx.appcompat.app.AlertDialog
import com.esiea.monquiz.Data.QuizCapitale



class Quiz : AppCompatActivity() {

    var quizs= arrayListOf<QuizCapitale>()
    var numberOfGoodAnswer: Int=0
    var currentQuizIndex: Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        quizs.add(
            QuizCapitale(
                question = "Quelle est la capitale de la France ?",
                r1 = "Paris",
                r2 = "Tunis",
                r3 = "Londre",
                correctanswerNbr = 1
            )
        )
        quizs.add(
            QuizCapitale(
                question = "Quelle est la capitale de l'Algerie  ?",
                r1 = "Paris",
                r2 = "Alger",
                r3 = "Londre",
                correctanswerNbr = 2
            )
        )
        quizs.add(
            QuizCapitale(
                question = "Quelle est la capitale de la Russie?",
                r1 = "Mouscou",
                r2 = "Lille",
                r3 = "Bejaia",
                correctanswerNbr = 1
            )
        )
        quizs.add(
            QuizCapitale(
                question = "Quelle est la capitale de l'Allemagne ?",
                r1 = "Paris",
                r2 = "Tunis",
                r3 = "Berlin",
                correctanswerNbr = 3
            )
        )
    }



    showQuestion(quizs.get(currentQuizIndex))
fun showQuestion(quiz:QuizCapitale){

    txtQution.setText(quiz.question)
    r1.setText(quiz.r1)
    r2.setText(quiz.r2)
    r3.setText(quiz.r3)

}
    fun handleAnswer(answerID:Int){

val quiz =quizs.get(currentQuizIndex)
        if(quiz.isCorrect(answerID)){
            numberOfGoodAnswer++
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()

        }else
            Toast.makeText(this, "+0", Toast.LENGTH_SHORT).show()
        //pouvoir allez a la question suivante
        currentQuizIndex++
        if(currentQuizIndex >= quizs.size){
            //partie terminé
//alert dialogue
            var alert= AlertDialog.Builder(this)
            alert.setTitle("Partie terminée")
            alert.setMessage("Vous avez eu : "+numberOfGoodAnswer +"Bonne(s) reponses")
            alert.setPositiveButton("ok"){

                dialog: DialogInterface?, which: Int ->
                finish()
            }
            alert.show()
        }else{

            //on continue
            showQuestion(quizs.get(currentQuizIndex))
        }
    }
    fun onclickanser1(view: View){

        handleAnswer(1)
    }
    fun onclickanser2(view: View){
        handleAnswer(2)
    }
    fun onclickanser3(view: View){
        handleAnswer(3)

    }
}